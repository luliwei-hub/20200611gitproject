package service;

import dao.UserDao;
import model.User;

public class UserService {
	
	public UserDao dao =new UserDao();
	public void createUser (User user) {
		
		 dao.add(user);
	}

}
