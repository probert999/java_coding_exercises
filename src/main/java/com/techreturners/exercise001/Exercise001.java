package com.techreturners.exercise001;

import java.util.List;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.lang.StringBuilder;
import java.util.stream.Collectors;

public class Exercise001 {
  public String capitalizeWord(String word) {
    if (word != null && word.length() > 0) {
      word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }
    return word;
  }

  public String generateInitials(String firstName, String lastName) {
    String initials = "";

    if (firstName != null && firstName.length() > 0) {
      initials = String.valueOf(Character.toUpperCase(firstName.charAt(0)));
    }
    if (lastName != null && lastName.length() > 0) {
      String lastNameInitial = "";
      lastNameInitial = String.valueOf(Character.toUpperCase(lastName.charAt(0)));
      if (initials.length() > 0) {
        initials = initials + "." + lastNameInitial;
      } else {
        initials = lastNameInitial;
      }
    }

    return initials;
  }

  public double addVat(double originalPrice, double vatRate) {
    BigDecimal vatAdded = new BigDecimal(originalPrice * (1 + (vatRate / 100)));
    vatAdded = vatAdded.setScale(2, RoundingMode.HALF_DOWN);

    return vatAdded.doubleValue();
  }

  public String reverse(String sentence) {
    if (sentence != null) {
      sentence = new StringBuilder(sentence).reverse().toString();
    }
    return sentence;
  }

  public int countLinuxUsers(List<User> users) {
    int linuxUserCount = 0;

    if (users != null) {
      for (int userIndex = 0; userIndex < users.size(); userIndex++) {
        if (users.get(userIndex).getType().equals("Linux")) {
          linuxUserCount++;
        }
      }
    }
    return linuxUserCount;
  }

  public long countLinuxUsersUsingStream(List<User> users) {
    return (users == null)
        ? 0
        : users.stream()
            .filter(User -> User.getType().equals("Linux"))
            .collect(Collectors.counting());
  }
}
