package Collection_ArrayList_ASS;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

// Q13.Write a Java program to reverse elements in  array list ?
public class Reverse_element_in_ArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList Al=new ArrayList();

        System.out.println("Enter ArrayList :");
        for(int i=0; i<5; i++)
        {
            int n=sc.nextInt();
            Al.add(n);

        }

        // by using list iterator we can reverse the Arraylist

        ListIterator Li=Al.listIterator(Al.size());
        System.out.println("Element in Backword direction");
        while(Li.hasPrevious())
        {
            System.out.println(Li.previous());
        }



    }
}


/*
Output :

        Enter ArrayList :
        2 4 6 8 10
        Element in Backword direction
        10
        8
        6
        4
        2


 */