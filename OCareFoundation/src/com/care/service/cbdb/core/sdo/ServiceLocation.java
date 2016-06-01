package com.care.service.cbdb.core.sdo;

public class ServiceLocation {
	private String workplace_name;
	private String address;
	private String services;
	private ServiceUser[] user;
	private GeoJson geoJson;
	public String getWorkplace_name() {
		return workplace_name;
	}
	public void setWorkplace_name(String workplace_name) {
		this.workplace_name = workplace_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public ServiceUser[] getUser() {
		return user;
	}
	public void setUser(ServiceUser[] user) {
		this.user = user;
	}
	public GeoJson getGeoJson() {
		return geoJson;
	}
	public void setGeoJson(GeoJson geoJson) {
		this.geoJson = geoJson;
	}
}
