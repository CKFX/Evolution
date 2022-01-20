package com.sxb.evolution.data;

import java.util.ArrayList;
import java.util.List;

/**
 * 生态环境
 */
public class Earth {
    public List<Animal> animals; //生物集
    //***********下方环境参数*****************//
    public Integer      water;
    public Integer      co2;
    public Integer      o2;
    public Integer      light;

    public Earth() {
        this.animals = new ArrayList<>();
        water = 10;
        co2 = 10;
        o2 = 10;
        light = 10;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
