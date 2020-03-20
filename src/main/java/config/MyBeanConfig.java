package config;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
		"repository",
		"service",
		"domain",
		"report"
})
public class MyBeanConfig {

}
