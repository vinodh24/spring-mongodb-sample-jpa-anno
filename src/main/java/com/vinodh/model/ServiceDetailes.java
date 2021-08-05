package com.vinodh.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Document(collection = "services")
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
public class ServiceDetailes {
	@Id
	private String id;
	@JsonProperty("DataServices")
	private DataService dataServices;
	private Common common;
	private Port port;
	@JsonProperty("VoiceServices")
	private VoiceService voiceServices;
	@JsonProperty("VideoServices")
	private VideoService videoServices;
	@JsonProperty("OntService")
	private OntService ontService;
}
