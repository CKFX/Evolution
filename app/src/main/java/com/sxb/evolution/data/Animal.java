package com.sxb.evolution.data;

/**
 * 由 sxb 创建
 * 在 2022/1/19
 */
public class Animal {
    private String  name  = "小草";
    private int     x;
    private int     y;
    private int     atk;
    private boolean passiveAtk; // 是否被动攻击（只有被敌人攻击后才会对敌方造成伤害）
    private int     def;
    private int     spd;
    private int     hp    = 100;  // 现有hp
    private int     MaxHp = 100;// 最大hp
    private int     big;         //  体型
    private int     maxBig;         //  最大体型
    private int     energy;      // 现有能量
    private int     consumption; // 每秒能耗
    private int     photosynthesis; // 光合作用
    private int     digestion;  // 消化

    public int water;//体内水分

    public Integer eat() { //返回消耗的外界能量
        return null;
    }

    public Integer cost() { //-1死亡
        return null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public boolean isPassiveAtk() {
        return passiveAtk;
    }

    public void setPassiveAtk(boolean passiveAtk) {
        this.passiveAtk = passiveAtk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return MaxHp;
    }

    public void setMaxHp(int maxHp) {
        MaxHp = maxHp;
    }

    public int getBig() {
        return big;
    }

    public void setBig(int big) {
        this.big = big;
    }

    public int getMaxBig() {
        return maxBig;
    }

    public void setMaxBig(int maxBig) {
        this.maxBig = maxBig;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public int getPhotosynthesis() {
        return photosynthesis;
    }

    public void setPhotosynthesis(int photosynthesis) {
        this.photosynthesis = photosynthesis;
    }

    public int getDigestion() {
        return digestion;
    }

    public void setDigestion(int digestion) {
        this.digestion = digestion;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }
}
