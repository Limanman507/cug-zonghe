package com.cug.mall.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class UploadMapping implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //设置亲求路径和文件物理路径的映射关系
        registry.addResourceHandler("/upfile/**").addResourceLocations("file:F:/MallProjImg/");
    }
}
