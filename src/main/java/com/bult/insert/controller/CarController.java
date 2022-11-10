package com.bult.insert.controller;

import com.bult.insert.entity.Car;
import com.bult.insert.model.CarsModel;
import com.bult.insert.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/saveAll")
    private String saveBulkRecord(@RequestBody CarsModel cars) {
        System.out.println(cars);
        carService.saveCarsDetail(cars);
        return "Saved...";
    }

    @GetMapping("/testSaveAll")
    private void testSaveAll() {
        carService.testSaveAll();
    }
}
