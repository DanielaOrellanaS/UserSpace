package com.user.espacio.general.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.user.espacio.general.model.GdcSpaceHistory;
import com.user.espacio.general.repository.GdcSpaceHistoryRepository;

public class GdcSpaceHistoryServiceImpl implements GdcSpaceHistory{
    @Autowired
    GdcSpaceHistoryRepository gdcSpaceHistoryRepository;

    @Override
    public List<GdcSpaceHistory> getSpaceValue() {
        return gdcSpaceHistoryRepository.findAll();
    }
}
