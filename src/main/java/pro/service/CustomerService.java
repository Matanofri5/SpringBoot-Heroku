//package pro.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Service;
//
//import pro.beans.Customer;
//import pro.repository.CustomerRepository;
//import pro.service.impl.CustomerServiceImpl;
//
//@Service
//public class CustomerService  implements CustomerServiceImpl{
//
//	@Autowired
//	private CustomerRepository customerRepo;
//	
//	public boolean checkIfCustomerAlreadyExist(String customerName) {
//		if (customerRepo.findByFirstName(customerName)!=null) {
//			return true;
//		}
//		return false;
//	}
//	
//	@Override
//	public Customer CreateCustomer (Customer customer) throws Exception {
//		if (checkIfCustomerAlreadyExist(customer.getFirstName())==false) {
//			customerRepo.save(customer);
//		}else {
//			throw new Exception("This customer already exist, please try another name");
//		}
//		return customer;
//	}
////	public List<Customer> getAllCustomers(){
////		return customerRepo.findAll();
////	}
//
//}
