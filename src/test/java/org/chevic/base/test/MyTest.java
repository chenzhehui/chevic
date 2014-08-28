package org.chevic.base.test;

import java.util.List;

import org.chevic.core.entity.User;
import org.chevic.core.service.UserService;
import org.chevic.core.utils.MD5Encrypter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;


@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/applicationContext.xml")
public class MyTest {
	Logger log = LoggerFactory.getLogger(MyTest.class) ;
	
	@Autowired
	UserService userService;
	
	@Test
    public void testInsert() throws Exception{
		
		User tom = new User() ;
		tom.setUserName("tom");
		tom.setPassWord(MD5Encrypter.md5Digest("123456"));
		
		int id = this.userService.addUser(tom) ;
		log.info("id is :"+id);
	}
	
	@Test
	public void testSelect() throws Exception{
		User tom = new User();
		tom.setUserName("tom");
		tom = this.userService.getUser(tom) ;
		log.info(tom.toString());
	}
	
	@Test
	public void testSelectList() throws Exception{
		User tom = new User();
		tom.setUserName("tom");
		List<User> users = this.userService.getUserList(tom) ;
		log.info(users.get(0).toString());
	}
	@Test
	public void testUpdate() throws Exception{
		List<User> users = this.userService.getUserList(new User()) ;
		User john = users.get(0) ;
		john.setUserName("John");
		john.setStatus("00");
		this.userService.updateUser(john);
	}
	
}
