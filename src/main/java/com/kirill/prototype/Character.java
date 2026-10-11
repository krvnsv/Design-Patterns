package com.kirill.prototype;

public class Character {

    private String name;
    private int health;
    private int attack;
    private int defense;

    public Character(
            String name,
            int health,
            int attack,
            int defense) {

        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public Character copy() {

        return new Character(
                this.name,
                this.health,
                this.attack,
                this.defense
        );
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {

        return "Character { " +
                "name= " + name + '\'' +
                ", health= " + health +
                ", attack= " + attack +
                ", defense= " + defense +
                '}';
    }
}
