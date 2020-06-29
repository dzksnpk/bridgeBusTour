package com.company;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type height of Bus in centimeters");
        int busHeight = scanner.nextInt();
        System.out.println("Please type number of bridges to cross");
        int bridgeNumber = scanner.nextInt();
        int bridgeCount = 0;
        System.out.println("Please type their heights (separated by spaces):");
        while (bridgeCount < bridgeNumber) {
            int bridgeHeight = scanner.nextInt();
            bridgeCount++;

            if (busHeight < bridgeHeight) {
                continue;
            } else {
                System.out.println("Will crash on bridge " + bridgeCount);
                break;
            }
        }
        if (bridgeCount == bridgeNumber) {
            System.out.println("Will not crash");
        }
    }
}