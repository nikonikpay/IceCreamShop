package be.intecbrussel.eatables;

import static be.intecbrussel.eatables.Magnum.MagnumType.*;

public class Magnum implements Eatable {


    private MagnumType magnumType;


    public Magnum(){

    }

    public Magnum(MagnumType magnumType){
        this.magnumType = magnumType;
    }

    public MagnumType getMagnumType() {
        return magnumType;
    }

    public enum MagnumType {
        MILKCHOCOLATE, WHITECHOCOLATE, BLACKCHOCOLATE, ALPINENUTS, ROMANTICSTRAWBERRIES
    }

    @Override
    public void eat() {

        System.out.println("I am eating "+getMagnumType());



    }
}
