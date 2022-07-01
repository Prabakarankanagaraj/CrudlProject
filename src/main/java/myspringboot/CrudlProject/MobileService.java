package myspringboot.CrudlProject;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MobileService {
	@Autowired
	Broker obj;
	public String makeDelete(Mobile tel) {
		String msg=tel.getBrand()+"has deleted";
		obj.delete(tel);
		return msg;
		
	}
	
	public List<String> makeFetchByMegaArms(int alpha){
		return obj.findAllByMegaArms(alpha);
	}
	
	public List<Mobile> makeFetch(String a,int b){
		return obj.findAllByBrandAndCost(a, b);
	}
	
	public List<Mobile> makeReadCost(int rest){
		return obj.findAllByCost(rest);
		
	}
	
	public List<Mobile> makeReadBrand(String get){
		return obj.findAllByBrand(get);
	}
	
	public Optional<Mobile> makeRead(int key){
		return obj.findById(key);
		
	}
	public List<Mobile> makeFetchAll(){
		return (List<Mobile>) obj.findAll();		
	}
	
	public Mobile NewOne(Mobile Mob) {
		return obj.save(Mob);
	}

}
