package com.vinodh.model;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
public class OntService {
	private String nodeName;
	private String actiontype;
	private String ipaddress;
	private String emsPassword;
	private String serialNumber;
	private String emsIpAddress;
	private String ontprofName;
	private String portName;
	private String voiceSvctagactionName;
	private String portType;
	private String voiceSvctagaction;
	private String emsUserName;
	private String vendor;
	private String voiceVlan;
	private String registrationId;
	private String emsName;
	private String model;
	private String emsStartPort;
	private String ontProfile;
	private String ontId;
	private String username;

}
