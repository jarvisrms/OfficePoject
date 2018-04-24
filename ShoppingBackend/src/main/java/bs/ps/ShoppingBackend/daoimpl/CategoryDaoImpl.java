package bs.ps.ShoppingBackend.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bs.ps.ShoppingBackend.dao.CategoryDao;
import bs.ps.ShoppingBackend.dto.Category;


@Repository("categorydaoimpl")
@Transactional
public class CategoryDaoImpl  implements CategoryDao{

	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public List<Category> getListOfCategory() {

		try{
			String hql = "FROM Category ";
			Query q = sessionfactory.getCurrentSession().createQuery(hql);
			//q.setParameter("active", true);
		     return q.getResultList();
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	}

}
