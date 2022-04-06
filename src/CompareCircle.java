import java.util.Arrays;

public class CompareCircle extends Circle implements Comparable<CompareCircle> {
    public CompareCircle() {
    }

    public CompareCircle(double radius, String color) {
        super(radius, color);
    }

    public CompareCircle(double radius) {
        super(radius);
    }

    public CompareCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
//
//    public int compareTo(CompareCircle o) {
//        if (getRadius() > o.getRadius()){
//            return 1;
//        }
//        else if (getRadius() < o.getRadius()){
//            return -1;
//        }
//        else {
//            return 1;
//        }
//    }


    @Override
    public int compareTo(CompareCircle o) {
        if (getRadius() > o.getRadius()) {
            return 1;
        } else if (getRadius() < o.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
}
