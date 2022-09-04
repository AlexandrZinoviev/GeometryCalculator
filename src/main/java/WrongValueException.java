public class WrongValueException extends Exception{

    public WrongValueException(String message) {
        super("Значение не может быть меньше или равно 0");
    }

}
