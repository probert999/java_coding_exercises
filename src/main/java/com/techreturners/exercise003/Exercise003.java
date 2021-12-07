package com.techreturners.exercise003;

import java.util.Arrays;

public class Exercise003 {

    private String[] iceCreamFlavours = { "Pistachio", "Raspberry Ripple", "Vanilla",
                                            "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };

    int getIceCreamCode(String iceCreamFlavour) {
        return java.util.Arrays.asList(iceCreamFlavours).indexOf(iceCreamFlavour);
    }

    String[] iceCreamFlavours() {
        return iceCreamFlavours;
    }

}
