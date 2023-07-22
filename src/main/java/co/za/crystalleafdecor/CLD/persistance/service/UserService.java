package co.za.crystalleafdecor.CLD.persistance.service;

import co.za.crystalleafdecor.CLD.domain.entity.User;
import co.za.crystalleafdecor.CLD.persistance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
