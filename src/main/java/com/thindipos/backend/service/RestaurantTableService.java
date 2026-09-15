package com.thindipos.backend.service;

import com.thindipos.backend.entity.RestaurantTable;
import com.thindipos.backend.repository.RestaurantTableRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantTableService {

    private final RestaurantTableRepository tableRepository;

    public RestaurantTableService(RestaurantTableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    public RestaurantTable saveTable(RestaurantTable table) {
        return tableRepository.save(table);
    }

    public List<RestaurantTable> getAllTables() {
        return tableRepository.findAll();
    }

    public Optional<RestaurantTable> getTableById(Long id) {
        return tableRepository.findById(id);
    }

    public void deleteTable(Long id) {
        tableRepository.deleteById(id);
    }
}