package almeida.fernando.spring.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import almeida.fernando.spring.mybatis.domain.User;
import almeida.fernando.spring.mybatis.mappers.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	private final String LIKE_SYMBOL = "%";
	
	@Transactional
	public List<User> getAllUsers(){
		return userMapper.getAllUsers();
	}
	
	public List<User> findUsers(String word){
		return userMapper.findUserByUsername(LIKE_SYMBOL + word.toUpperCase() + LIKE_SYMBOL);
	}
}
