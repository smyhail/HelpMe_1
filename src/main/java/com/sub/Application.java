package com.sub;

import java.util.Date;
import java.util.List;

import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

import com.sub.model.User;
import com.sub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;





@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		userRepository.save(new User("seba", "u",new Date(),"sas@cdsd", 39,1));
		userRepository.save(new User("eryk", "ubh",new Date(),"sasdvsd@cdsd", 11,1));


		/**
		User user = new User();
		user.setActive(1);
		user.setAge(28);
		user.setEmailAddress("ramesh24@gmail.com");
		user.setFirstname("Ramesh");
		user.setLastname("Fadatare");
		user.setStartDate(new Date());
		user = userRepository.save(user);

		//System.out.println("-------------------------------------:: " + user.getId());
		
		System.out.println(" ---------------@Query ---------------------");
		System.out.println("--------------findByEmailAddress -----------------");
		
		User user2 = userRepository.findByEmailAddress("sas@cdsd");
		System.out.println(user2.toString());
		
		System.out.println(" ---------------@Query ---------------------");
		System.out.println("--------------findByLastname -----------------");
		
		List<User> user3 = userRepository.findByFirstnameEndsWith("seba");
		System.out.println(user3.get(0).toString());
		 */
	}
}
