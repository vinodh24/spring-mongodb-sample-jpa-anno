package com.vinodh.model;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
public class Port {
	private String us_vectoring;
	private String emsId;
	private String ds_min;
	private String join_vectoring_grp;
	private String opState;
	private String us_min_inp;
	private String ds_max;
	@JsonProperty("PORTNAME")
	private String PORTNAME;
	private String us_min;
	@JsonProperty("ID")
	private String ID;
	private String ds_vectoring;
	private String ds_min_inp;
	private String us_min_snr;
	private String PORTTYPE;
	private String rpt_events;
	private String subscriberId;
	@JsonProperty("SUBSCRIBERID")
	private String SUBSCRIBERID;
	private String power_down_timeout;
	private String rtrvPortSpeed;
	private String power_save;
	// private String nodeDbId;
	private String ds_min_snr;
	private String emsAccessDuration;
	private String emsName;
	private String vdsl_prof;
	private String ds_max_snr;
	private String nodeName;
	private String portProfile;
	private String us_max_snr;
	private String description;
	private String dslporttemplate;
	private String ds_tgt_snr;
	private String fb_vpi;
	private String us_i_max_l;
	private String portServiceState;
	private String emsUserName;
	@JsonProperty("DESCRIPTION")
	public String DESCRIPTION;
	private String vendor;
	private String commandResponse;
	private String svcType;
	private String vectoring_group;
	private String spEmsId;
	private String responseTime;
	private String us_max;
	private String requestTime;
	private String templateName;
	@JsonProperty("OPSTATE")
	private String OPSTATE;
	private String path_l;
	private String fb_vci;
	private String ptm_o;
	private String us_tgt_snr;
	private String ds_i_max_l;
	@JsonProperty("PORTSERVICESTATE")
	private String PORTSERVICESTATE;

}
