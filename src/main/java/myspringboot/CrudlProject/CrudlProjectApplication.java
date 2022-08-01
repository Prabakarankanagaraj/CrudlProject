package myspringboot.CrudlProject;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class CrudlProjectApplication {
	
	@Autowired
	PasswordEncoder encoder;
	
	@Autowired
	ResourceService service;

	public static void main(String[] args) {
		SpringApplication.run(CrudlProjectApplication.class, args);		
		
	}
	
//	@PostConstruct
//	public void praba() {
//		Resource res=new Resource();
//		res.setEmail("praba@gmail.com");res.setEmpName("praba");
//		res.setMobile(824864830l);res.setPassword(encoder.encode("praba"));
//		res.setUsername("katran");
//		service.implementSave(res);
//		
//	}

}


