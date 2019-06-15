package com.xue.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author xuesong <songxue@wisedu.com>
 */
public class ColorFactoryBean implements FactoryBean {
	@Override
	public Color getObject() throws Exception {
		return new Color();
	}

	@Override
	public Class<?> getObjectType() {
		return Color.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
