package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBasis;
    private int secondBasis;
    private int height;

    public void setFirstBasis(int firstBasis) {
        this.firstBasis = firstBasis;
    }

    public float getFirstBasis() {
        return firstBasis;
    }

    public void setSecondBasis(int secondBasis) {
        this.secondBasis = secondBasis;
    }

    public float getSecondBasis() {
        return secondBasis;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return ((firstBasis + secondBasis) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area - "
                    + getArea() + "," + " firstBasis " + "- " + firstBasis + ","
                    + " secondBasis " + "- " + secondBasis + "," + " height " + "- " + height
                    + "," + " color - " + getColor());
    }
}

