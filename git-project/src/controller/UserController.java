package controller;

import model.User;
import service.UserService;

public class UserController {
	public UserService service =new UserService();
	public void addUser (User user) {
		service.createUser(user);
	}

}
