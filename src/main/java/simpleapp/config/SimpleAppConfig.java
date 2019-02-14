package simpleapp.config;

import javax.sql.DataSource;

// import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import simpleapp.service.DataService;
import simpleapp.service.impl.DataServiceImpl;

@Configuration
@PropertySource(value = { "classpath:application.properties" })
public class SimpleAppConfig {
	
	@Autowired
    private Environment envProps;
	
	@Bean 
	public DataService dataService(){
		return new DataServiceImpl();
	}
	
	/*
	@Bean
	@ConfigurationProperties("app.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	} */
}
