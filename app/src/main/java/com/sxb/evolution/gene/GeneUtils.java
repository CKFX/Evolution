package com.sxb.evolution.gene;

import com.sxb.evolution.data.Animal;
import com.sxb.evolution.data.Earth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 由 sxb 创建
 * 在 2022/1/19
 * 获取属性工具类
 */
public class GeneUtils {

    public static Animal attGetFromGene(Animal animal, List<String[]> gene) {
        for (int i = 0; i < gene.size(); i++) {
            String[] fragment = gene.get(i);
            attGetFromFragment(animal, fragment);
        }
        return animal;
    }


    public static void attGetFromFragment(Animal animal, String[] fragment) {
        switch (fragment[0]) {
            case "体型1":
                animal.setBig(Integer.parseInt(fragment[1]));
                break;
            case "速度2":
                animal.setSpd(Integer.parseInt(fragment[1]));
                break;
            case "光合3":
                animal.setPhotosynthesis(Integer.parseInt(fragment[1]));
                break;
            case "消化4":
                animal.setDigestion(Integer.parseInt(fragment[1]));
                break;
            case "攻击5":
                animal.setPassiveAtk(fragment[1].equals("被动攻击"));
                animal.setAtk(Integer.parseInt(fragment[2]));
                break;
            case "防御6":
                animal.setDef(Integer.parseInt(fragment[1]));
                break;
            case "代谢7":
                animal.setConsumption(Integer.parseInt(fragment[1]));
                break;
        }
    }

    public static Map toNext(Earth earth) {
        if(earth != null&&earth.animals!=null) {
            List<Animal> animals = earth.animals;
            List<Animal> deathAnimals = new ArrayList<>();
            List<Animal> livedAnimals = new ArrayList<>();
            for (Animal animal : animals) {
                //生命能量 -1代表死亡
                Integer life = animal.cost();
                if (life < 0) {
                    deathAnimals.add(animal);
                    continue;
                }
                Integer costWater = animal.eat();
                earth.water = earth.water - costWater;
                if (earth.water < 0) {
                    return null;//游戏结束
                }
                livedAnimals.add(animal);
            }
            Map<String, Object> map = new HashMap();
            earth.animals = livedAnimals;
            //消亡的生物
            map.put("death", deathAnimals);
            map.put("events", null);

        }


            return null;
    }
}
