package co.za.crystalleafdecor.CLD.persistance.service;

import co.za.crystalleafdecor.CLD.domain.entity.User;
import co.za.crystalleafdecor.CLD.persistance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id){ return userRepository.findById(id);}

    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User newUser(User user){
        return userRepository.save(user);
    }
}
