package com.example.demoGradle;

import com.nike.utils.CommonLogging;
import com.nike.utils.Handler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoGradleApplication {

	public static void main(String[] args) {

		CommonLogging.test();
		Handler handler= new Handler();
		System.out.println(handler.handleProductNotFound(new Exception("hello")));
		SpringApplication.run(DemoGradleApplication.class, args);
	}

}
