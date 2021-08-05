package com.vinodh.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vinodh.config.SpringMongoConfig;
import com.vinodh.model.Common;
import com.vinodh.service.AnnoDaoOperation;

public class AnnoPropertMongoRepositoryTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
		AnnoDaoOperation repository = (AnnoDaoOperation) ctx.getBean(AnnoDaoOperation.class);
		Common common=new Common();
		common.setId("vinodh");
		common.setPortName("vinodh prot name");
		common.setSubscriberId("vinodh12345");
		common.setTechnology("microservices");
		System.out.println("common:::::::"+common);
		try {
			repository.save(common);
		}catch (Exception e) {
			e.printStackTrace();
		}
		ctx.close();
	}
}
