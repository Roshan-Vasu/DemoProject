package com.StartingDemoProject.DemoProjectt.UserManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	
	public UserEntity save(UserEntity userEnt){
		return userRepo.save(userEnt);
	}
	
	public List<UserEntity> retriveAllUsers(){
		return userRepo.findAll();
	}
	
	public UserEntity updateTheUsers(UserEntity userEnt){
		UserEntity updateUser =  userRepo.findById(userEnt.getId()).orElse(null);
		
		if(updateUser != null) {
			updateUser.setFirstName(userEnt.getFirstName());
			updateUser.setLastName(userEnt.getLastName());
			updateUser.setRoll(userEnt.getRoll());
			updateUser.setPhoneNumber(userEnt.getPhoneNumber());
			
			userRepo.save(updateUser);
			return updateUser;
			
		}
		
		return null;
		
	}
	
	public String deleteUser(Long id) {
			userRepo.deleteById(id);
			return "Deleted "+ id;
		
	}
	
	public Optional<UserEntity> getUserById(Long id){
		
		// Optional<UserEntity> user = userRepo.findById(id);
		
		
				return userRepo.findById(id);
		
	}
	
	
	public List<UserEntity> getUserByFirstName(String firstName){
		
		List<UserEntity> filterByFirstName =  userRepo.findByFirstName(firstName);
		for(UserEntity i : filterByFirstName) {
			System.out.println(i);
		}	
		return filterByFirstName;
		
	}	
	
	public List<UserEntity> getUserByName( Long phoneNumber, String roll){
		 
		List<UserEntity> getUserByName = userRepo.findByPhoneNumberAndRoll( phoneNumber, roll);
		
		
		if(getUserByName.size() > 0) {
			for(UserEntity i : getUserByName) {
				System.out.println(i);
			}
			return getUserByName;
		}
		return new ArrayList<UserEntity>();
	}
	
	public List<UserEntity> getUserByLastName(String lastName){
		
		List<UserEntity> filterByLastName =  userRepo.findByLastName(lastName);
			
		return filterByLastName;
		
	}

	
	
	
	
	
}
