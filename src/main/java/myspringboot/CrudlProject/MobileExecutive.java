package myspringboot.CrudlProject;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileExecutive {
	@Autowired
	MobileService service;
	
	@DeleteMapping("/delall/{tp}")
	public List<String> callingDeleteMany(@PathVariable("tp") String tp){
		return service.makeDeleteCustom(tp);
		
	}
	@DeleteMapping("/delid/{pos}")
	public String callingDeleteId(@PathVariable("pos") int pos) {
		return service.makeDeleteKey(pos);
	}
	
	@PutMapping("/byups/{change}")
	public void callingUpdate(@PathVariable("change") String change) {
		service.Makeupdate(change);
	}
	
	
	@PutMapping("/up")
	public Mobile callingUp(@RequestBody Mobile Up) {
		return service.NewOne(Up);
		
	}
	
	@DeleteMapping("/del")
	public String callingMakeDelete(@RequestBody Mobile te) {
		return service.makeDelete(te);
		
	}
	
	@GetMapping("/bywhat/{south}")
	public List<String> callingFetchByMegaArms(@PathVariable("south")int south){
		return service.makeFetchByMegaArms(south);
		
	}
	
	@GetMapping("/bytwo/{one}/{two}")
	public List<Mobile> callingFetch(@PathVariable("one")String one,@PathVariable("two")int two){
		return service.makeFetch(one, two);
		
	}
	
	@GetMapping("/byprice/{value}")
	public List<Mobile> callingReadCost(@PathVariable("value") int value){
		return service.makeReadCost(value) ;
		
	}
	
	@GetMapping("/bybrand/{data}")
	public List<Mobile> callingReadBrand(@PathVariable("data") String data){
		return service.makeReadBrand(data);
		
	}
	@GetMapping("/{hey}")
	public Optional<Mobile> makeRead(@PathVariable("hey")int hey){
		return service.makeRead(hey);
		
	}
	
	@GetMapping("/")
	public List<Mobile> callingTraverse(){
		return service.makeFetchAll();
		
	}
	@PostMapping("/new")
	public Mobile CallingCreation(@RequestBody Mobile tel) {
		return service.NewOne(tel);
		
	}

}
