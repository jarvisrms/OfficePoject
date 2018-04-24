package bs.ps.ShoppingBackend.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("bs.ps.ShoppingBackend.dto")
@EnableTransactionManagement
public class HibernateConfiguration {

	
	private static final String DATABASE_URL ="jdbc:h2:tcp://localhost/~/shopping";
	private static final String DATABASE_DRIVER ="org.h2.Driver";
	private static final String DATABASE_USERNAME ="sa";
	private static final String DATABASE_DIALECT ="org.hibernate.dialect.H2Dialect";
	private static final String DATABASE_PASSWORD ="";
	
	
	//create a data source bean
	@Bean
	public DataSource getDataSource()
	{
		BasicDataSource datasource = new BasicDataSource();
		datasource.setDriverClassName(DATABASE_DRIVER);
		datasource.setUrl(DATABASE_URL);
		datasource.setUsername(DATABASE_USERNAME);
		datasource.setPassword(DATABASE_PASSWORD);
		return datasource;
	}
	
	@Bean
	public SessionFactory getSessionFactory(DataSource ds)
	{
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(ds);
		builder.scanPackages("bs.ps.ShoppingBackend");
		builder.addProperties(properties());
		return builder.buildSessionFactory();
		
	}

	private Properties properties() {
		Properties prop = new Properties();
		prop.put("hibernate.dialect", DATABASE_DIALECT);
		prop.put("hibernate.show_sql",true);
		prop.put("hibernate.formal_sql",true);
		return prop;
	}
	
	@Bean
	public HibernateTransactionManager getHtm(SessionFactory ss)
	{
		HibernateTransactionManager htm = new HibernateTransactionManager(ss);
		return htm;
	}
}
