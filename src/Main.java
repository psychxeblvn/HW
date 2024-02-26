//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        circle.printPerimetr();
        circle.printArea();
        circle.equals(3);

        Oval oval = new Oval(5,5);
        oval.printPerimetr();
        oval.printArea();
        oval.equals(1);

        Object object = new Object();

    }
}