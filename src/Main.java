

import exception.WrongLoginException;
import exception.WrongPasswordException;


public class Main {

    public static void main(String[] args) {

        String login = "12345678901234567890";
        System.out.println("Введен логин: " + login);
        String password = "123456";
        System.out.println("Введен пароль: " + password);
        String confirmPassword = "123456";
        System.out.println("Повтор пароля: " + confirmPassword);
        try {
            CheckLoginPassword.check(login, password, confirmPassword);
            System.out.println("Пароль соответствует требованиям");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Проверка пароля завершена");
        }

    }

    public static void checkLogin(String login) throws WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException(" ОШИБКА.У логина есть ограничение по длине – он должен быть равен или меньше 20 символов");
        }
        boolean matches = login.matches("[a-zA-Z0-9_]+");   //С регулярным выражением
        if (!matches) {
            throw new WrongLoginException(" ОШИБКА.Login должен содержать в себе только латинские буквы, цифры и знак подчеркивания.");
        }
        ;
    }


}

