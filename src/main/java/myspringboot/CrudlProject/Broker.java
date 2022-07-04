package myspringboot.CrudlProject;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public interface Broker extends CrudRepository<Mobile,Integer> {
	public List<Mobile> findAllByBrand(String brand);
	public List<Mobile> findAllByCost(int cost);
	
	@Transactional
	@Modifying
	@Query("update Mobile set cost=cost*0.500 where brand=:bnnd")
	public void updatePriceByBrand(String bnnd);
	
	@Query("from Mobile where brand=:type and cost>=:rupee")
	public List<Mobile> findAllByBrandAndCost(String type,int rupee);
	
	@Query("select brand from Mobile where megaArms=:tp")
	public List<String> findAllByMegaArms(int tp);


}
