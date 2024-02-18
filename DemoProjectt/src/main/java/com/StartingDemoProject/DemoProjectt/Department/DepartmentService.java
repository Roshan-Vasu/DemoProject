package com.StartingDemoProject.DemoProjectt.Department;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	@Autowired
	private UserDepartmentRepository departmentRepo;
	
	public UserDepartmentEntity addUserDepartment(UserDepartmentEntity department) {
		departmentRepo.save(department);
		return department;
	}
	
	public List<UserDepartmentEntity> getAllDepartment (){
		return departmentRepo.findAll();
		
	}
	
	public Optional<UserDepartmentEntity> getDepartmentbyId (Integer Id){
		
		if(Id != null)
			return departmentRepo.findById(Id);
		
		return Optional.empty();
		
	}

	public String  updateDepartment(UserDepartmentEntity department) {
		
		UserDepartmentEntity departmentDetails = departmentRepo.findById(department.getDepartmenId()).orElse(null);
		if(departmentDetails != null) {
			
			departmentDetails.setDepartmentDescription(department.getDepartmentDescription());
			departmentDetails.setDepartmentName(department.getDepartmentName());
			
			departmentRepo.save(departmentDetails);
			
			return "Updated Successfully!!!";
		} else {
			return "Something Issue";
		}
		
	}

	public String deleteDepartmentById(Integer id) {
		if(id != null || id != 0) {
			departmentRepo.deleteById(id);
			return "Delete Successfully";
		} else {
			return "Something Else";
		}
	}
	
	
	
}

