package Collection_ArrayList_ASS;

import java.util.ArrayList;
import java.util.Scanner;
// Q7. How do you remove an element from a particular position of an ArrayList?
public class Remove_ele_perticular_posi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList ob=new ArrayList();

        System.out.println("Enter Arraylist :");
        for(int i=0; i<5; i++)
        {
            int n=sc.nextInt();
            ob.add(n);
        }
        System.out.println("Enter position you want to Remove :");
        int n=sc.nextInt();

       if(n<ob.size())
       {
           ob.remove(n-1);
           System.out.println("After removing element in Arraylist :");
           System.out.println(ob);
       }
       else
           System.out.println("Elements not found :");



    }
}

/*
Output :

        Enter Arraylist :
        1 2 3 4 5
        Enter position you want to Remove :
        2
        After removing element in Arraylist :
        [1, 3, 4, 5]

 */