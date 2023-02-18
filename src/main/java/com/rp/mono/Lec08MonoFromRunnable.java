package com.rp.mono;

import com.rp.util.Util;
import reactor.core.publisher.Mono;

// From Runnable, it is useful because notifies us when an operation is completed
public class Lec08MonoFromRunnable {
    public static void main(String[] args) {

        Mono.fromRunnable(timeConsumingProcess())
                .subscribe(Util.onNext(),
                        Util.onError(),
                        // this runnable depends on timeConsumingProcess. When timeConsumingProcess finishes, this one is executed
                        () -> {
                            System.out.println("process is done, Sending emails...");
                        });
    }

    private static Runnable timeConsumingProcess() {
        return () -> {
            Util.sleepSeconds(3);
            System.out.println("Operation completed");
        };
    }

}
