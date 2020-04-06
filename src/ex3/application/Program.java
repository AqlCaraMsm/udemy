package ex3.application;

import ex3.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        Student std = new Student();
        std.name = s.nextLine();
        for(int i=0;i<3;i++){
            std.grade[i] = s.nextDouble();;
        }
        System.out.printf("FINAL GRADE: = %.2f%n",std.finalGrade());

        if(std.finalGrade()>=60){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS",std.missingPoints());
        }

        s.close();
    }
}
