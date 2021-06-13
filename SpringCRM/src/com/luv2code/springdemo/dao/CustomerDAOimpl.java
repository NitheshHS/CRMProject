package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOimpl implements CustomerDAO {

	@Autowired
	private SessionFactory factory;

	@Override
	public List<Customer> getCustomers() {
		Session session = factory.getCurrentSession();
		Query<Customer> theQuery = session.createQuery("from Customer",Customer.class);

		List<Customer> customers = theQuery.getResultList();
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		Session session=factory.getCurrentSession();
		
		
		session.saveOrUpdate(theCustomer);
		
		
		
	}

	@Override
	public Customer getCustomer(int theId) {
		Session session = factory.getCurrentSession();
		
		Customer theCustomer = session.get(Customer.class, theId);
		return theCustomer;
	}

	@Override
	public void deleteCustomer(int theId) {
		Session session = factory.getCurrentSession();
		
		 Query theQuery = session.createQuery("delete from Customer where id=:customerId");
		theQuery.setParameter("customerId", theId);
		theQuery.executeUpdate();
	}

}
