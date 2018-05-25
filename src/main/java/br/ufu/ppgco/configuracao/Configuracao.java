package br.ufu.ppgco.configuracao;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootConfiguration
public class Configuracao {

	@Bean
	public DataSource datasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/ait-db");
		datasource.setUsername("root");
		datasource.setPassword("0408751");
		return datasource;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Configuracao.class, args);
	}
}
