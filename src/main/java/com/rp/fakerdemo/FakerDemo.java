package com.rp.fakerdemo;

import net.datafaker.Faker;

public class FakerDemo {

    private static Faker faker = new Faker();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(faker.funnyName().name());
            System.out.println(faker.brand().car());
        }
    }
}
