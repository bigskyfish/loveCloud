package com.floatCloud.loveLearn;

import java.time.LocalDate;
import java.time.LocalTime;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@MapperScan(basePackages = "com.floatCloud.loveLearn.sysOa.dao")
@Slf4j
public class LoveLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoveLearnApplication.class, args);
		log.info("《《《《《《 LoveLearn started up successfully at {} {} 》》》》》》", LocalDate.now(), LocalTime.now());
	}

}
