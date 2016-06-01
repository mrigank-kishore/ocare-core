package com.care.service.cbdb.core.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;

public class CBJson {
	
	private static final Logger LOG = LogManager.getLogger("CBJson");
	private static final Gson gson = new Gson();

	public CBJson() {
		// TODO Auto-generated constructor stub
	}
	public static Gson getGSON()	{
		LOG.trace("INIT google gson object");
		return gson;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
