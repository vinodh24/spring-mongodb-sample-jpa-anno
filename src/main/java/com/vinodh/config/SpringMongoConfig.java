package com.vinodh.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ServerAddress;

@Configuration
@EnableMongoRepositories(basePackages = "com.vinodh")
@ComponentScan(basePackages = "com.vinodh")
@PropertySource("classpath:application.properties")
public class SpringMongoConfig extends AbstractMongoConfiguration {
   
	@Value("${spring.data.mongodb.host}")
    private String mongoHost;
    
	@Value("${spring.data.mongodb.port}")
    private Integer mongoPort;

	@Value("${spring.data.mongodb.database}")
    private String mongoDB;

    @Override
    public MongoMappingContext mongoMappingContext()
        throws ClassNotFoundException {
        return super.mongoMappingContext();
    }
   
    @Override @Bean
    public Mongo mongo() throws Exception {
       	ServerAddress address = new ServerAddress(mongoHost, mongoPort);
		MongoClientOptions options = new MongoClientOptions.Builder().build();
		MongoClient client = new MongoClient(address, options);
		return client;
    }
   
    @Override
    protected String getDatabaseName() {
        return mongoDB;
    }
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
