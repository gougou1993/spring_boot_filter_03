package com.zhong.spring_boot_filter_03.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * springboot 整合filter方式之一
 * 
 * 以前web.xml配置：
 * <filter>
 *      <filter-name>FirstFilter</filter-name>
 *      <filter-class>com.zhong.spring_boot_filter_03.filter.FirstFilter</filter-class>
 * </filter>
 * 
 * <filter-mapping>
 *       <filter-name>FirstFilter</filter-name>
 *       <url-pattern>/first</url-pattern>
 * </filter-mapping>
 * 
 * FirstFilter
 */
@WebFilter(value="FirstFilter",urlPatterns = {"/filter"})
public class FirstFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
                System.out.println("进入 FirstFilter ");
                chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

    
}