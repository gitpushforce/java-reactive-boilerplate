package com.rp.flux;

import com.rp.flux.helper.NameGenerator;
import com.rp.util.Util;

import java.util.List;

public class Lec07FluxVsList {
    public static void main(String[] args) {

        //List (data comes all together when all data is available)
        List<String> names = NameGenerator.getNames(5);
        System.out.println(names);

        //Flux (data come 1 by one when it's available)
        NameGenerator.getNamesFlux(5)
                .subscribe(Util.onNext());
    }
}
