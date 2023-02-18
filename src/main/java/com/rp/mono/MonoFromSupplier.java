package com.rp.mono;

import com.rp.util.Util;
import reactor.core.publisher.Mono;

public class MonoFromSupplier {
    public static void main(String[] args) {

        // use "just" only when you have data already
        // Mono<String> mono = Mono.just(getName());

        // use fromSupplier when you are going to calculate new data.
        Mono<String> mono = Mono.fromSupplier(() -> getName());
        mono.subscribe(Util.onNext());
    }

    private static String getName() {
        System.out.println("Generating name");
        return Util.faker().name().fullName();
    }
}
