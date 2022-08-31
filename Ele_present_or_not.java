package Collection_ArrayList_ASS;

import java.util.ArrayList;
import java.util.Scanner;
// Q2. How do you check whether the given element is present in an ArrayList or not ?
public class Ele_present_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList ob=new ArrayList();

        System.out.println("Elements ArrayList is :");
        for(int i=0; i<5; i++)
        {
            int n=sc.nextInt();
            ob.add(n);
        }

        System.out.println("Enter element to be search :");
        int no=sc.nextInt();

        if(ob.contains(no))
        {
            System.out.println("Element is present in ArrayList :");
        }
        else
            System.out.println("Element is not present :");



    }
}

/*
output :

        Elements ArrayList is :
        1 2 3 4 5
        Enter element to be search :
        666
        Element is not present :

 */