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

		userRepository.save(new User("Seba", "Lodz",new Date(),true));
		userRepository.save(new User("Eryk", "Lodz",new Date(),true));
		userRepository.save(new User("Anna", "Lodz",new Date(),true));
		userRepository.save(new User("John", "Lodz",new Date(),false));
		userRepository.save(new User("Aldwin","Roma",new Date(),true));
		userRepository.save(new User("Garfield","London",new Date(),false));
		userRepository.save(new User("Michale","Paris",new Date(),false));
		userRepository.save(new User("Lorna","London",new Date(), true));
		userRepository.save(new User("Nicola","Berlin",new Date(),false));
		userRepository.save(new User("Cleveland","London",new Date(),false));
		userRepository.save(new User("Worthy","Paris",new Date(),true));
		userRepository.save(new User("Noelyn","Roma",new Date(),true));
		userRepository.save(new User("Adora","Madrid",new Date(),true));
		userRepository.save(new User("Tiff","Paris",new Date(), true));
		userRepository.save(new User("Dodie","London",new Date(),false));
		userRepository.save(new User("Bride","Roma",new Date(),true));
		userRepository.save(new User("Helli","Berlin",new Date(), true));
		userRepository.save(new User("Rudolfo","Roma",new Date(),true));


	}
}
