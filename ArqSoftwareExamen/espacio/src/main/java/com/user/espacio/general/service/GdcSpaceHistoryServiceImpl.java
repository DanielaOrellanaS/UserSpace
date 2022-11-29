package com.user.espacio.general.service;

public class GdcSpaceHistoryServiceImpl {
    @Autowired
    GdcSpaceHistoryRepository gdcSpaceHistoryRepository;

    @Override
    public List<GdcSpaceHistory> getSpaceValue() {
        return gdcSpaceHistoryRepository.findAll();
    }
}
