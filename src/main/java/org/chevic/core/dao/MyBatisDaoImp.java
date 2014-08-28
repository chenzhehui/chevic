package org.chevic.core.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public class MyBatisDaoImp implements BaseDao{
	
	private SqlSessionTemplate sqlSession;
    
	/**
	 * 更新
	 */
	public int update(String statement, Object parameter, Class<?> clazz) {
		String comState=this.getCompleteStatement(statement, clazz);
		int size=this.sqlSession.update(comState, parameter);
		return size;
	}
    
	/**
	 * 查询结果为单一或为空
	 */
	public <T> T selectOne(String statement, Object parameter, Class<?> clazz) {
		String comState=this.getCompleteStatement(statement, clazz);
		T one=this.sqlSession.selectOne(comState, parameter);
		return one;
	}

	public <E> List<E> selectList(String statement, Object parameter,Class<?> clazz) {
		String comState=this.getCompleteStatement(statement, clazz);
		List<E> list=this.sqlSession.selectList(comState, parameter);
		return list;
	}

	public int insert(String statement, Object parameter, Class<?> clazz) {
		String comState=this.getCompleteStatement(statement, clazz);
		int size=this.sqlSession.insert(comState, parameter);
		return size;
	}

	public int delete(String statement, Object parameter, Class<?> clazz) {
		String comState=this.getCompleteStatement(statement, clazz);
		int size=this.sqlSession.delete(comState, parameter);
		return size;
	}
    
	public int selectForInt(String statement, Object parameter, Class<?> clazz) {
		String comState=this.getCompleteStatement(statement, clazz);
		Integer size=this.sqlSession.selectOne(comState, parameter);
		return size.intValue();
	}
	
	
	public String getCompleteStatement(String statement,Class<?> clazz){
		return clazz.getName()+"."+statement;
	}

	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}


	
}