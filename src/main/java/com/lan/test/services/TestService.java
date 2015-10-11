package com.lan.test.services;

import java.util.List;

import com.lan.test.entities.Test;

/** 
 * @author elan
 * @version 创建时间：2015年7月12日上午9:48:18 
 * 
 */
public interface TestService {

	List<String> selectAllName();

	List<Test> selectAllUser();

}
