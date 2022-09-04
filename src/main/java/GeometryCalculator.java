public class GeometryCalculator {

    public static double getCircleSquare(double radius) throws WrongValueException {
        if (radius > 0) {
            return Math.PI * radius * radius;
        } else {
            throw new WrongValueException(" ");
        }
    }


    public static double getRectangleSquare(double length, double width) throws WrongValueException {
        if (length > 0 && width > 0) {
            return length * width;
        } else {
            throw new WrongValueException(" ");
        }
    }
}
