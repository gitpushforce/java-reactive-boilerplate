package com.rp.mono.practice;

import com.rp.util.Util;

public class Practice01Demo {

    public static void main(String[] args) {
        FileService.read("assignment/mono/file01.txt")
                .subscribe(Util.onNext(),
                        Util.onError(),
                        Util.onComplete());

//        FileService.write("file03.txt", "This is file 3")
//                .subscribe(Util.onNext(),
//                        Util.onError(),
//                        Util.onComplete());

        FileService.delete("file03.txt")
                .subscribe(Util.onNext(),
                        Util.onError(),
                        Util.onComplete());
    }
}
