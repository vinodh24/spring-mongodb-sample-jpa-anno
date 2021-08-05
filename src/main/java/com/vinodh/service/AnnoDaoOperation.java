package com.vinodh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vinodh.model.Common;
import com.vinodh.repository.CommonRepository;
@Component
public class AnnoDaoOperation {
	@Autowired
	private CommonRepository commonRepository;

	public void save(Common Common) {
		System.out.println(commonRepository + "   Common   :::" + Common);
		commonRepository.save(Common);
	}
}
