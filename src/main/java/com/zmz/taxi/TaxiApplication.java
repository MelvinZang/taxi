package com.zmz.taxi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zmz.taxi.dao")
public class TaxiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxiApplication.class, args);
	}
}
