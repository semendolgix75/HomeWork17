package exception;

public class WrongPasswordException extends Exception{

    /**
     * Конструктор по умолчанию
     */
    public WrongPasswordException() {
        super(" ОШИБКА.Login должен содержать в себе только латинские буквы, цифры и знак подчеркивания.");
    }

    /**
     * Конструктор с выводом сообщения ошибки.
     * @param message - сообщение ошибки.
     */
    public WrongPasswordException(String message) {
        super(message);
    }
}