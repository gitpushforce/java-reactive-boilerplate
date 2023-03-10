package com.rp.mono;

import reactor.core.publisher.Mono;

public class Lec03_01MonoSubscribe {
    public static void main(String[] args) {

        // publisher
        Mono<String> mono = Mono.just("ball");

        mono.subscribe (
                item -> System.out.println(item),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("completed")
        );
    }
}
