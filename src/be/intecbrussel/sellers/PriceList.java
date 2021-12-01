package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;

public class PriceList {

    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public PriceList() {
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        setBallPrice(ballPrice);
        setRocketPrice(rocketPrice);
        setMagnumStandardPrice(magnumStandardPrice);
    }


    public double getBallPrice() {
        return ballPrice;
    }


    public double getRocketPrice() {
        return rocketPrice;
    }


//    public double getMagnumStandardPrice() {
//        return magnumStandardPrice;
//    }


    public double getMagnumPrice(Magnum.MagnumType magnumType) {


        if (magnumType == Magnum.MagnumType.ALPINENUTS) {
            return magnumStandardPrice * 1.5;
        } else {
            return magnumStandardPrice;
        }


    }

    public void setRocketPrice(double rocketPrice) {
        if (rocketPrice<0){
            this.rocketPrice = -rocketPrice;
        }else {
            this.rocketPrice = rocketPrice;
        }

    }

    public void setBallPrice(double ballPrice) {
        if (ballPrice < 0) {
            this.ballPrice = -ballPrice;
        }else {
            this.ballPrice = ballPrice;
        }

    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        if (magnumStandardPrice < 0) {
            this.magnumStandardPrice = -magnumStandardPrice;
        }else{
            this.magnumStandardPrice = magnumStandardPrice;
        }

    }
}
