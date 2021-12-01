package be.intecbrussel.eatables;



public class Cone implements Eatable {

    private Flavors[] balls;

    public Cone() {

    }

    public Cone(Flavors[] balls) {
        this.balls = balls;
    }


    public enum Flavors {

        STRAWBERRY, BANANA, CHOCOLATE, VANILLA, LEMON, STRACIATELLA, MOKKA, PISTACHE

    }


    @Override
    public void eat() {

        for (Flavors v : balls) {
            System.out.println(v.toString());
        }
    }
}
