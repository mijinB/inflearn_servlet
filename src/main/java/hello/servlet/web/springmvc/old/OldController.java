package hello.servlet.web.springmvc.old;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/*
OldController 는
BeanNameUrlHandlerMapping < HandlerMapping 을 사용했고
SimpleControllerHandlerAdapter < HandlerAdapter 를 사용했다.
 */
@Component("/springmvc/old-controller")     // OldController 의 스프링 빈 이름이 /springmvc/old-controller
public class OldController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handleRequest");
        return null;
    }
}
