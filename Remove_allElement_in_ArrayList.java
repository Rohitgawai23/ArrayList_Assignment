package Collection_ArrayList_ASS;

import java.util.ArrayList;
import java.util.Scanner;

//  Q9. How do you remove all elements of an ArrayList at a time?
public class Remove_allElement_in_ArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList ob=new ArrayList();
        System.out.println("Enter ArrayList are :");
        for(int i=0; i<5; i++)
        {
            int n=sc.nextInt();
            ob.add(n);
        }
        ob.clear();
        System.out.println("Remove all elements are :"+ob);



    }
}
/*
Output :

        Enter ArrayList are :
        12 13 14 15 16
        Remove all elements are :[]


 */