package com.rp.mono.practice;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

public class Practice01ReadFile {
    public static void main(String[] args) {
        readFile().subscribeOn(Schedulers.boundedElastic())
                .subscribe(obj -> System.out.println("file content: " + obj));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static Mono<String> readFile() {
        return Mono.fromSupplier(() -> {
            return "file content";
        });
    }


}
