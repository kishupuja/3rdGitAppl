package com.json.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Util {
	/*
	 * private static ObjectMapper mapper; static { mapper=new ObjectMapper();
	 * 
	 * }
	 */
	public static String convertJavaToJson(Object object) {
		String jsonResult="";
		try {
			ObjectMapper objectmapper=new ObjectMapper();
			jsonResult=objectmapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			//System.out.println("Exception occured while javaobject to json object");
			
			e.printStackTrace();
		} catch (JsonMappingException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		return jsonResult;
		
	}

}
