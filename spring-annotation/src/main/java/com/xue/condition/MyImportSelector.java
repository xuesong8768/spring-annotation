package com.xue.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author xuesong <songxue@wisedu.com>
 *     自定义逻辑，返回需要导入的组建
 */
public class MyImportSelector implements ImportSelector {

	//返回值就是导入到容器中的组建全类名
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.xue.bean.Yellow","com.xue.bean.Blue"};
	}
}
