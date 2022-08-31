package Collection_ArrayList_ASS;

import java.util.ArrayList;
import java.util.Scanner;

// Q14. Write a Java program to compare two array lists ?
public class Compare_2ArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<String> Al1=new ArrayList<String>();
        ArrayList<String> Al2=new ArrayList<String>();

        System.out.println("Enter ArrayList 1st :");
        for(int i=0; i<5; i++)
        {
            String s=sc.nextLine();
            Al1.add(s);
        }

        System.out.println("Enter ArrayList 2nd :");
        for(int i=0; i<5; i++)
        {
            String s=sc.nextLine();
            Al2.add(s);
        }

        if(Al1.equals(Al2)==true)
        {
            System.out.println("Arraylist are equel :");
        }
        else
            System.out.println("Arraylist are not equel :");

    }
}
/*

Output :

        Enter ArrayList 1st :
        Rohit
        Roshan
        Dhiraj
        Shridhar
        Atul
        Enter ArrayList 2nd :
        Rohit
        Roshan
        Dhiraj
        Shridhar
        Atul
        Arraylist are equel :


 */
