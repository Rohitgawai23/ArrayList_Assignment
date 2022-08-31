package Collection_ArrayList_ASS;
// Q5. How do you replace a particular element in an ArrayList with the given element?
import java.util.ArrayList;
import java.util.Scanner;

public class Replace_ele_inArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList ob=new ArrayList();

        System.out.println("Enter Array list :");
        for(int i=0; i<5; i++)
        {
            int n=sc.nextInt();
            ob.add(n);
        }

        System.out.println("Enter element you want to replace :");
        int n=sc.nextInt();

        System.out.println("enetr element which to be come over replace element");
        int r=sc.nextInt();

        if(ob.contains(n))
        {
            int i=ob.indexOf(n);
            ob.remove(i);
            ob.add(i,r);
            System.out.println("array list after replacing");
            System.out.println(ob);

        }
        else
            System.out.println("element not found");

    }
}


/*
Output :

        Enter Array list :
        1 2 3 4 5
        Enter element you want to replace :
        4
        enetr element which to be come over replace element
        66
        array list after replacing
        [1, 2, 3, 66, 5]

 */