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
            Scanner file = new Scanner(new File("gamescore.txt"));
            int max = file.nextInt();

            while (file.hasNext()) {
                int score = file.nextInt();

                if(score > max) {
                    max = score;
                }
                System.out.println(score);
            }
            file.close();

            System.out.println("The highest score in the file is: " + max);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
