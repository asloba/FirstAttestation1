package ru.inno;

public class Message {

    public final int threeLettersLength = 62;
    public final int spaceLength = 12;
    public final int lettersAmount = 15;
    public final int spacesAmount = 3;

    public Message() {
    }

    public boolean isFenceLengthSuitable(int fenceLength) {
        int index = fenceLength / (threeLettersLength / 3 * lettersAmount + spaceLength * spacesAmount);
        if (index < 1) {
            System.out.println("Посление не поместится на забор :(");
            return false;
        } else
            System.out.println("Посление поместится на забор :)");
        return true;
    }
}
