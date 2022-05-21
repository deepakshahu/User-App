package in.deepak.service;

import java.util.Map;

import in.deepak.bindings.LoginForm;
import in.deepak.bindings.UnlockForm;
import in.deepak.bindings.UserForm;

public interface UserMgmtService {
	
	//Login Functionality method
	public String login(LoginForm loginForm);
	
	//Registration functionalities methods
	public String emailCheck(String emailId);
	public Map<Integer, String> loadCountries();
	public Map<Integer, String> loadStates(Integer countryId);
	public Map<Integer, String> loadCities(Integer stateId);
	public String registerUser(UserForm userForm);
	
	//Unlock Account functionality method
	public String unlockAccount(UnlockForm unlockAccForm);
	
	//Forgot password functionality method
	public String forgotPwd(String emailId);
}
