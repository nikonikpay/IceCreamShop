package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller{

    private PriceList priceList;
    private Stock stock;
    private double profit;


    public IceCreamCar(PriceList priceList, Stock stock) {
        setPriceList(priceList);
        setStock(stock);
    }






    private Cone prepareCone(Cone.Flavors[] flavors) throws NoMoreIceCreamException{

        Cone cone = new Cone(flavors);

        if (stock.getCones() <= 0 || stock.getBalls() <= 0) {
            try {
                throw new NoMoreIceCreamException("There is No more Ice Cream");
            } catch (NoMoreIceCreamException e) {
                System.out.println("There is No More ICe  cream");
            }

        } else {
            profit += priceList.getBallPrice() * flavors.length;
            stock.setCones(stock.getCones() - 1);
            stock.setBalls(stock.getBalls() - flavors.length);
        }
        return cone;
    }


    private IceRocket prepareRocket(){
        IceRocket iceRocket = new IceRocket();

        if (stock.getIceRocket() <=0) {
            try {
                throw new NoMoreIceCreamException("There is no More ice rocket");
            }catch (NoMoreIceCreamException e) {
                System.out.println("There is No More Ice Rocket");
            }

        } else {
            profit += priceList.getRocketPrice();
            stock.setIceRocket(stock.getIceRocket()-1);
        }
        return iceRocket;
    }

    private Magnum prepareMagnum(Magnum.MagnumType type){

        Magnum magnum = new Magnum(type);

        if (stock.getMagni() <= 0) {
            try {
                throw new NoMoreIceCreamException("No more Magnum");
            } catch (NoMoreIceCreamException e) {
                System.out.println("No more Magnum");
            }

        } else {
            profit += priceList.getMagnumPrice(type);
            stock.setMagni(stock.getMagni() - 1);
        }
        return magnum;
    }


    @Override
    public Cone orderCone(Cone.Flavors[] flavors) {
        this.prepareCone(flavors);
        return new Cone(flavors);
    }

    @Override
    public IceRocket orderIceRocket() {
        this.prepareRocket();
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        Magnum magnum = new Magnum(type);
        this.prepareMagnum(type);
        return magnum;
    }

    @Override
    public double getProfit() {
        return profit;
    }

    public void setPriceList(PriceList priceList) {
        this.priceList = priceList;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
