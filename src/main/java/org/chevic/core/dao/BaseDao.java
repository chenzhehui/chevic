package org.chevic.core.dao;

import java.util.List;

public interface BaseDao {
	
    public int update(String statement,Object parameter,Class<?> clazz);
    
    public <T>T selectOne(String statement,Object parameter,Class<?> clazz);
    
    public <E>List<E> selectList(String statement,Object parameter,Class<?> clazz);
    
    public int insert(String statement,Object parameter,Class<?> clazz);
    
    public int delete(String statement,Object parameter,Class<?> clazz);
    
    public int selectForInt(String statement,Object parameter,Class<?> clazz);
    
    
}