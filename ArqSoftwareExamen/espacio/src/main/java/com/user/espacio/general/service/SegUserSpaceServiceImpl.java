package com.user.espacio.general.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.espacio.general.model.SegUserSpace;
import com.user.espacio.general.repository.SegUserSpaceRepository;

@Service
public class SegUserSpaceServiceImpl implements SegUserSpaceService{
    @Autowired
    SegUserSpaceRepository segUserSpaceRepository;

    @Override
    public List<SegUserSpace> getAllUsers() {
        return segUserSpaceRepository.findAll();
    }
}
