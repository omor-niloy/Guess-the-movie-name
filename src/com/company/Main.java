package com.company;
import java.io.FileNotFoundException;

public class Main {

    public static int nl; // movie name length

    public static void main(String[] args) throws FileNotFoundException {
        String movie = read_names.GetMovieNames();
        nl = movie.length();
        Play.Make_String(movie);
        Play.common_print();
        boolean victory = Play.play_the_game();
        if (victory) {
            System.out.println("You win! You guessed the movie name '"+movie+"' correctly!");
        } else {
            System.out.println("You lose!");
        }
    }
}