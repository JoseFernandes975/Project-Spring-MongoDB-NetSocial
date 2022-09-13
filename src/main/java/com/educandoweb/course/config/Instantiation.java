package com.educandoweb.course.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.educandoweb.course.domain.Post;
import com.educandoweb.course.domain.User;
import com.educandoweb.course.repository.PostRepository;
import com.educandoweb.course.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository; 
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		postRepository.deleteAll();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));		
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		Post post1 = new Post(null, sdf.parse("13/09/2022"), "Partiu viagem","Vou viajar para São Paulo. Abraços!", maria);
		Post post2 = new Post(null, sdf.parse("14/09/2022"), "Bom Dia!","Acordei feliz hoje!", maria);
		
		
     	userRepository.saveAll(Arrays.asList(maria ,alex ,bob));
     	postRepository.saveAll(Arrays.asList(post1, post2));
   }
	

}
