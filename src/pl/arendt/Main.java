package pl.arendt;

public class Main {

    public static void main(String[] args){
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

        System.out.println("--------------------------------");
        Human man = new Human("Mateusz", "Arendt");
        man.setCar(new Car("Ceed", "Kia"));

        System.out.println(man.toString());

    }
}
