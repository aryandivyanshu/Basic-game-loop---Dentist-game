package org.example;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Save yo teeth");
        new Main().gameLoop();

    }

    public void gameLoop() {
        while(true) {
            try {
                Thread.sleep(5000);

                Random rand = new Random();
                int random_variable = rand.nextInt(10);

                if (random_variable >= 5) {
                    System.out.println("Your tooth has rotten, fix it by typing DENTIST");

                    Scanner myObj = new Scanner(System.in);
                    String dentistOrNot = myObj.nextLine();

                    dentistOrNot = dentistOrNot.toUpperCase();

                    if (dentistOrNot.equals("DENTIST")) {
                        continue;
                    } else {
                        System.out.println("Game over. Your mouth stinks");
                        break;
                    }
                }else {
                    System.out.println("your teeth is safe.... for now");
                }
            } catch (InterruptedException e) {
                System.out.println("Game interrupted");
                break;
            }
        }
    }
}
