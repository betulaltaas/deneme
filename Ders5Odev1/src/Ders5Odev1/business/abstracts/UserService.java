package Ders5Odev1.business.abstracts;

import java.util.List;

import Ders5Odev1.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user);
	void confirm(User user);
	void registerWithAccount(User user);
	void loginWithAccount(User user);
	void add(User user);
	List<User> getAll();
}
