/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessonthree;
 
import java.util.Scanner;


/**
 *
 * @author A.E.A
 */
public class LessonThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* System.out.println(5 + 10 + "java" + (20 + 5) + 10);//15java2510
        System.out.println(5 + 5 + 10);//5510
        long bignumber = 12222222222564215l;
        System.out.println("bignumber is " + bignumber);
        String _name="java";
         */
//        String name;
//        name="ahmed";
//        System.out.println(name);
//        name="moahmed";
//         System.out.println(name);
//        String names="ahmed";
//        String firstName, lastName;
//
//        int salary, age;
//
//      final  String appName = "java";
//      final double ac = .5;
//      int a=505;
//      int b=a;
//        System.out.println(b);
//       double z=7.1;
//       double x=a;
//        System.out.println(z);
//       int xx=(int)z;
//        System.out.println(xx);
        int a = 6, b = 6;
        int zb = 10, za = 15;

//        System.out.println(a--);
//        System.out.println(a);
        String z = new String("a");
        String zz = "a";
//        System.out.println(a >= b);
//        System.out.println(!z.equals(zz));
//        System.out.println(a==b && zb!=za && a==10);

        String name  ;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name :");
        name=input.nextLine();
        System.out.println("hello "+ name);
        int age;
        System.out.println("Enter Your age : ");
        age=input.nextInt();
        System.out.println("your age "+age);
        
    }

}
