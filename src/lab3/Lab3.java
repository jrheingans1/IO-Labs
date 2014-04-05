/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import lab2.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jrheingans1
 */
public class Lab3 {

    public static void main(String[] args) throws IOException {
//        Scanner keyboard = new Scanner(System.in);

        File data = new File(File.separatorChar + "temp" + File.separatorChar + "lab1.txt");
//        boolean append = true;   // you can change this
//        PrintWriter out = new PrintWriter(
//                new BufferedWriter(
//                        new FileWriter(data, append)));
//
//        out.println("");
//        out.println("Megan");
//        out.println("Fox");
//        out.println("789 Hotness Court");
//        out.println("Delafield");
//        out.println("WI");
//        out.println("53018");
//        out.println("meganfox@my.wctc.edu");
//        out.println("333-333-3333");
//        out.close();  // be sure you close your streams when done!!
//
//        System.out.println("Wrote file to: " + data.getAbsolutePath());
//        System.out.println("What file would you like to find?");
//        String input = keyboard.nextLine();

        BufferedReader in = null;
        List<String> fileContents = new ArrayList<String>();
        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            int counter = 1;
//            if (input.equals("1")) {
                while (line != null) {
                    if (counter == 13) {
                        fileContents.add(line);
                    }
                    line = in.readLine();  // strips out any carriage return chars
                    counter++;
                }
//            }else if (input.equals("2")){
//                while (line != null){
//                    if (counter > 9 && counter < 18){
//                        fileContents.add(line);
//                    }
//                    line = in.readLine();
//                    counter++;
//                }
//            }else if (input.equals("3")){
//                while (line != null){
//                    if (counter > 18 && counter < 27){
//                        fileContents.add(line);
//                    }
//                    line = in.readLine();
//                    counter++;
//                }
//            }else if (input.equals("4")){
//                while (line != null){
//                    if (counter > 27 && counter < 36){
//                        fileContents.add(line);
//                    }
//                    line = in.readLine();
//                    counter++;
//                }
//            }

        } catch (IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch (Exception e) {

            }
        }

        for (String s : fileContents) {
            System.out.println(s);
        }
    } // end main
}
