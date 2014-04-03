/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jrheingans1
 */
public class Lab1 {

    public static void main(String[] args) throws IOException {

        File data = new File(File.separatorChar + "temp" + File.separatorChar + "lab1.txt");
        boolean append = true;   // you can change this
        PrintWriter out = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(data, append)));

        out.println("");
        out.println("Megan");
        out.println("Fox");
        out.println("789 Hotness Court");
        out.println("Delafield");
        out.println("WI");
        out.println("53018");
        out.println("meganfox@my.wctc.edu");
        out.println("333-333-3333");
        out.close();  // be sure you close your streams when done!!

        System.out.println("Wrote file to: " + data.getAbsolutePath());

        BufferedReader in = null;
        List<String> fileContents = new ArrayList<String>();
        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            int counter = 0;

            while (line != null) {
                if (counter > 8 && counter < 17) {
                    fileContents.add(line);
                }
                line = in.readLine();  // strips out any carriage return chars
                counter++;

            }

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
