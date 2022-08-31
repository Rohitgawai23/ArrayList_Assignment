package Collection_ArrayList_ASS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// Q12. Write a Java program to sort a given array list?
public class Sort_ArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<String> Al= new ArrayList<String>();

        System.out.println("Enter Arraylist element :");
        for(int i=0; i<5; i++)
        {
            String s=sc.nextLine();
            Al.add(s);
        }

        System.out.println();
        System.out.println("Before sorting :"+Al);

        Collections.sort(Al);
        System.out.println("After sorting :"+Al);

    }
}

/*
Output :

        Enter Arraylist element :
        Rohit
        Akash
        Dhiraj
        Gaurav
        Atul

        Before sorting :[Rohit , Akash, Dhiraj, Gaurav, Atul]
        After sorting :[Akash, Atul, Dhiraj, Gaurav, Rohit ]


 */
