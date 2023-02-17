package com.rp.util;

import net.datafaker.Faker;

import java.util.function.Consumer;

public class Util {

    private static final Faker FAKER = new Faker();

    public static Consumer<Object> onNext() {
        return o -> System.out.println("received: " + o);
    }

    public static Consumer<Throwable> onError() {
        return e -> System.out.println("received: " + e.getMessage());
    }

    public static Runnable onComplete() {
        return () -> System.out.println("Completed");
    }

    public static Faker faker() {
        return FAKER;
    }
}
