package fr.formation.inti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.inti.dao.UserDao;
import fr.formation.inti.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public Integer saveUser(User user) {
		return userDao.save(user).getUserId();
	}

	@Override
	public void updateUser(User user) {
		userDao.save(user);
		
	}

	@Override
	public void deleteUser(User user) {
		userDao.delete(user);
		
	}

	@Override
	public void deleteUser(Integer id) {
		userDao.deleteById(id);
	}

	@Override
	public Optional<User> findById(Integer id) {
		return userDao.findById(id);
	}

	@Override
	public User findByLoginAndPassword(String login, String password) {
		return userDao.findByLoginAndPassword(login, password);
	}
}
