package Ders5Odev1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Ders5Odev1.dataAccess.abstracts.UserDAO;
import Ders5Odev1.entities.concretes.User;

public class HibernateUserDao implements UserDAO{

	List<User> users = new ArrayList<User>();

	@Override
	public void register(User user) {
		System.out.println(user.getName() + " isimli kullanici basiriyla kayit olmustur");
		users.add(user);	
	}

	@Override
	public void login(User user) {
		System.out.println(user.getName() + " adli kullanici sisteme giris yapti");
	}

	@Override
	public void confirm(User user) {
		System.out.println(user.getEmail() + " email adresiniz onaylandi");
		user.setVerify(true);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.users;
	}


}
