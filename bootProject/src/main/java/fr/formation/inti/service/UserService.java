package fr.formation.inti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import fr.formation.inti.entity.User;

@Service
public interface UserService {
	
	List<User>findAll();
	
	Integer saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUser(User user);
	
	void deleteUser(Integer id);
	
	Optional<User> findById(Integer id);

	User findByLoginAndPassword(String login, String password);
}
