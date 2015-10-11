package com.lan.test.daos;

import java.util.List;

import com.lan.test.entities.Test;

/** 
 * @author elan
 * @version 创建时间：2015年7月12日上午9:50:26 
 * 
 */
public interface TestDao {

	List<String> selectAllName();

	List<Test> selectAllUser();

}
