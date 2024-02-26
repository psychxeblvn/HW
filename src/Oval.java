import java.util.Objects;

public class Oval extends Circle {

    private int radius2;

    public Oval(int radius, int radius2) {
        super(radius);
        this.radius2 = radius2;
    }

    @Override
    public void printPerimetr() {
        System.out.println("Длина овала: " + 2 * Math.PI * (getRadius() + radius2));
    }

    @Override
    public void printArea() {
        System.out.println("Площадь овала: " + Math.PI * getRadius() * radius2);
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Переопределил equals в классе овал");
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius2);
    }
}
