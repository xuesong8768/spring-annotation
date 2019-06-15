package com.xue.config;

import com.xue.bean.Person;
import com.xue.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author xuesong <songxue@wisedu.com>
 */
//@ComponentScan(value = "com.xue")
//@ComponentScan(value = "com.xue",excludeFilters = {
//		@Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
//})

@Configuration
@ComponentScan(value = "com.xue",includeFilters = {
		@Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
		@Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookService.class})
},useDefaultFilters = false)
public class MainConfig {

	//类型为返回值的类型，id默认为方法名
	@Bean(value = "person")
	public Person person(){
		return new Person("xuesong",20);
	}

}
