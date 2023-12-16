package com.company;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setBossDefence("Physik");

        Hero[] heroes = createHeroes();
        for (Hero hero : heroes)
            System.out.println("Health: " + hero.getHealth() + "Damage: " + hero.getDamage() + "Superpower: " + hero.getAbility());
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 20);
        Hero hero2 = new Hero(120, 25);
        Hero hero3 = new Hero(80, 18);

        return new Hero[]{hero1, hero2, hero3};
    }

}