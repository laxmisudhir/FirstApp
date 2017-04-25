package com.accenture.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.view.User;

@RestController
public class UserServiceController {
		
	@RequestMapping(value = "/userservice/users/{id}", method=RequestMethod.GET)
	public User getuser(@PathVariable("id")Integer id){
		
		User user = new User();
		user.setId(1);
		user.setName("sudhir");
		user.setAddress("Ghaziabad");
		return user;
		
	}
	
	/*@RequestMapping(value = "/userservice/users/create", method=RequestMethod.POST )
	public User createUser(@RequestBody User user){
		
		return null;
		
	}*/

}
