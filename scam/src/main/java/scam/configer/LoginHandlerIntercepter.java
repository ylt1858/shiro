package scam.configer;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author y'l'l
 */
public class LoginHandlerIntercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登录成功后放行
        HttpSession session;
        Object loginUsername = request.getSession().getAttribute("username");
        //没有登录
        if (loginUsername  == null ){
            request.setAttribute("msg","没有登录请先登录");
            request.getRequestDispatcher("/admin/login").forward(request,response);
            return false;
        }else {
            return true;
        }

    }
}
