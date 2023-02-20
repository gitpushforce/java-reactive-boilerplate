package com.rp.flux;

import com.rp.util.Util;
import reactor.core.publisher.Flux;

public class Lec10FluxToMono {
    public static void main(String[] args) {
        // the result of this will be 4 only .
        // Because next() is returning only 1 value and the filter says it wants the values bigger than 3
        Flux.range(1, 10)
                .filter(i -> i > 3)
                .next()  // gives 1 item
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

    }
}
