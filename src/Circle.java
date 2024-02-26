import java.util.Objects;

public class Circle extends Figure {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void printPerimetr() {
        System.out.println("Длина круга: " + 2 * Math.PI * radius);
    }

    @Override
    public void printArea() {
        System.out.println("Площадь круга: " + Math.PI * (radius*radius));
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Переопределил equals в классе круг");
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
