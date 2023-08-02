//package co.za.crystalleafdecor.CLD.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig{
//
//    @Bean
//    public UserDetailsService userDetailsService(){
//        UserDetails userDetails=
//                User.withDefaultPasswordEncoder().username("user").password("{noop}password").roles("ROLE").build();
//
//        return new InMemoryUserDetailsManager(userDetails);
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
//        http.authorizeHttpRequests()
//                .requestMatchers("/item").permitAll()
//                .requestMatchers("/user").hasRole("ADMIN")
//                .anyRequest().authenticated()
//                .and()
//                .httpBasic();
//
//        return http.build();
//    }
//}
//
