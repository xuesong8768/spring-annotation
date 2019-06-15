package com.xue.config;

import com.xue.bean.Color;
import com.xue.bean.ColorFactoryBean;
import com.xue.bean.Person;
import com.xue.bean.Red;
import com.xue.condition.LinuxCondition;
import com.xue.condition.MyImportBeanDefinitionRegistrar;
import com.xue.condition.MyImportSelector;
import com.xue.condition.WindowCondition;
import org.springframework.context.annotation.*;

/**
 * @author xuesong <songxue@wisedu.com>
 */
//@ComponentScan(value = "com.xue")
//@ComponentScan(value = "com.xue",excludeFilters = {
//		@Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
//})

@Configuration
@Conditional(WindowCondition.class)
//快速导入组建，id默认是组建的全类名
@Import({Color.class, Red.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {

	@Bean(value = "person2")
	@Lazy
	@Scope
	//如果是prototype，
	public Person person(){
		System.out.println("给容器中添加person");
		return new Person("薛松",20);
	}

	//如果系统是windows,则注册bill
//	@Conditional ({WindowCondition.class})
	@Bean("bill")

	public Person person01(){
		return new Person("Bill Gates",50);
	}

	//如果系统是linux,则注册linux
	@Bean("linux")
	@Conditional(LinuxCondition.class)
	public Person person02(){
		return new Person("linux_lolo",40);
	}

	@Bean
	public ColorFactoryBean colorFactoryBean(){
		return new ColorFactoryBean();
	}

}
