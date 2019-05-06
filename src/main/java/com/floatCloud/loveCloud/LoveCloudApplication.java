package com.floatCloud.loveCloud;

import java.time.LocalDate;
import java.time.LocalTime;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@MapperScan(basePackages = "com.floatCloud.loveCloud.sysOa.dao")
@Slf4j
public class LoveCloudApplication {

	private static Logger logger = LoggerFactory.getLogger(LoveCloudApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoveCloudApplication.class, args);
		logger.info("《《《《《《 LoveCloud started up successfully at {} {} 》》》》》》", LocalDate.now(), LocalTime.now());
	}

}
