package scam.configer;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
//扩展mvc，官方建议这样来做不能加@EnableWebMvc

@Configuration
public class MyMvcConfiguration implements WebMvcConfigurer {
//        拦截器
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginHandlerIntercepter())
//                .addPathPatterns("/**").
//                excludePathPatterns("/","/admin/login","classpath:/templates/","classpath:/static/*","/asserts/**","/webjars/**");
//    }
    /*视图跳转*/
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/student").setViewName("student");
        registry.addViewController("/teacher").setViewName("teacher");
        registry.addViewController("/style.css").setViewName("style.css");
        registry.addViewController("/addstudent.html").setViewName("addstudent");
        registry.addViewController("/addteacher.html").setViewName("addteacher");
        registry.addViewController("/addmatch.html").setViewName("addmatch");
        registry.addViewController("/addapply.html").setViewName("addapply");
        registry.addViewController("/admin/login").setViewName("login");
    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
//    }
}
