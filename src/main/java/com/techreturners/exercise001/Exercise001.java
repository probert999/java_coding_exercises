package com.techreturners.exercise001;

import java.util.List;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.lang.StringBuilder;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        BigDecimal vatAdded = new BigDecimal(originalPrice * (1 + (vatRate / 100)));
        vatAdded = vatAdded.setScale(2,RoundingMode.HALF_DOWN);

        return vatAdded.doubleValue();
    }

    public String reverse(String sentence) {
        StringBuilder revSentence = new StringBuilder(sentence).reverse();
        return revSentence.toString();
    }

    public int countLinuxUsers(List<User> users) {
        int linuxUserCount = 0;

        for (int i = 0; i < users.size(); i++)
        {
            User checkUser = users.get(i);
            String osType = checkUser.getType();
            if (osType.compareTo("Linux") == 0)
            {
                linuxUserCount++;
            }
        }
        return linuxUserCount;
    }
}
