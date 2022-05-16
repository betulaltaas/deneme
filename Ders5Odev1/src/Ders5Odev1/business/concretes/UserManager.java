package Ders5Odev1.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Ders5Odev1.business.abstracts.UserService;
import Ders5Odev1.dataAccess.abstracts.UserDAO;
import Ders5Odev1.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDAO userDao;



	@Override
	public void register(User user) {
		
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		
		if(user.getPassword().length() < 6) {
			System.out.println("Parola en az 6 karakter olmalı.");
		}
		else if(user.getName().length() < 2) {
			System.out.println("İsim 2 karakterden uzun olmalı.");
		}
		else if(user.getSurname().length() < 2) {
			System.out.println("Soyisim 2 karakterden uzun olmalı.");
		}else if(!matcher.matches()) {
			System.out.println("Bu e-posta istenilen formata uygun degil.");
		}else {
			for(User users:userDao.getAll()) {
				if(users.getEmail().equals(user.getEmail())) {
					System.out.println("Bu e-posta adresi kullanılıyor");
				}
				
			}
		}
		

		
	}

	@Override
	public void login(User user) {
		if(user.isVerify() == true) {
			userDao.login(user);
		}else {
			System.out.println("Giris başarısız. E-postanız kontrol ediniz.");
		}
		
	}
	
	@Override
	public void add(User user) {
		

		
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}

	@Override
	public void confirm(User user) {
		if(user.isVerify()==true) {
			userDao.confirm(user);
		}else {
			System.out.println("E posta adresiniz doğrulanmamıştır");
		}
		
	}

	@Override
	public void registerWithAccount(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginWithAccount(User user) {
		// TODO Auto-generated method stub
		
	}

}
