package helloWorld;

/**
 * Created by wangtong on 16/11/19.
 */
public class circle implements shape {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return 3.14*r*r;
    }

    @Override
    public double getGirth() {
        return 2*3.14*r;
    }

}
