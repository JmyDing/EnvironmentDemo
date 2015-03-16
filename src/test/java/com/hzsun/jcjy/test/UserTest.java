package com.hzsun.jcjy.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hzsun.jcjy.dao.UserDao;
import com.hzsun.jcjy.entity.User;

public class UserTest {

	@Test
	public void  getUser(){
		String path="spring.xml";
		ApplicationContext ap=new ClassPathXmlApplicationContext(path);
		UserDao  user=ap.getBean(UserDao.class);
		List<User>  users=user.getUsers();
		for(User u:users ){
			System.out.println(u);
		}
	}
}
