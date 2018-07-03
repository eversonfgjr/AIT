package br.ufu.ppgco;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
@ComponentScan()
public class Configuracao {

	/*@Bean
	public DataSource datasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/ait");
		datasource.setUsername("root");
		datasource.setPassword("0408751");
		return datasource;
	}*/
	
//	@Autowired
//	private static ApplicationContext app;
	
	@Bean
	public DataSource datasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("org.postgresql.Driver");
		datasource.setUrl("jdbc:postgresql://localhost:5432/ait-db");
		datasource.setUsername("aituser");
		datasource.setPassword("iniciar");
		return datasource;
	}
	
		
	public static void main(String[] args) {
		
//		for (String bean: app.getBeanDefinitionNames()) {
//			System.out.println(bean);
//		}
//		
		
		SpringApplication.run(Configuracao.class, args);
	}
}
