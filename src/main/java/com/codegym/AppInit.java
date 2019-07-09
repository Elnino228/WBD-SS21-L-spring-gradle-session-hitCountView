package com.codegym;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Autowired
    protected Class<?>[] getRootConfigClasses(){
        return new Class[]{AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses(){
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings(){
        return new String[]{"/"};
    }
}
