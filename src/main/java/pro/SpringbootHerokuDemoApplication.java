package pro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import pro.beans.Customer;
import pro.repository.CustomerRepository;

@SpringBootApplication
@ComponentScan({ "pro" })
public class SpringbootHerokuDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootHerokuDemoApplication.class, args);
		System.out.println("Application is running !!!!");
	}

	@Autowired
	private CustomerRepository customerRepository;
	
	
//	@Override
//	public void run(String... args) throws Exception {
//		this.customerRepository.save(new Customer("Matan", "Ofri", "Menashe 3"));
//		this.customerRepository.save(new Customer("idan", "Ofri", "Menashe 3"));
//		this.customerRepository.save(new Customer("Nissim", "Ofri", "Menashe 3"));
//		this.customerRepository.save(new Customer("Shani", "Ofri", "Eilat"));
//		
//	}

}
