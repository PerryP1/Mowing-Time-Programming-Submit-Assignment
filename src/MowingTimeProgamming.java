import java.util.Scanner;

public class MowingTimeProgamming {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double lawnWidth1, lawnLength1;

        System.out.print("Enter the width of lawn");
        lawnWidth1 = keyboard.nextDouble();

        System.out.print("Enter the length of lawn");
        lawnLength1 = keyboard.nextDouble();

        double lawnSquaredSize1 = lawnWidth1 * lawnLength1;
        System.out.println("Total Lawn Area: " + lawnSquaredSize1);

        double lawnMowTime1 = (lawnSquaredSize1 / 40) * 2;
        System.out.println("Lawn Mow Time Estimate: " + lawnMowTime1 + "mins");
    }

    public static double lawnSquaredSize1(double lawnWidth1, double lawnLength1) {
        double lawnSquaredSize1 = lawnWidth1 * lawnLength1;
        return lawnSquaredSize1;
    }

    public static double lawnMowTime1(double lawnSquaredSize1) {
        double lawnMowTime1 = (lawnSquaredSize1 / 40) * 2;
        return lawnMowTime1;

    }
}

//Bob has a lawn service business. Bob estimates that he can mow 40 sq yard of lawn in 2 minutes. Write a program that allow Bob to enter the length and width of a lawn. The program should then compute the square yardage and the time it will take to mow it. Display the length, width, square yardage, and the amount of time to mow it.
