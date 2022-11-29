package com.user.espacio.general.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.user.espacio.general.model.SegUser;
import com.user.espacio.general.repository.SegUserRepository;

public class SegUserServiceImpl implements SegUserService {
    @Autowired
    SegUserRepository segUserRepository;

    @Override
    public List<SegUser> getUsers() {
        return getUser.findAll();
    }
}
