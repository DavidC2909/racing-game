package org.example.utils;

import java.util.Scanner;

public class ScannerUtils {

    Scanner scanner= new Scanner(System.in);
    public int nextIntAndMoveToNextLine(){
        int integer= scanner.nextInt();
        scanner.nextLine();
        return integer;
    }

   public String nextLine(){
        return scanner.nextLine();
   }
}
