/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperations;

import java.io.*;
import java.util.*;

/**
 *
 * @author Larry Jackson
 */

public class HighestScore {
    public static void main(String[] args) {
        try {
            /* Reading each line of gamescore file using Scanner class */
            Scanner file = new Scanner(new File("gamescore.txt"));
             /* determine the high score */
            int highest = file.nextInt();

            while (file.hasNext()) {
                int score = file.nextInt();

                if(score > highest) {
                    highest = score;
                }
                /* Display all the scores first */
                System.out.println(score);
            }
            file.close();
            /* display the high score */
            System.out.println("The highest score in the file is: " + highest);
        }
        /* display a message if the text file couldn't be found */
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
