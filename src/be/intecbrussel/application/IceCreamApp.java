package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.PriceList;

import static be.intecbrussel.eatables.Cone.Flavors.*;

public class IceCreamApp {

    public static void main(String[] args) {

        PriceList myPriceList = new PriceList(2.5,3.3,6);
        IceCreamSalon myIceCreamSalon = new IceCreamSalon(myPriceList);

        Eatable[] eatables = new Eatable[6];
        eatables[0] = myIceCreamSalon.orderIceRocket();
        eatables[1] = myIceCreamSalon.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);
        eatables[2] = myIceCreamSalon.orderMagnum(Magnum.MagnumType.ALPINENUTS);
        eatables[3] = myIceCreamSalon.orderCone(new Cone.Flavors[] {LEMON, STRACIATELLA});
        eatables[4] = myIceCreamSalon.orderCone(new Cone.Flavors[] {MOKKA, CHOCOLATE});
        eatables[5] = myIceCreamSalon.orderCone(new Cone.Flavors[] {VANILLA, PISTACHE});

        for (Eatable e: eatables
             ) {
            if (e != null) {
                e.eat();
            }
        }
        System.out.println(myIceCreamSalon);


    }

}
