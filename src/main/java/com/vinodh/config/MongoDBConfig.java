package com.vinodh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ServerAddress;

@Configuration
@EnableMongoRepositories(basePackages = "com.vinodh")
@ComponentScan(basePackages = "com.vinodh")
public class MongoDBConfig extends AbstractMongoConfiguration {
	@Override
	public String getDatabaseName() {
		return "vinodh";
	}
	
	@Override@Bean
	public Mongo mongo() throws Exception {
		ServerAddress address = new ServerAddress("localhost", 27017);
		MongoClientOptions options = new MongoClientOptions.Builder().build();
		MongoClient client = new MongoClient(address, options);
		return client;
	}
}