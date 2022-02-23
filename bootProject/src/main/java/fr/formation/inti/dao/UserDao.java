package fr.formation.inti.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.formation.inti.entity.User;

public interface UserDao extends JpaRepository<User, Integer>{

	@Query("SELECT u FROM User u WHERE u.login LIKE ?1 and u.password LIKE ?2")
	User findByLoginAndPassword(String login, String password);
}
