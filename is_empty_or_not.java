package Collection_ArrayList_ASS;
// Q1.How do you find out whether the given ArrayList is empty or not ?
import java.util.ArrayList;
import java.util.Scanner;

public class is_empty_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList ob=new ArrayList();

        System.out.println("Enter array list :");
        for(int i=0; i<5; i++)
        {
           int  n = sc.nextInt();
           ob.add(n);
        }

        if(ob.isEmpty())
        {
            System.out.println("Arraylist is empty : ");
        }
        else
            System.out.println("ArrayList is not empty : ");

    }
}


/*
Outpput :

        Enter array list :
        1 2 3 4 5
        ArrayList is not empty :

 */