package com.rp.flux;

import com.rp.util.Util;
import reactor.core.publisher.Flux;

import java.time.Duration;

public class Lec08FluxInterval {

    public static void main(String[] args) {


        Flux.interval(Duration.ofSeconds(5))
                .subscribe(Util.onNext());

        Util.sleepSeconds(10);
    }
}
