package exception;

public class WrongPasswordException extends Exception{


    public WrongPasswordException() {
        super(" ОШИБКА.Login должен содержать в себе только латинские буквы, цифры и знак подчеркивания.");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}