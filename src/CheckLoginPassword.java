import exception.WrongLoginException;

public class CheckLoginPassword {
    public static void check (String login, String password, String confirmPassword) throws WrongLoginException {
        if (login.length() > 20) {
              throw  new WrongLoginException("ОШИБКА.У логина есть ограничение по длине – он должен быть равен или меньше 20 символов");
        }
        boolean matches = login.matches("[a-zA-Z0-9_]+");   //С регулярным выражением
        if (!matches) {
            throw new WrongLoginException(" ОШИБКА.Login должен содержать в себе только латинские буквы, цифры и знак подчеркивания.");
        }
}}
