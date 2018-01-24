package com.backend.restapi.dao;

import java.util.List;

import com.backend.restapi.dto.User;


/**
 * 
 * @author saddam
 *
 */

public interface UserDAO {

	boolean register(User user);

	// List of product
	List<User> list();

	
	
	// save image to database usign blob file
		//Test saveImage(Test test);
	
}
