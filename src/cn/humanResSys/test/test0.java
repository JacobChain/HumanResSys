package cn.humanResSys.test;

import java.util.List;


import org.apache.log4j.Logger;
import org.junit.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.humanResSys.dao.train.TrainMapper;
import cn.humanResSys.dao.user.UserMapper;
import cn.humanResSys.pojo.Salary;

import cn.humanResSys.pojo.Training;

import cn.humanResSys.pojo.User;
 
public class test0 {
	public static Logger logger=Logger.getLogger(test0.class);
	@Test
	public void test1(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		UserService us = (UserService)context.getBean("userService");
		List<User> userList = us.getUserList("",0,0,1,100);
		for(User user:userList){
			logger.info(user.getUsercode()+user.getUsername()+user.getDepartmentname()+user.getUserrole());
		}
	
	}

	@Test
	public void test2(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		TrainMapper us = (TrainMapper)context.getBean("trainMapper");

	
	}


}
