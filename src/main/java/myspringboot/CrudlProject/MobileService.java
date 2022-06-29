package myspringboot.CrudlProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MobileService {
	@Autowired
	Broker obj;
	
	public Mobile NewOne(Mobile Mob) {
		return obj.save(Mob);
	}

}
