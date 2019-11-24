package com.wur3.yearly;

import com.wur3.yearly.repository.EventRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses= {EventRepository.class})
public class YearlyApplication {

	public static void main(String[] args) {
		SpringApplication.run(YearlyApplication.class, args);
	}

}
