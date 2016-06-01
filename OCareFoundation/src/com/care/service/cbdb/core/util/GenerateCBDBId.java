package com.care.service.cbdb.core.util;

public class GenerateCBDBId {
	private String service_Id;
	private String city_Id;
	private String location_Id;
	private String data_Type;
	private String unique_Id;
	
	public String getService_Id() {
		return service_Id;
	}


	public void setService_Id(String service_Id) {
		this.service_Id = service_Id;
	}


	public String getCity_Id() {
		return city_Id;
	}


	public void setCity_Id(String city_Id) {
		this.city_Id = city_Id;
	}


	public String getLocation_Id() {
		return location_Id;
	}


	public void setLocation_Id(String location_Id) {
		this.location_Id = location_Id;
	}


	public String getData_Type() {
		return data_Type;
	}


	public void setData_Type(String data_Type) {
		this.data_Type = data_Type;
	}


	public String getUnique_Id() {
		return unique_Id;
	}


	public void setUnique_Id(String unique_Id) {
		this.unique_Id = unique_Id;
	}

	public String getGeneratedId()	{
		return service_Id + city_Id + location_Id + data_Type + unique_Id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
