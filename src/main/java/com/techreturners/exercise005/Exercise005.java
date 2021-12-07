package com.techreturners.exercise005;

public class Exercise005 {

    private static int minLengthforPangram = 26;

    public boolean isPangram(String input) {

        input = input.toLowerCase();
        char charLookup = 'a';

        boolean isPangram = (input.length() >= minLengthforPangram);

        while (isPangram && charLookup <= 'z')
        {
            if (input.indexOf(charLookup) >= 0)
            {
                charLookup++;
            }
            else
            {
                isPangram = false;
            }
        }
        return isPangram;
    }

}
