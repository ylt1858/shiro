package scam.configer;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//扩展mvc，官方建议这样来做不能加@EnableWebMvc

@Configuration
public class MyMvcConfiguration implements WebMvcConfigurer {
//        拦截器
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginHandlerIntercepter())
//                //.addPathPatterns("/**").
//                .addPathPatterns("/main.html").
//                excludePathPatterns("/index.html","/","/user/login","classpath:/templates/");
//    }
    /*视图跳转*/
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("student");
        registry.addViewController("/student").setViewName("student");
        registry.addViewController("/teacher").setViewName("teacher");
        registry.addViewController("/style.css").setViewName("style.css");
        registry.addViewController("/addstudent.html").setViewName("addstudent");
        registry.addViewController("/addteacher.html").setViewName("addteacher");
    }


}
