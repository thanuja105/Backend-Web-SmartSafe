package com.safesmart.safesmart.dto;

public class CorpResponse {
	
private Long id;
    
    private String corpName;
	
	private String description;
	
    private boolean status;
    
    private String cityName;
	
    private String zipCode;
		
	 private String stateName;
		
	 private String streetName;
	 

	public CorpResponse(Long id, String corpName, String description, boolean status, String cityName, String zipCode,
			String stateName, String streetName) {
		super();
		this.id = id;
		this.corpName = corpName;
		this.description = description;
		this.status = status;
		this.cityName = cityName;
		this.zipCode = zipCode;
		this.stateName = stateName;
		this.streetName = streetName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCorpName() {
		return corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	@Override
	public String toString() {
		return "CorpResponse [id=" + id + ", corpName=" + corpName + ", description=" + description + ", status="
				+ status + ", cityName=" + cityName + ", zipCode=" + zipCode + ", stateName=" + stateName
				+ ", streetName=" + streetName + "]";
	}
	 
	 
	 

}
