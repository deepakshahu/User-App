package in.deepak.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.deepak.bindings.LoginForm;
import in.deepak.service.UserMgmtService;

@RestController
public class LoginRestController {

	@Autowired
	private UserMgmtService service;
	
	@PostMapping("/login")
	public String login(@RequestBody LoginForm form) {
		return service.login(form);
	}

}
