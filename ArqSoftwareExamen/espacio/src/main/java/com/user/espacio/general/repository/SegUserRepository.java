package com.user.espacio.general.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.espacio.general.model.SegUser;

public interface SegUserRepository extends JpaRepository<SegUser, Integer>  {
    
}
