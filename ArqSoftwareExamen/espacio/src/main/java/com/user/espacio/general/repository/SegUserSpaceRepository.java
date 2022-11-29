package com.user.espacio.general.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.espacio.general.model.GdcSpace;
import com.user.espacio.general.model.SegUserSpace;

public interface SegUserSpaceRepository extends JpaRepository<SegUserSpace, GdcSpace>  {
    
}
