package com.IndianPremierLeague.appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
//@EnableWebSecurity
@EnableSwagger2
public class AppConfig{

//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		String passwordencodedUser = passwordEncoder.encode("user123");
//		String passwordencodedAdmin = passwordEncoder.encode("admin123");
//		auth.inMemoryAuthentication().withUser("user").password(passwordencodedUser).roles("USER").and()
//				.withUser("admin").password(passwordencodedAdmin).roles("ADMIN");
//	}

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable();
//		http.authorizeRequests().antMatchers("/home/**").permitAll().antMatchers("/user/**").hasRole("USER")
//				.antMatchers("/admin/**").hasRole("ADMIN").and().httpBasic();
//	}

	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();
	}

//	@Bean
//	public PasswordEncoder encoder() {
//		return new BCryptPasswordEncoder();
//	}
	@Bean
	public WebMvcConfigurer getCorsConfiguration() {
		return new WebMvcConfigurer() {
		@Override	
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/**").
			allowedOrigins("http://localhost:8080").allowedMethods("*")
			.allowedHeaders("*");
		}
		};
	

}

}