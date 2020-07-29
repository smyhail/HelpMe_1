package com.sub.repository;

import java.util.List;

import com.sub.model.User;
import com.sub.model.UserCount;
import com.sub.model.UserName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("select p from User p")  //1.it's work
	List<User> getAll();

	@Query("select u from User u where u.name like %?1")  //2.it's work
	List<User> findByFirstnameEndsWith(String firstname);

	@Query("select u.name from User u ")  //3. don't work
	List<UserName> getNameUsers();

	// this SQL working in database console H2
	// SELECT city, count(*) FROM USERS  WHERE stat = true GROUP BY  city

	@Query("select u.city, count (u) from User u where u.stat = true group by u.city")  //3. don't work
	List<UserCount> getOwnQuery();

}
