package com.lan.test.daos.imp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lan.Utils.BasicDao;
import com.lan.test.daos.TestDao;
import com.lan.test.entities.Test;

/** 
 * @author elan
 * @version 创建时间：2015年7月12日上午9:51:22 
 * 
 */
@Repository("lan_test_dao")
public class TestDaoImpl extends  BasicDao<Test> implements TestDao {

	private final String namespace = Test.class.getName();
	
	@Override
	public String getNamespace() {
		// TODO Auto-generated method stub
		return namespace;
	}
	@Override
	public List<String> selectAllName() {
		// TODO Auto-generated method stub
		return selectList("selectAllName");
	}
	@Override
	public List<Test> selectAllUser() {
		// TODO Auto-generated method stub
		return selectList("selectAllUser");
	}
	

}
