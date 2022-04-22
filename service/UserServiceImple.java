package com.user.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.user.dao.IUserDao;
import com.user.entities.User;
@Service
public class UserServiceImple implements IUserService{

	//CREATE OBJECT OF IUserDao
	@Autowired
	private IUserDao iUserDao;
	
	//CREATE LIST
	//List<User> list;
	
	//CREATE CONSTRUCTOR
	public UserServiceImple() {
		/**list=new ArrayList<>();
		list.add(new User(125,"KAJAL","NAGPUR"));
		list.add(new User(186,"SONU","PUNE"));
		list.add(new User(197,"PRANU","MUMBAI"));
		list.add(new User(200,"RITU","SAONER"));**/
	}
	
	
	//GET ALL USERS
	@Override
	public List<User> getUser() {	
	 return iUserDao.findAll();
	}
	
	//post
	@Override
	public User addUser(User user) {
		
		//list.add(user);
		iUserDao.save(user);
		return user;
	}

	
}
