package Collection_ArrayList_ASS;
// Q10. How do you retrieve a portion of an ArrayList?
import java.util.ArrayList;
import java.util.Scanner;

public class ritrieve_posi_ArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList ob=new ArrayList();

        System.out.println("Enter ArrayList is :");
        for(int i=0; i<5; i++)
        {
            String n=sc.nextLine();
            ob.add(n);
        }

        System.out.println("Enter the position you want to retrieve :");
        int v=sc.nextInt();

        System.out.println("The element at index " + v + " in the ArrayList is: " +ob.get(v));


    }
}

/*
Output :

        Enter ArrayList is :
        Roshan
        Rohit
        Shridhar
        Gaurav
        Swapnil
        Enter the position you want to retrieve :
        2
        The element at index 2 in the ArrayList is: Shridhar


 */