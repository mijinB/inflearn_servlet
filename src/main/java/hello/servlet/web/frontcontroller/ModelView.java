package hello.servlet.web.frontcontroller;

import java.util.HashMap;
import java.util.Map;

public class ModelView {

    private String viewName;
    // request 객체를 Model 로(setAttribute) 사용하는 대신 별도의 Model 객체를 만들어서 반환. (JSP 는 request.getAttribute 를 사용하기 때문에 setAttribute 는 해줘야 한다. ⇒ MyView 클래스의 modelToRequestAttribute)
    private Map<String, Object> model = new HashMap<>();

    public ModelView(String viewName) {
        this.viewName = viewName;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }
}
