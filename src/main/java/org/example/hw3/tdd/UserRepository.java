package org.example.hw3.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if (user.isAuthenticate) {
            data.add(user);
        } else {
            try {
                throw new AuthenticateException("Пользователь не аутентифицирован");
            } catch (AuthenticateException e) {
                System.out.println("Проблемы с аутентификацией, попробуйте еще раз");
            }
        }
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

}