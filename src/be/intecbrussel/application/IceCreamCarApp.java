package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.*;

import static be.intecbrussel.eatables.Cone.Flavors.*;

public class IceCreamCarApp {

    public static void main(String[] args) {


        PriceList priceList = new PriceList(3.2, 3.0, 7.9);
        Stock stock = new Stock(5, 5, 98, 6);
        IceCreamSeller iceCream = new IceCreamCar(priceList, stock);
        Eatable[] eatables = new Eatable[7];

        eatables[0] = iceCream.orderIceRocket();
        eatables[1] = iceCream.orderIceRocket();
        eatables[2] = iceCream.orderMagnum(Magnum.MagnumType.WHITECHOCOLATE);
        eatables[3] = iceCream.orderMagnum(Magnum.MagnumType.ALPINENUTS);
        eatables[4] = iceCream.orderCone(new Cone.Flavors[] {PISTACHE, BANANA});
        eatables[5] = iceCream.orderCone(new Cone.Flavors[] {LEMON, VANILLA});
        eatables[6] = iceCream.orderCone(new Cone.Flavors[] {MOKKA, STRAWBERRY});

        for (Eatable e : eatables) {
            try {
                e.eat();
            } catch (NoMoreIceCreamException message) {
                message.getMessage();
            }
        }
        String profit = "your profit is %.2f";
        System.out.printf(profit, iceCream.getProfit());
    }
}
