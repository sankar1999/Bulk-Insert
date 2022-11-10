package com.bult.insert.service;

import com.bult.insert.entity.Car;
import com.bult.insert.model.CarsModel;
import com.bult.insert.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository repository;


    public void testSaveAll() {
        Car Tesla = Car.builder()
                .id("101")
                .name("Tesla")
                .color("White")
                .build();

        Car Audi = Car.builder()
                .id("102")
                .name("Audi")
                .color("Blue")
                .build();

        repository.saveAll(List.of(Tesla, Audi));
    }

    public void saveCarsDetail(CarsModel cars) {

        List<Car> carsEntity = new ArrayList<>();

        System.out.println(cars);
        cars.toString();

//        cars.getCars().forEach(carDTO -> {
//            Car car = new Car();
//            car.setId(carDTO.getId());
//            car.setName(carDTO.getName());
//            car.setColor(carDTO.getColor());
//
//            carsEntity.add(car);
//        });
//        carsEntity.add((Car) carsEntity);
//        carsEntity.forEach(System.out::println);
    }
}
