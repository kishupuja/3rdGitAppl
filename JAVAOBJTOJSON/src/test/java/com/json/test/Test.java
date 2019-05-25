package com.json.test;

import com.json.java.Model;
import com.json.util.Util;

public class Test {
	public static void main(String[] args) {
		
		
		Model m=new Model();
		m.setEmpNo(1010);
		m.setEmpName("kishu");
		m.setSal(20000);
		String jsonModel=Util.convertJavaToJson(m);
		System.out.println(jsonModel);
	}

}
