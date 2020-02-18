package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    drakeEquation();

    }

    public static void drakeEquation(){
/*Drake equation
N = number of intelligent species that can communicate with us
R∗ = 1 yr−1 (1 star formed per year, on the average over the life of the galaxy; this was regarded as conservative)
fp = 0.2 to 0.5 (one fifth to one half of all stars formed will have planets)
ne = 1 to 5 (stars with planets will have between 1 and 5 planets capable of developing life)
fl = 1 (100% of these planets will develop life)
fi = 1 (100% of which will develop intelligent life)
fc = 0.1 to 0.2 (10–20% of which will be able to communicate)
L = 1000 to 100,000,000 years (which will last somewhere between 1000 and 100,000,000 years)
 */
        int N;
        int rStar;
        double f_p;
        double numberOfExoplanets;
        double f_l;
        double f_i;
        double f_c;
        int L;

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("name a whole number for the amount of stars formed per year.");
        rStar = keyboard.nextInt();

        System.out.println("name a decimal between 0.2 to 0.5.");
        f_p = keyboard.nextDouble();

        System.out.println("name a number between 1 and 5");
        numberOfExoplanets = keyboard.nextDouble();

        System.out.println("please write 1 for a 100% chance of a planet developing life");
        f_l = keyboard.nextDouble();

        System.out.println("please write 1 for a 100% chance that the planet will develop intelligent life.");
        f_i = keyboard.nextDouble();

        System.out.println("please write a number between .1 and .2 for the percentage of life that will be able to communicate.");
        f_c = keyboard.nextDouble();

        System.out.println("name a whole number between 1000 to 100,000,000 for the length of time the life will be able to communicate.");
        L = keyboard.nextInt();
    }

}
