package com.scscyber.fur.endpoint;

import com.scscyber.fur.model.pojo.Manufacturer;
import com.scscyber.fur.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/manufacturer")
public class ManufacturerController {
    @Autowired
    private ManufacturerService service;

    @GetMapping("")
    public ResponseEntity<List<Manufacturer>> getAllManufacturer(){
        List<Manufacturer> resultList = service.getAllManufacturer();

        if(resultList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(resultList, HttpStatus.OK);
    }
}
