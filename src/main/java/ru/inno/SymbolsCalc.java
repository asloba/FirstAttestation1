package ru.inno;

import java.util.Scanner;

public class LettersCalc {
    public static void main(String[] args) {

        MessageData messageData = new MessageData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину забора в сантиметрах: ");
        int fenceLength = sc.nextInt();
        messageData.isFenceLengthSuitable(fenceLength);
    }
}
