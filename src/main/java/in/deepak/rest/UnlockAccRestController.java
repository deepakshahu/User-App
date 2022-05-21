package in.deepak.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.deepak.bindings.UnlockForm;
import in.deepak.service.UserMgmtService;

@RestController
public class UnlockAccRestController {

	@Autowired
	private UserMgmtService service;
	
	@PostMapping("/unlock")
	public String unlockAccount(@RequestBody UnlockForm unlockForm) {
		return service.unlockAccount(unlockForm);
	}
	
}
