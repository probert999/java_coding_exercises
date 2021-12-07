package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {
        boolean isPangram = true;

        input = input.toLowerCase();
        char charLookup = 'a';
        do
        {
            if (input.indexOf(charLookup) >= 0)
            {
                charLookup++;
            }
            else
            {
                isPangram = false;
            }
        } while (isPangram && charLookup <= 'z');

        return isPangram;
    }

}
