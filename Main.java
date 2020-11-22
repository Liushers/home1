package ru.geekbrains.java_one1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {

        PrintWriter out = new PrintWriter("f3.txt");

        BufferedReader br1 = new BufferedReader(new FileReader("f1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("f2.txt"));


        String line1 = br1.readLine();
        String line2 = br2.readLine();

        while (line1 != null)
        {
            out.println(line1);
            line1 = br1.readLine();
        }

        while (line2 != null)
        {
            out.println(line2);
            line2 = br2.readLine();
        }

        out.flush();

        // closing resources
        br1.close();
        br2.close();
        out.close();
    }
}
