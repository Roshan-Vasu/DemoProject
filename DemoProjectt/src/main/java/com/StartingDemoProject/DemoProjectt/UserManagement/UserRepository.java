package com.StartingDemoProject.DemoProjectt.UserManagement;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Long> {
	
	List<UserEntity> findByFirstName(String firstName);
	List<UserEntity> findByLastName(String lastName);
	
	@Query("select u from user_entity u where u.phoneNumber = ?1 and u.Roll = ?2")
	List<UserEntity> findByPhoneNumberAndRoll(Long phoneNumber, String Roll);

	

	
	
	
}
