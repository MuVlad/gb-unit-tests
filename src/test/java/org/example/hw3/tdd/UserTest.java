package org.example.hw3.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;
    User user1;
    @BeforeEach
    void setUp() {
        user = new User("Alex", "qwerty", Role.USER);
        user.authenticate();

        user1 = new User("John", "ytrewq", Role.ADMIN);
        user1.authenticate();

    }
    @Test
    void unLogin() {
        assertTrue(user.unLogin());
        assertFalse(user1.unLogin());
    }
}