package com.StartingDemoProject.DemoProjectt.Department;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserDepartmentEntity {

	@Id
	private Integer departmenId;
	private String departmentName;
	private String departmentDescription;
	
	
	public UserDepartmentEntity() {
		
	}


	public UserDepartmentEntity(Integer departmenId, String departmentName, String departmentDescription) {
		super();
		this.departmenId = departmenId;
		this.departmentName = departmentName;
		this.departmentDescription = departmentDescription;
	}





	public Integer getDepartmenId() {
		return departmenId;
	}


	public void setDepartmenId(Integer departmenId) {
		this.departmenId = departmenId;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public String getDepartmentDescription() {
		return departmentDescription;
	}


	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}


	@Override
	public String toString() {
		return "DepartmentEntity [departmenId=" + departmenId + ", departmentName=" + departmentName
				+ ", departmentDescription=" + departmentDescription + "]";
	}
	
	
	
	
}
