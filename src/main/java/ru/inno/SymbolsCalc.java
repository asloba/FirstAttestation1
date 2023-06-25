package ru.inno;

import java.util.Scanner;

public class SymbolsCalc {
    public static void main(String[] args) {

        Message message = new Message();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину забора в сантиметрах: ");
        int fenceLength = sc.nextInt();
        message.isFenceLengthSuitable(fenceLength);
        sc.close();
    }
}
