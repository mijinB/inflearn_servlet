package hello.servlet.basic.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import hello.servlet.basic.HelloData;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "responseJsonServlet", urlPatterns = "/response-json")
public class ResponseJsonServlet extends HttpServlet {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Content-Type: application/json
        response.setContentType("application/json");
//        response.setCharacterEncoding("utf-8"); application/json 은 스펙상 utf-8 형식을 사용하도록 정의되어 있기 때문에 추가해도 의미 없는 파라미터일 뿐이다.

        HelloData helloData = new HelloData();
        helloData.setUsername("kim");
        helloData.setAge(20);

        // {"username": "kim", "age": 20}
        String result = objectMapper.writeValueAsString(helloData);
        response.getWriter().write(result);
    }
}
