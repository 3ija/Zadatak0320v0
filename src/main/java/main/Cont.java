package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.MyBeanConfig;

public class Cont {
	public static BeanFactory container = new AnnotationConfigApplicationContext(MyBeanConfig.class);
}
