package pl.arendt;

public class Main {

    public static void main(String[] args){
        Animal cat = new Animal("Luck", Species.CAT);
        cat.feed(0.01);
        cat.takeForAWalk(60*5);

        Animal spider = new Animal("Ghost", Species.SPIDER);
        spider.feed(0.001);
        spider.takeForAWalk(60*105);
    }
}
