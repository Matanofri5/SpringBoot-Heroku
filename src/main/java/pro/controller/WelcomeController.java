package pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pro.beans.Customer;
import pro.repository.CustomerRepository;
import pro.service.impl.CustomerServiceImpl;


@RestController
public class WelcomeController {
	
	


	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private CustomerServiceImpl customerServiceImpl;

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to spring boot heroku application !!";
	}
	
	
	
	
	
	
	
	
	
	
	@PostMapping("/createCustomer")
	public ResponseEntity<String> createCustomer(@RequestBody Customer customer) throws Exception {
		try {
			customer = customerServiceImpl.CreateCustomer(customer);
			return new ResponseEntity<>("Customer " + customer.getFirstName() + " has been created   " + customer,
					HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>("This customer already exist, please try another name",
					HttpStatus.UNAUTHORIZED);
		}
	}
	
	
	@GetMapping("/getAllCustomers")
	public ResponseEntity<List<Customer>> allCustomers() {
		ResponseEntity<List<Customer>> result = new ResponseEntity<List<Customer>>(customerServiceImpl.getAllCustomers(),
				HttpStatus.OK);
		return result;
	}
	
}
