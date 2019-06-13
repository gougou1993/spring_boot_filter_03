package com.zhong.spring_boot_filter_03;

import com.zhong.spring_boot_filter_03.filter.SecondFilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * App2 springboot 整合filter方式2
 */
@SpringBootApplication
public class App2 {

    public static void main(String[] args) {
        SpringApplication.run(App2.class, args);
    }
    /**
     * 注册filter
     * @return
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean  bean = new FilterRegistrationBean(new SecondFilter());
        //bean.addUrlPatterns(new String[]{"*.do","*.jsp"});
        bean.addUrlPatterns("/firstServlet");
        return bean;
    }
}