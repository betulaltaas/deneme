package Ders5Odev1.core;

import Ders5Odev1.Google.GoogleLogin;
import Ders5Odev1.entities.concretes.User;

public class GoogleAdapter implements GoogleService {

	@Override
	public void register(User user) {
		GoogleLogin googlelogin = new GoogleLogin();
		googlelogin.login(user.getEmail());
		
	}

}
