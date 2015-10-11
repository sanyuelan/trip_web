package com.lan.Utils;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author elan
 * @version 创建时间：2015年7月12日上午9:09:56
 * 
 */
public abstract class BasicDao<T> {

	@Autowired
	@Qualifier("sqlSession")
	private SqlSession sqlSession;

	public abstract String getNamespace();


	protected String getStatement(String partStatement) {
		return getNamespace() + '.' + partStatement;
	}

	protected <T> T selectOne(String statement) {
		return sqlSession.selectOne(getStatement(statement));
	}

	protected <T> T selectOne(String statement, Object parameter) {
		return sqlSession.selectOne(getStatement(statement), parameter);
	}

	protected <T> List<T> selectList(String statement) {
		return sqlSession.selectList(getStatement(statement));
	}

	protected <T> List<T> selectList(String statement, Object parameter) {
		return sqlSession.selectList(getStatement(statement), parameter);
	}

	protected int insert(String statement) {
		return sqlSession.insert(getStatement(statement));
	}

	protected int insert(String statement, Object parameter) {
		return sqlSession.insert(getStatement(statement), parameter);
	}

	protected int update(String statement) {
		return sqlSession.update(getStatement(statement));
	}

	protected int update(String statement, Object parameter) {
		return sqlSession.update(getStatement(statement), parameter);
	}

	protected int delete(String statement) {
		return sqlSession.delete(getStatement(statement));
	}

	protected int delete(String statement, Object parameter) {
		return sqlSession.delete(getStatement(statement), parameter);
	}

}
