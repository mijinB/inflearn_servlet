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

        /*
        뷰 리졸버 - InternalResourceViewResolver
        : 스프링 부트는 InternalResourceViewResolver 라는 뷰 리졸버를 자동으로 등록하는데,
          이때 application.properties 에 등록한 spring.mvc.view.prefix , spring.mvc.view.suffix 설정 정보를 사용해서 등록한다.
           ⇒ ServletApplication 파일의 주석 ViewResolver 참고
         */
        return new ModelAndView("new-form");
    }
}
