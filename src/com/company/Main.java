package com.company;
public class Main {
    public static void main(String[] args){
        Boss boss = new Boss();
        boss.setBossDefence("Physical");
        boss.setDamage(70);
        boss.setHealth(1000);

        System.out.println("Boss Health: " + boss.getHealth() + "\n boss damage:" + boss.getDamage() + "\n type of boss defence" + boss.getBossDefence());
        for (int i = 0; i < createHeroas().length; i++) {
            System.out.println(createHeroas()[i].getHealth() + "," + createHeroas()[i].getDamage());
        }
    }
    private static Hero[] createHeroas(){
        Hero physical = new Hero(250,40);
        Hero magic = new Hero(150,30);
        Hero asan = new Hero(300,60);
        Hero[] superHero = {
                physical, magic, asan
        };
         return superHero;
    }

}