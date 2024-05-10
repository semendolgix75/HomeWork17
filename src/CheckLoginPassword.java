import exception.WrongLoginException;
import exception.WrongPasswordException;

public class CheckLoginPassword {
    public static void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20) {
            throw new WrongLoginException("ОШИБКА.У логина есть ограничение по длине – он должен быть равен или меньше 20 символов");
        }

        if (!login.matches("[a-zA-Z0-9_]+")) {//С регулярным выражением
            throw new WrongLoginException(" ОШИБКА.Login должен содержать в себе только латинские буквы, цифры и знак подчеркивания.");
        }
        if (password.length() >= 20) {
            throw new WrongPasswordException(" ОШИБКА. Пароль длиннее 20 символов");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException(" ОШИБКА. Пароли  должны быть равны.");
        }
        char[] character = password.toCharArray();
        for (char ch : character) {
            if (ch < '0' | ch > '9' & ch < 'A' |
                    ch > 'Z' & ch < 'a' & ch != '_' | ch > 'z') {
                throw new WrongPasswordException(" ОШИБКА.Login должен содержать в себе только латинские буквы, цифры и знак подчеркивания.");
            }
        }


    }
}
