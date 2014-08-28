package org.chevic.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.chevic.core.dao.BaseDao;

@Service("userService")
public class UserService {
	
	@Autowired
    private BaseDao baseDao;
	

}
