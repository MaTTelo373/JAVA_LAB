package pl.arendt;

import pl.arendt.devices.Car;
import pl.arendt.devices.Phone;

public class Main {

    public static void main(String[] args){
        /*
        Animal cat = new Animal("Luck", Species.CAT);
        System.out.println(cat.toString());
        cat.feed(0.01);
        cat.takeForAWalk(60*5);
        System.out.println(cat.toString());

        System.out.println("--------------------------------");

        Animal spider = new Animal("Ghost", Species.SPIDER);
        System.out.println(spider.toString());
        spider.feed(0.001);
        spider.takeForAWalk(60*105);
        System.out.println(spider.toString());
        */

        /*
        System.out.println("--------------------------------");
        Human man = new Human("Mateusz", "Arendt");


        System.out.println(man.toString());
        man.getSalary();
        man.setSalary(3000d);
        System.out.println("--------------------------------");
        man.setSalary(3500d);
        System.out.println(man.toString());
        System.out.println("--------------------------------");


        //Zadanie 5: check if you could buy it
        man.setCar(new Car("Seicento", "Fiat", 3000d));
        System.out.println(man.toString());
        System.out.println("--------------------------------");
        man.setCar(new Car("Ceed", "Kia", 25000d));
        System.out.println(man.toString());
        System.out.println("--------------------------------");
        man.setCar(new Car("Audi", "A4", 150000d));
        System.out.println(man.toString());
         */

        /*
        //Zadanie 6: one more thing
        System.out.println("--------------------------------");
        Human me = new Human("Mateusz", "Arendt");
        System.out.println("--------------------------------");
        System.out.println(me.toString());
        Human boss = new Human("Mikolaj", "Karolinski");
        System.out.println("--------------------------------");
        System.out.println(boss.toString());
        System.out.println("--------------------------------");
        System.out.println(me + " = " + boss + " ? " + me.equals(boss));
        */

        //Zadanie 7: create Device class
        Car c1 = new Car("Seicento", "Fiat", 2003, 3000d);
        System.out.println(c1.toString());
        System.out.println("--------------------------------");
        Car c2 = new Car("Ceed", "Kia", 2013, 25000d);
        Car c3 = new Car("Ceed", "Kia", 2013, 25000d);
        System.out.println(c2.toString());
        System.out.println("--------------------------------");
        System.out.println(c2 + " = " + c3 + " ? " + c2.equals(c3));
        System.out.println(c1 + " = " + c2 + " ? " + c1.equals(c2));

        System.out.println("--------------------------------");
        System.out.println(c2.toString());
        c2.turnOn();

        Phone phone = new Phone("Apple", "Iphone 12", 2021);
        System.out.println("--------------------------------");
        System.out.println(phone.toString());
        phone.turnOn();


    }
}
