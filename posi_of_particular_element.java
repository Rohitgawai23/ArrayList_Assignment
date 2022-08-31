package Collection_ArrayList_ASS;

import java.util.ArrayList;
import java.util.Scanner;

// Q6.How do you insert an element at a particular position of an ArrayList?
public class posi_of_particular_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList ob=new ArrayList();

        System.out.println("Enter Array list :");
        for(int i=0; i<5; i++)
        {
            int n=sc.nextInt();
            ob.add(n);
        }
        System.out.println("Enter position you want to insert :");
        int n=sc.nextInt();

        System.out.println("Enter element which to want to insert ");
        int r=sc.nextInt();

        if(n<ob.size())
        {
            ob.add(n,r);
            System.out.println("Element after inserting :");
            System.out.println(ob);
        }



    }
}


/*
Output :

        Enter Array list :
        1 2 3 4 5
        Enter position you want to insert :
        4
        Enter element which to want to insert
        99
        Element after inserting :
        [1, 2, 3, 4, 99, 5]

 */