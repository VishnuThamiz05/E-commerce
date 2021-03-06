package Vishnu.Hiberconfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import Vishnu.Model.Register;
import Vishnu.Model.Subscribe;
import Vishnu.Model.Supplier;
import Vishnu.Model.goooo;
import Vishnu.Model.Cart;
import Vishnu.Model.Category;
import Vishnu.Model.OrderDetails;
import Vishnu.Model.Product;


@Configuration
@EnableTransactionManagement
@ComponentScan("Vishnu")
public class Hiberconfig {
    @Autowired
    @Bean(name = "dataSource")
    public DataSource getH2DataSource() {
        DriverManagerDataSource driverMgrDataSource = new DriverManagerDataSource();
        driverMgrDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverMgrDataSource.setUrl("jdbc:mysql://localhost:3306/vishnu?useSSL=false");

        driverMgrDataSource.setUsername("root");
        driverMgrDataSource.setPassword("admin");
        return driverMgrDataSource;
    }

    @Bean(name = "sessionFactory")
    public SessionFactory getSessionFactory() {
        Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
        hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

        LocalSessionFactoryBuilder localSessionFacBuilder = new LocalSessionFactoryBuilder(getH2DataSource());
        localSessionFacBuilder.addProperties(hibernateProperties);
        localSessionFacBuilder.addAnnotatedClass(Register.class);
        localSessionFacBuilder.addAnnotatedClass(Category.class);
        localSessionFacBuilder.addAnnotatedClass(Product.class);
        localSessionFacBuilder.addAnnotatedClass(Supplier.class);
        localSessionFacBuilder.addAnnotatedClass(Subscribe.class);
        localSessionFacBuilder.addAnnotatedClass(Cart.class);
        localSessionFacBuilder.addAnnotatedClass(OrderDetails.class);
        localSessionFacBuilder.addAnnotatedClass(goooo.class);
        SessionFactory sessionFactory = localSessionFacBuilder.buildSessionFactory();
        System.out.println("Session Factory Object Created");
        return sessionFactory;
    }

    @Bean
    public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory) {
        HibernateTransactionManager hibernateTranMgr = new HibernateTransactionManager(sessionFactory);
        return hibernateTranMgr;
    }

}
