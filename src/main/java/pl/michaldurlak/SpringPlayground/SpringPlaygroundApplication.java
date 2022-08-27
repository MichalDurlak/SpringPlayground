package pl.michaldurlak.SpringPlayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//Importowanie konfiguracji z pliku spring-config
//@ImportResource("classpath:config/spring-config.xml")
@PropertySource("classpath:university.properties")
public class SpringPlaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPlaygroundApplication.class, args);
	}

}
