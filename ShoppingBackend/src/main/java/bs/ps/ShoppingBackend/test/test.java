package bs.ps.ShoppingBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bs.ps.ShoppingBackend.dao.CategoryDao;
import bs.ps.ShoppingBackend.dto.Category;

public class test {

	private static AnnotationConfigApplicationContext context;
	private static CategoryDao categorydao;
	private Category cat;
	
	@BeforeClass
	public  static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("bs.ps.ShoppingBackend");
		context.refresh();
		categorydao=(CategoryDao)context.getBean("categorydaoimpl");
	}
	
	@Test
	public void testthis()
	{
		assertEquals("this it the messag",3,categorydao.getListOfCategory().size());
	}
	
	
}
