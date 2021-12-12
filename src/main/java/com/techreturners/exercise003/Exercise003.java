package com.techreturners.exercise003;

import java.util.function.Function;
import java.util.function.Supplier;

public class Exercise003 {

  private String[] iceCreamFlavours = {
    "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"
  };

  public int getIceCreamCode(String iceCreamFlavour) {
    return java.util.Arrays.asList(iceCreamFlavours).indexOf(iceCreamFlavour);
  }

  public String[] iceCreamFlavours() {
    return iceCreamFlavours;
  }

  public Function<String, Integer> getIceCreamCodeFunction =
      iceCreamFlavour ->
          java.util.Arrays.asList(iceCreamFlavours).indexOf(iceCreamFlavour);

  public Supplier<String[]> iceCreamFlavoursFunction = () -> iceCreamFlavours;

}
