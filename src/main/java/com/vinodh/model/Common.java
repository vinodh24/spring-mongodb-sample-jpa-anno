package com.vinodh.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties
public class Common {
	private String subscriberId;
	private String portName;
	private String id;
	private String technology;
}
