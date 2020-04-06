package ex1.application;

import ex1.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        Rectangle r = new Rectangle();
        System.out.println("Enter the rectangle's width and height: ");
        r.widht = s.nextDouble();
        r.height = s.nextDouble();
        System.out.println("AREA = "+r.area());
        System.out.println("PERIMETER = "+r.perimeter());
        System.out.println("DIAGONAL = "+r.diagonal());

        s.close();
    }
}
