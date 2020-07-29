package com.sub.repository;

import java.util.List;

import com.sub.model.User;
import com.sub.model.UserName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("select p from User p")  //1.it's work
	List<User> getAll();

	@Query("select u from User u where u.firstname like %?1")  //2.it's work
	List<User> findByFirstnameEndsWith(String firstname);

	@Query("select u.firstname from User u ")  //3. don't work
	List<UserName> getNameUsers();


}
