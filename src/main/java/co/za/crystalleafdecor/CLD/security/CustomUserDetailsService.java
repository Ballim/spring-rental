//package co.za.crystalleafdecor.CLD.security;
//
//import co.za.crystalleafdecor.CLD.domain.entity.User;
//import co.za.crystalleafdecor.CLD.persistance.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//    @Autowired
//    UserService userService;
//
//    public UserDetails loadUser(Long id) throws UsernameNotFoundException{
//        User user = userService.getUserById(id).get();
//        UserDetails userDetails =
//                org.springframework.security.core.userdetails.User.builder()
//                        .username(user.getEmail())
//                        .password(user.getPassword())
//                        .roles("ADMIN")
//                        .build();
//        return userDetails;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return null;
//    }
//}
