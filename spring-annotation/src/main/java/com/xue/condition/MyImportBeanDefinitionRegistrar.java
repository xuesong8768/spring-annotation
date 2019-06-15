package com.xue.condition;

import com.xue.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author xuesong <songxue@wisedu.com>
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	/**
	 *
	 * @param importingClassMetadata  当前类的注解信息
	 * @param registry 把所有需要添加到容器中的bean，BeanDefinitionRegistry.registerBeanDefinition  手工注册
	 */
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		boolean red = registry.containsBeanDefinition("com.xue.bean.Red");
		boolean blue = registry.containsBeanDefinition("com.xue.bean.Blue");
		if (red && blue){
			RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(RainBow.class);
			registry.registerBeanDefinition("rainBow",rootBeanDefinition);
		}
	}
}
