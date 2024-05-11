

import exception.WrongLoginException;
import exception.WrongPasswordException;


public class Main {

    public static void main(String[] args) {

        String login = "1234567890123456789_";
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

}

