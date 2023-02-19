package com.rp.flux;

import com.rp.util.Util;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class Lec03FluxFromArrayOrList {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c");

        // fromIterable is like "Just" in mono. Only can be used if data already exists
        Flux.fromIterable(strings)
                .subscribe(Util.onNext());
    }
}
