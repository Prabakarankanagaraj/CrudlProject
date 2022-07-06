package myspringboot.CrudlProject;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class CrudlProjectApplicationTests {
	
	@MockBean 
	Broker repo;
	@Autowired
	MobileService Service;
	@Test
	public void testing() {
		Mobile m1=new Mobile(100,"lenovo","x1",5500,2500);
		Mobile m2=new Mobile(101,"honor","x11",6500,8800);
		Mobile m3=new Mobile(102,"realme","y21",3500,7500);
		
		when(repo.findAll()).thenReturn(Stream.of(m1,m2,m3).collect(Collectors.toList()));
		
		assertSame(3,Service.makeFetchAll().size());
		assertNull(Service.makeFetchAll().get(0));
	}
	

	@Test
	void contextLoads() {
	}

}
