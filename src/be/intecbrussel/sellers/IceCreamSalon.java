package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

import java.util.Formatter;

public class IceCreamSalon implements IceCreamSeller {
    private PriceList priceList;
    private double totalProfit;


    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public Cone orderCone(Cone.Flavors[] flavors) {
        totalProfit += priceList.getBallPrice()*flavors.length;

       return new Cone(flavors);
    }

    @Override
    public IceRocket orderIceRocket() {

        totalProfit += priceList.getRocketPrice();
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {

        totalProfit += priceList.getMagnumPrice(type);
        return new Magnum(type);
    }

    @Override
    public String toString() {
        Formatter formatter = new Formatter();
        String profit = "your profit is %.2f";
        formatter.format(profit, getProfit());

        return formatter.toString();
    }
}
