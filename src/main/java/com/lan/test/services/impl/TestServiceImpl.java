package com.lan.test.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lan.test.daos.TestDao;
import com.lan.test.entities.Test;
import com.lan.test.services.TestService;

/** 
 * @author elan
 * @version 创建时间：2015年7月12日上午9:48:57 
 * 
 */

@Service("lan_test_service")
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testDao;
	
	@Override
	public List<String> selectAllName() {
		// TODO Auto-generated method stub
		return testDao.selectAllName();
	}

	@Override
	public List<Test> selectAllUser() {
		// TODO Auto-generated method stub
		return testDao.selectAllUser();
	}

}
