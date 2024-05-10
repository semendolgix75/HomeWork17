

import exception.WrongLoginException;
import exception.WrongPasswordException;



public class Main {


    public static void main(String[] args) {

        String login = "12345678902345678901";
        System.out.println("Введен логин: " + login);

        String password = "123456*";
        System.out.println("Введен пароль: " + password);
        String confirmPassword = "123456*";
        System.out.println("Повтор пароля: " + confirmPassword);
        try {
            CheckLoginPassword.check(login,password,confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());

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
//        {
//            if(it.current() < '0' | it.current() > '9' & it.current() < 'A' |
//                    it.current() > 'Z' & it.current() < 'a' & it.current() != '_' | it.current() > 'z'){
//                throw new WrongLoginException();
//            }
//            it.next();
//        }
    }

    public static void checkPasswords(String password, String confirmPassword) throws WrongPasswordException {

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException(" ОШИБКА. Пароли  должны быть равны.");
        }

        if (password.length() >= 20) {
            throw new WrongPasswordException(" ОШИБКА. Пароль длиннее 20 символов");
        }

        char[] character = password.toCharArray();
        for (char ch : character) {
            if (ch < '0' | ch > '9' & ch < 'A' |
                    ch > 'Z' & ch < 'a' & ch != '_' | ch > 'z') {
                throw new WrongPasswordException();
            }
        }

    }
}

