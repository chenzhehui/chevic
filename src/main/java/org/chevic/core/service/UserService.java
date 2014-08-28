package org.chevic.core.service;

import java.util.List;

import org.chevic.core.dao.BaseDao;
import org.chevic.core.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
	
	@Autowired
    private BaseDao baseDao;
	
	public int addUser(User user) throws Exception{
		return this.baseDao.insert("insertUser", user, User.class) ;
	}
	
	public User getUser(User user) throws Exception{
		return this.baseDao.selectOne("selectUser", user, User.class) ;
	}
	
	public List<User> getUserList(User user) throws Exception{
		return this.baseDao.selectList("selectUser", user, User.class) ;
	}
	
	public void updateUser(User user) throws Exception{
		this.baseDao.update("updateUser", user, user.getClass()) ;
	}
}
