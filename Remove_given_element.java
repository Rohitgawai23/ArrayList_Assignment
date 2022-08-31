package Collection_ArrayList_ASS;

import java.util.ArrayList;
import java.util.Scanner;
// Q8. How do you remove the given element from an ArrayList ?
public class Remove_given_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList ob=new ArrayList();
        ArrayList ob1=new ArrayList();

        System.out.println("Enter Array list :");
        for(int i=0; i<5; i++)
        {
            int n=sc.nextInt();
            ob.add(n);

        }

        System.out.println("Enter the element you want to remove : ");
        int no=sc.nextInt();

        ob.remove(Integer.valueOf(no));

        System.out.println(ob);

    }
}


/*
Output :

        Enter Array list :
        11 22 33 44 55
        Enter the element you want to remove :
        55
        [11, 22, 33, 44]

 */
