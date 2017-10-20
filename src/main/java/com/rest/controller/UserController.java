package com.rest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.util.*;

import com.rest.bean.UserRequest;
import com.rest.bean.UserResponse;

@RestController
@RequestMapping(value = "user")

public class UserController {
	private static final Logger logger = LoggerFactory
			.getLogger(UserController.class);

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ResponseEntity<UserResponse> doAuthenticate(@RequestBody UserRequest login){
		logger.info(this.getClass().getName() + " - doAuthonticate - START");
		UserResponse userResponse=new UserResponse();
		
		if(!StringUtils.isEmpty(login.getUserName())&&!StringUtils.isEmpty(login.getPassword())){
			
		List<String> partenerIds=new ArrayList<String>();
		partenerIds.add("dc78a41b-7bac-4cc7-a4e3-5f4990b9fc11");
		partenerIds.add( "dec6182c-26e6-4762-84a4-bc04e28438af");
		partenerIds.add("d48ab385-b06b-4102-83ea-8302cf46ad37");
		
		userResponse.setUserId(UUID.randomUUID().toString());
		userResponse.setFirstName("John");
		userResponse.setLastName("Smith");
		userResponse.setCupId("62483033-c197-44ef-8579-17b21559bdd7");
		userResponse.setParterIds(partenerIds);
		userResponse.setStatus(true);
		logger.info(this.getClass().getName() + " - doAuthonticate - END");
		}		
		return new ResponseEntity<UserResponse>(userResponse,HttpStatus.OK);
	}
	
}
