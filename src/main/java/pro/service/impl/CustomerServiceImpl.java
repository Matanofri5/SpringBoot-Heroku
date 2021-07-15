package pro.service.impl;

import java.util.List;

import pro.beans.Customer;

public interface CustomerServiceImpl {

	Customer CreateCustomer(Customer customer) throws Exception;

	List<Customer> getAllCustomers();
}
