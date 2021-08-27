package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class read_names {

    public static String[] names = new String[100];
    public static int ind = 0;

    static int GetRandomMovieIndex(){
        Random rand = new Random();
        int res = rand.nextInt(ind);
        return res;
    }

    public static String GetMovieNames() throws FileNotFoundException {
        File moviename = new File("MovieNames.txt");
        Scanner scnstr = new Scanner(moviename);
        while (scnstr.hasNextLine()) {
            String str = scnstr.nextLine();
            names[ind] = str;
            ind += 1;
        }
        int rmi = GetRandomMovieIndex(); // randomly selecting an index
        return names[rmi];
    }
}
