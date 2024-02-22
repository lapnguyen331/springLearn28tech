package com.example.osahaneat.service;

import com.example.osahaneat.dto.UserDTO;
import com.example.osahaneat.entity.Users;
import com.example.osahaneat.repository.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {
    @Autowired
    UserInterface userInterface;
    public List<UserDTO> getAllUser(){
        List<Users> userList= userInterface.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();
        for(Users user : userList){
            userDTOList.add(new UserDTO(user.getId(),user.getUserName(),user.getPassword(),user.getFullname(),user.getCreated_date()));
//            System.out.println(user.getFullname());
        }
        return userDTOList;
    }
}
