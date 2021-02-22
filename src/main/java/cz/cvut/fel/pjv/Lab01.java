package cz.cvut.fel.pjv;

import java.util.Scanner;

public class Lab01 {

   public static Double summirujem(double y, double z) {
      return y+z;
   }
   public static Double otnimajem(double y, double z) {
      return y-z;
   }
   public static Double umnozhaem(double y, double z) {
      return y*z;
   }
   public static Double delim(double y, double z) throws Exception{
      return y/z;
   }
   public static String znakiPosleZap(double rez, int f) {
      /*double result = 0.0;
      *String string = String.valueOf(rez);
      *int index = 0;
      *while (string.charAt(index) != '.') {
      *   index++;
      *}
      *index++;
      *int z = string.substring(index).length();
      *if (z > f) {
      *   string = string.substring(0, index+z-f);
      *   result = Double.parseDouble(string);
      *   return result;
      *}
      *else {
      *   String string1 = null;
      *   for (int i = 0; i <= f-z; i++) {
      *      string1 += "0";
      *   }
      *   string += string1;
      *   result = Double.parseDouble(string);
      *   return result;
      *}
      */

      String str = Double.toString(rez);
      if (str.length() > f) {
         int index = str.indexOf(".");
         str = str.substring(0, index + f + 1);
         /*Double.parseDouble(str);*/
         /*return str;*/}
      else if (str.length() < f) {
         int index = str.indexOf(".");
         int len = str.length();
            for (int promenna = str.length() - str.indexOf("."); promenna < f; promenna++) {
               str += "0";
               /*Double.parseDouble(str);*/
               /*return str*/;
            }
      }
      return str;
   }

   public void start(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Vvedite ot 1 do 4 koroche: ");
      int x = scanner.nextInt();
      System.out.println("1 cislo: ");
      double y = scanner.nextDouble(); // ujeban tut
      System.out.println("2 cislo: ");
      double z = scanner.nextDouble();
      System.out.println("skok znakov posle ,: ");
      int f = scanner.nextInt();
      if (x == 1) {
         double rez = summirujem(y, z);
         System.out.print(znakiPosleZap(rez, f));
         //System.out.print(summirujem(y, z));
      }
      if (x == 2) {
         System.out.print(otnimajem(y, z));
      }
      if (x == 3) {
         System.out.print(umnozhaem(y, z));
      }
      if (x == 4) {
         try {
            System.out.print(delim(y, z));
         }
         catch (Exception e) {
            System.out.println("Pokus o deleni nulou!");
         }
      }
      scanner.close();
   }

}