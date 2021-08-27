package com.company;

import java.util.Scanner;

public class Play {
    public static char[] g_name = new char[100]; // guessing movie name
    public static int gwl = 0; // number of wrong letter guessed
    public static char[] w_letters = new char[100];
    public static char[] acn = new char[100]; // actual namee

    public static void Make_String(String movie){
        gwl = 0;
        acn = movie.toCharArray();
        for (int i = 0; i < Main.nl; i++) {
            g_name[i] = '_';
            if (acn[i] == ' ')
                g_name[i] = ' ';
        }
    }

    public static void common_print(){
        System.out.print("You are guessing:");
        for (int i = 0; i < Main.nl; i++)
            System.out.print(g_name[i]);
        System.out.println();
        System.out.print("You have guessed (" + gwl +") wrong letters :");
        for (int i = 0; i < gwl; i++) {
            System.out.print(w_letters[i] + " ");
        }
        System.out.println();
    }

    public static boolean play_the_game(){
        Scanner input = new Scanner(System.in);
        while (gwl < 10) {
            System.out.print("Guess a letter:");
            char ch = input.next().charAt(0);
            int cnt = 0, match = 0;
            for (int i = 0; i < Main.nl; i++) {
                if (acn[i] == ch) {
                    g_name[i] = ch;
                    cnt += 1;
                }
                if (acn[i] == g_name[i])
                    match += 1;
            }
            if (cnt == 0) {
                w_letters[gwl] = ch;
                gwl++;
            }
            if (match == Main.nl) return true;
            common_print();
        }
        return false;
    }
}
