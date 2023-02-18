package com.rp.mono;

import com.rp.util.Util;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

public class Lec06SupplierRefactoring {
    public static void main(String[] args) {
        //getName(); // this won't execute the pipeline, this will only create the pipeline

        // This still has a blocking behavior
        //getName().subscribe(Util.onNext());

        // Asynchronous behaviour (non-blocking)
        // pipeline is being executed but is not being printed.
        // the main thread is being exited before the pipeline gets executed completely
        // to see the result we can add a delay (we don't do it in real life)
        getName()
                .subscribeOn(Schedulers.boundedElastic())
                .subscribe(Util.onNext());

        Util.sleepSeconds(4);

    }

    private static Mono<String> getName() {
        System.out.println("getName method");
        return Mono.fromSupplier(() -> {
            System.out.println("Generating name");
            // since the pipeline building time and execution time are so fastqq
            // Just putting this line for this example, to get a delay to easily know that it is executing
            Util.sleepSeconds(3);
            return Util.faker().name().fullName();
        }).map(String::toUpperCase);
    }
}
