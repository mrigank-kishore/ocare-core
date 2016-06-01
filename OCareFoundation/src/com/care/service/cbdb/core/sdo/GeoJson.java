package com.care.service.cbdb.core.sdo;

import com.google.gson.Gson;

public class GeoJson {
	private final String type = "Feature";
	private Geometry geometry = new Geometry();
	private Properties properties = new Properties();
	
	GeoJson(String location, double lat, double lon)	{
		double[] points = {lat, lon};
		
		geometry.setCoordinates(points);
		properties.setName(location);
	}
	class Geometry {
		private final String type = "Point";
		private double[] coordinates;
		public double[] getCoordinates() {
			return coordinates;
		}
		public void setCoordinates(double[] coordinates) {
			this.coordinates = coordinates;
		}
	}
	class Properties {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
	
	public static void main(String[] args){
		GeoJson geo = new GeoJson("Mumbai", 19.27, 72.97);
		Gson gson = new Gson();
		System.out.println(gson.toJson(geo));
	}
}
