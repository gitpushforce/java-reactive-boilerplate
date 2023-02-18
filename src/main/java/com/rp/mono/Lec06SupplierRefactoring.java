package com.rp.mono;

import com.rp.util.Util;
import reactor.core.publisher.Mono;

public class Lec06SupplierRefactoring {
    public static void main(String[] args) {
        //getName(); // this won't execute the pipeline, this will only create the pipeline
        getName().subscribe(Util.onNext());
    }

    private static Mono<String> getName() {
        System.out.println("getName method");
        return Mono.fromSupplier(() -> {
            System.out.println("Generating name");
            // since the pipeline building time and execution time are so fast
            // Just putting this line for this example, to get a delay to easily know that it is executing
            Util.sleepSeconds(3);
            return Util.faker().name().fullName();
        }).map(String::toUpperCase);
    }
}
