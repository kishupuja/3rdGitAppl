package com.json.java;

public class Model {
	
@Override
	public String toString() {
		return "Model [empNo=" + empNo + ", empName=" + empName + ", sal=" + sal + "]";
	}
public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
private Integer empNo;
private String empName;
private double sal;
}
