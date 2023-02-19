package com.rp.flux;

import com.rp.util.Util;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.stream.Stream;

public class Lec04FluxFromStream {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();

        // in this way can't use the stream twice
        //stream.forEach(System.out::println);
        //stream.forEach(System.out::println);

        // this won't work for using multiple subscribers because we are just passing
        // the reference "stream" that is already closed with the 1st use
        //Flux<Integer> integerFlux = Flux.fromStream(() -> stream);

        Flux<Integer> integerFlux = Flux.fromStream(() -> list.stream());

        integerFlux.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );

        integerFlux.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );

    }
}
