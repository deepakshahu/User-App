package in.deepak.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.deepak.service.UserMgmtService;

@RestController
public class ForgotPwdRestController {

	@Autowired
	private UserMgmtService service;
	
	@GetMapping("/forgotPwd/{email}")
	public String forgotPwd(@PathVariable String email) {
		return service.forgotPwd(email);
	}
}
