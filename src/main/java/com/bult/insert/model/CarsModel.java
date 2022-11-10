package com.bult.insert.model;

import com.bult.insert.entity.Car;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

public class CarsModel {

    private List<Car> cars;


    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "CarsModel{" +
                "cars=" + cars +
                '}';
    }
}
