package com.sxb.evolution.data;

import com.sxb.evolution.gene.GeneUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 由 sxb 创建
 * 在 2022/1/19
 * 基因 产生对应生物的 demo
 */
public class DataToUI {



    public Earth init(){
        return new Earth();
    }

    public Map toNext(Earth earth){
        return GeneUtils.toNext(earth);
    }


//    public static void main(String[] args) {
//        Animal animal = new Animal();
//        GeneUtils.attGetFromGene(animal, Gene);
//        int atkEn = animal.atk * (animal.passiveAtk ? 0 : 1);
//        System.out.println(
//                "名称          " + animal.name + "\n" +
//                        "攻击力         " + animal.atk * animal.big + "\n" +
//                        "被动攻击        " + animal.passiveAtk + "\n" +
//                        "防御           " + animal.def * animal.big + "\n" +
//                        "速度           " + animal.spd * animal.big + "\n" +
//                        "消化力         " + animal.digestion + "\n" +
//                        "现有hp         " + animal.hp + "\n" +
//                        "最大hp         " + animal.MaxHp + "\n" +
//                        "能量           " + animal.energy + "\n" +
//                        "能耗           " + (animal.consumption + animal.spd + animal.digestion + atkEn) * animal.big + "\n" +
//                        "光合作用       " + animal.photosynthesis * animal.big + "\n" +
//                        "体型           " + animal.big + "\n");
//    }


}
