package com.wu.ionicservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


//添加配置，使得静态资源可以直接被访问,  MyURLPatternConfiguration和UploadDownloadController的效果是一样的
@Configuration
public class MyURLPatternConfiguration extends WebMvcConfigurationSupport {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/img/**").addResourceLocations("classpath:/static/img/");
		registry.addResourceHandler("/static/excel/**").addResourceLocations("classpath:/static/excel/");
		super.addResourceHandlers(registry);
	}
}
