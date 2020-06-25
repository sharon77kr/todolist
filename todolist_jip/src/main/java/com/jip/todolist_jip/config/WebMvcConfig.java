package com.jip.todolist_jip.config;

import java.nio.charset.Charset;

import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
public class WebMvcConfig {

	@Bean
	public Filter characterEncodingFilter() {
		//웹 요청/응답에 대한 Encoding 설정
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding("UTF-8");
		filter.setForceEncoding(true);
		return filter;
	}
	
	@Bean
	public HttpMessageConverter<String> responseBodyConverter() {
		//@ResponseBody 응답에 대한 Encoding 설정
		return new StringHttpMessageConverter(Charset.forName("UTF-8"));
	}
	
//	@Bean
//	public CommonsMultipartResolver multipartResolver() {
//		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
//		resolver.setDefaultEncoding("UTF-8");
//		resolver.setMaxUploadSizePerFile(1024 * 1024 * 5);
//		return resolver;
//	}
	
	@Bean
	public HiddenHttpMethodFilter methodFilter() {
		HiddenHttpMethodFilter filter = new HiddenHttpMethodFilter();
		return filter;
	}
	
}
