package com.scscyber.fur.service;

import com.scscyber.fur.model.pojo.Manufacturer;
import com.scscyber.fur.repository.ManufacturerRepository;
import com.scscyber.fur.service.itf.IManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerService implements IManufacturerService {

    @Autowired
    private final ManufacturerRepository repository;

    public ManufacturerService(ManufacturerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Manufacturer> getAllManufacturer() {
        return repository.getAllManufacturer();
    }
}
