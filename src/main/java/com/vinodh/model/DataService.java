package com.vinodh.model;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
public class DataService {
	private String nodeName;
	private String actiontype;
	private String ipaddress;
	private String audit_technology;
	private String emsId;
	private String serviceOrder;
	private String portName;
	private String bwprofileName;
	@JsonProperty("sTag")
	private String sTag;
	private String emsUserName;
	private String audit_ipaddress;
	private String vendor;
	private String bwprofile;
	@JsonProperty("cTag")
	private String cTag;
	private String outtag;
	private String modal;
	private String departmentName;
	private String actualPortDbId;
	private String spEmsId;
	private String svctagactionName;
	private String subscriberId;
	private String intag;
	private String portType;
	//private String nodeDbId;
	private String svctagaction;
	private String actualPortName;
	//private String portDbId;
	private String emsName;
	private String isFallbacktechnology;
	
}
