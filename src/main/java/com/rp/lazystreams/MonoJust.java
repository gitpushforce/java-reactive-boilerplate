package com.rp.lazystreams;

import reactor.core.publisher.Mono;

public class MonoJust {
    public static void main(String[] args) {
        Mono<Integer> mono = Mono.just(1);

        // this won't work because need to subscribe
        //System.out.println(mono);

        mono.subscribe(i -> System.out.println("Received: " + i));
    }
}
