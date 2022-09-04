import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestGeometryCalculator {

    GeometryCalculator sut;

    @BeforeEach
    public void init() {
        System.out.println("test started");
        sut = new GeometryCalculator();
    }

    @AfterEach
    public void finished() {
        System.out.println("test completed");
    }

    @Test
    // Передаем положительное число
    public void testGetCircleSquareIntegerNumber() throws WrongValueException {
        //arrange
        double radius = 20, expected = 1256.6370614359173;
        //act
        double result = sut.getCircleSquare(radius);
        //assert
        assertEquals(expected, result);
    }

    @Test
    // Передаем положительное дробное число
    public void testGetCircleSquareDoubleNumber() throws WrongValueException {
        //arrange
        double radius = 20.5, expected = 1320.2543126711105;
        //act
        double result = sut.getCircleSquare(radius);
        //assert
        assertEquals(expected, result);
    }

    @Test
    // Передаем отрицательное число
    public void testGetCircleSquareNegativeNumber() {
        //arrange
        double radius = -20;
        var expected = WrongValueException.class;
        //act
        //assert
        assertThrows(expected, () -> sut.getCircleSquare(radius));
    }

    @Test
    // Передаем ноль
    public void testGetCircleSquareZero() {
        //arrange
        double radius = 0;
        var expected = WrongValueException.class;
        //act
        //assert
        assertThrows(expected, () -> sut.getCircleSquare(radius));
    }

    @Test
    // Передаем положительное число
    public void testGetRectangleSquareIntegerNumber() throws WrongValueException {
        //arrange
        double length = 20, width = 5, expected = 100;
        //act
        double result = sut.getRectangleSquare(length, width);
        //assert
        assertEquals(expected, result);
    }

    @Test
    // Передаем положительное дробное число
    public void testGetRectangleSquareDoubleNumber() throws WrongValueException {
        //arrange
        double length = 20.5, width = 4.6, expected = 94.3;
        //act
        double result = sut.getRectangleSquare(length, width);
        //assert
        assertEquals(expected, result);
    }

    @Test
    // Передаем отрицательное число
    public void testGetRectangleSquareNegativeNumber() {
        //arrange
        double length = -20, width = 5;
        var expected = WrongValueException.class;
        //act
        //assert
        assertThrows(expected, () -> sut.getRectangleSquare(length, width));
    }

    @Test
    // Передаем ноль
    public void testGetRectangleSquareZero() {
        //arrange
        double length = 0, width = 5;
        var expected = WrongValueException.class;
        //act
        //assert
        assertThrows(expected, () -> sut.getRectangleSquare(length, width));
    }

}
