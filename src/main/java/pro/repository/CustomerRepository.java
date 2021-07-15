package pro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.beans.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Customer findByFirstName(String firstName);

	




	
	
	
}
