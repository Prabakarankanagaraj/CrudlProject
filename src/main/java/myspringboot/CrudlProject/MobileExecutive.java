package myspringboot.CrudlProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileExecutive {
	@Autowired
	MobileService service;
	@PostMapping("/new")
	public Mobile CallingCreation(@RequestBody Mobile tel) {
		return service.NewOne(tel);
		
	}

}
