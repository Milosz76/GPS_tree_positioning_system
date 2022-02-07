package com.mvc.treeapp.service;

import com.mvc.treeapp.model.dto.UserDTO;
import com.mvc.treeapp.model.entity.User;
import com.mvc.treeapp.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private ModelMapper modelMapper;
    private UserRepository userRepository;

    public UserService(ModelMapper modelMapper, UserRepository userRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    public void createUser(UserDTO userDTO){
        User user = modelMapper.map(userDTO,User.class);
        userRepository.save(user);
    }
}
