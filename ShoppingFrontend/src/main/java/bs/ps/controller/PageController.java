package bs.ps.controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import bs.ps.ShoppingBackend.dao.CategoryDao;

@Controller
public class PageController {


	@Autowired
	private CategoryDao categorydaoimpl;
	
@RequestMapping(value={"/","/index","home"})
public ModelAndView home()
{
	ModelAndView mv =new ModelAndView("home");
	mv.addObject("categories",categorydaoimpl.getListOfCategory() );
	mv.addObject("userclickedhomepage" , true);
	return mv;
}
	
}
