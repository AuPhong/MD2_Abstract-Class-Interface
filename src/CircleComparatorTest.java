import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle("indigo", false, 3.5);

        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        for (Circle circle:circles) {
            System.out.println(circle);
        }
    }
}
