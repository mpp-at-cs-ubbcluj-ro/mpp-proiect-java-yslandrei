package org.example;

import org.example.domain.Account;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1L, "name", "email", "password");
        System.out.println("Salut Lume!");
        System.out.println(account.getName());
    }
}