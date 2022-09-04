public class Main {
    public static void main(String[] args) throws WrongValueException {

        double d = GeometryCalculator.getCircleSquare(-20);
        System.out.println("Площадь круга = " + d);
        System.out.println("Площадь прямоугольника = " + GeometryCalculator.getRectangleSquare(14, 8));
    }
}
