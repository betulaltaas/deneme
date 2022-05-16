package Ders5Odev1.dataAccess.abstracts;

import java.util.List;

import Ders5Odev1.entities.concretes.User;

public interface UserDAO {
	

	void register(User user);
	void login(User user);
	void confirm(User user);
	List<User> getAll(); //ürün listesi döndürür.
	
	
}
