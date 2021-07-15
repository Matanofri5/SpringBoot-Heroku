package pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "pro" })
public class SpringbootHerokuDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootHerokuDemoApplication.class, args);
	}

}
