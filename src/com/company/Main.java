package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        int age;
        System.out.println(("enter your age"));
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch(age) {
              case 18:
                    System.out.println(("you are an adult"));
                    break;
                case 23:
                    System.out.println("you are ready to drink");
                    break;
           case 34:
                    System.out.println("you are ready to fish");
               break;
           case 32:
                    System.out.println("you are ready to vegas");
               break;
           case 43:
                    System.out.println("you are ready to die");
               break;
            case 50:
                   System.out.println(" you are dying soon");
            default:
                System.out.println(("Damn! you are already Dead "));
            }
        }
    }

