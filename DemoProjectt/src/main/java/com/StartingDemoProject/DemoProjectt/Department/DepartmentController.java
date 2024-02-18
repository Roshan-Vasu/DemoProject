package com.StartingDemoProject.DemoProjectt.Department;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/UserDepartment")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	
	
	@RequestMapping(value = "/AddDepartment", method = RequestMethod.POST)
	public String addUserDepartment(@RequestBody UserDepartmentEntity department) {
		departmentService.addUserDepartment(department);
		return "Saved";
	}
	
	@GetMapping("/AllDepartment")
	public List<UserDepartmentEntity> getAllDepartment(){
		return departmentService.getAllDepartment();
		
	}
	
	@GetMapping("/DepartmentId")
	public Optional<UserDepartmentEntity> getDepartmentById(@RequestParam Integer DepartmentId){
		return departmentService.getDepartmentbyId(DepartmentId);
		
	}
	
	@PutMapping("/Department/Update")
	public String updateDepartment(@RequestBody UserDepartmentEntity department) {
		return departmentService.updateDepartment(department);
	}
	
	@DeleteMapping("/Department/Delete")
	public String deleteDepartment(@RequestParam Integer Id) {
		return departmentService.deleteDepartmentById(Id);
	}
}
