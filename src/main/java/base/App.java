package base;

/*
 *  UCF COP3330 Summer 2021 Assignment 9 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import java.util.Scanner;
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        App myApp = new App();
        //( l * w )/ 350

        int length = myApp.prompt("length");
        int width = myApp.prompt("width");
        int area = length * width;
        final int galCov = 350;

        int gallons = myApp.calcCoverage(area, galCov);

        myApp.printOutput(area, gallons);
    }

    public void printOutput(int area, int gallons){
        System.out.printf("You will need to purchase %d gallons " +
                "of paint to cover %d square feet.", gallons, area);
    }

    public int prompt(String prompt){
        System.out.printf("What is the %s of the room? ", prompt);
        return in.nextInt();
    }

    public int calcCoverage(int area, int galCov){
        if (area % galCov > 0){
            return area/galCov +1;
        }
        return area/galCov;
    }
}
