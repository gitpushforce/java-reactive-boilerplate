package com.rp.mono;

import com.rp.util.Util;
import reactor.core.publisher.Mono;

public class Lec03_02MonoSubscribeOnError {
    public static void main(String[] args) {
        // publisher
        Mono<Integer> mono = Mono.just("ball")
                .map(String::length)
                .map(l -> l/0);

//        mono.subscribe (
//                item -> System.out.println(item),
//                err -> System.out.println(err.getMessage()),
//                () -> System.out.println("completed")
//        );
        mono.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );
    }
}
