package be.intecbrussel.sellers;

public class Stock {
    private int iceRocket;
    private int cones;
    private int balls;
    private int magni;

    public Stock(int iceRocket, int cones, int balls, int magni) {
        setIceRocket(iceRocket);
        setCones(cones);
        setBalls(balls);
        setMagni(magni);
    }

    public int getIceRocket() {
        return iceRocket;
    }

    public int getCones() {
        return cones;
    }

    public int getBalls() {
        return balls;
    }

    public int getMagni() {
        return magni;
    }

    public void setIceRocket(int iceRocket) {
        if (iceRocket < 0) {
            this.iceRocket = -iceRocket;
        }else {
            this.iceRocket = iceRocket;
        }
    }

    public void setCones(int cones) {
        if (cones < 0) {
            this.cones = -cones;
        }else {
            this.cones = cones;
        }

    }

    public void setBalls(int balls) {
        if (balls < 0) {
            this.balls = -balls;
        }else {
            this.balls = balls;
        }
    }

    public void setMagni(int magni) {
        if (magni < 0) {
            this.magni = -magni;
        }else {
            this.magni = magni;
        }
    }
}
