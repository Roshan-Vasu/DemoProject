package com.StartingDemoProject.DemoProjectt.UserManagement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@RestController
@RequestMapping("/api/UserDetails")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value =  "/AllUsers", method = RequestMethod.GET, produces = "application/json")
	public List<UserEntity> retriveAllUser(){
		return userService.retriveAllUsers();
	}
	
	@RequestMapping(value =  "/Id/{id}", method = RequestMethod.GET)
	public Optional<UserEntity> retriveUserById(@PathVariable Long id){
		return userService.getUserById(id);
		
	}

	@RequestMapping(value =  "/AddUser", method = RequestMethod.POST)
	public UserEntity saveUser(@RequestBody UserEntity user){
		return userService.save(user);	
	}
	
	@RequestMapping(value = "/UpdateUser", method = RequestMethod.PUT)
	public UserEntity updateUser(@RequestBody UserEntity user) {
		return userService.updateTheUsers(user);
		 	
	}
	
	@RequestMapping(value = "DeleteUser/{id}", method = RequestMethod.DELETE)
	public String deleteUser(@RequestParam Long id) {
		return userService.deleteUser(id);
		 
	}
	
	@GetMapping("/FirstName/{firstName}")
	public List<UserEntity> getUserByFirstName(@PathVariable String firstName){
		return userService.getUserByFirstName(firstName);
		
	}
	
	@RequestMapping(value =  "/PhoneNumber/{phoneNumber}/Roll/{roll}", method = RequestMethod.GET)
	public List<UserEntity> retriveUserByName( @PathVariable Long phoneNumber,@PathVariable String roll){
		return userService.getUserByName(phoneNumber, roll);
		
	}
	   
	@RequestMapping(value =  "/Name", method = RequestMethod.GET)
	public List<UserEntity> retriveUserByIdcheck(@RequestParam String firstName){
		return userService.getUserByFirstName(firstName);
		
	}
	
	
}
