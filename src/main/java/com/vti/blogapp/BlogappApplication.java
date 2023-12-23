package com.vti.blogapp;

import com.vti.blogapp.Entity.Role;
import com.vti.blogapp.Entity.User;
import com.vti.blogapp.Repository.RoleRepository;
import com.vti.blogapp.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;

@AllArgsConstructor
@SpringBootApplication
public class BlogappApplication implements CommandLineRunner
{
	private final UserRepository userRepository;
	private final RoleRepository roleRepository;
	private final PasswordEncoder passwordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(BlogappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		var user = new User();
		user.setName("Tô Bá Nghị");
		user.setUsername("nghito2002hp");
		user.setEmail("tobanghi@gmail.com");
		user.setPassword(passwordEncoder.encode("rocmanx4"));
		var adminRole = roleRepository.findByType(Role.Type.ADMIN);
		var userRole = roleRepository.findByType(Role.Type.USER);
		user.setRoles(Set.of(adminRole, userRole));
		userRepository.save(user);
	}
}
