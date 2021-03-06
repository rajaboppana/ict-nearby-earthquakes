package com.smartrec.nbeq.pojo;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author RajaBoppana
 *
 */
@JsonPropertyOrder({ "generated", "url", "title", "status", "api", "count" })
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Metadata implements Serializable {

	
	private static final long serialVersionUID = 1956582189950613293L;

	@JsonProperty("generated")
	private Long generated;
	
	@JsonProperty("url")
	private String url;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("status")
	private Long status;
	
	@JsonProperty("api")
	private String api;
	
	@JsonProperty("count")
	private Long count;
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<>();

	@JsonProperty("generated")
	public Long getGenerated() {
		return generated;
	}

	@JsonProperty("generated")
	public void setGenerated(Long generated) {
		this.generated = generated;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	@JsonProperty("status")
	public Long getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(Long status) {
		this.status = status;
	}

	@JsonProperty("api")
	public String getApi() {
		return api;
	}

	@JsonProperty("api")
	public void setApi(String api) {
		this.api = api;
	}

	@JsonProperty("count")
	public Long getCount() {
		return count;
	}

	@JsonProperty("count")
	public void setCount(Long count) {
		this.count = count;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
}