package Collection_ArrayList_ASS;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class String_into_ArrayList {
    Scanner sc = new Scanner(System.in);
    ArrayList Al = new ArrayList();
    String s;
    int i;

    public void input()
    {
        System.out.println("Enter your string : ");
        s = sc.nextLine();
    }

    public void logic()
    {
        for(i=0; i<s.length(); i++)
        {
            Al.add(s.charAt(i));
        }

        System.out.println("By using Itertor :");

        Iterator<Character> itr = Al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    public static void main(String[] args) {
        String_into_ArrayList ob=new String_into_ArrayList();
        ob.input();
        ob.logic();


    }
}

/*
Output :

        Enter your string :
        AMAN
        By using Itertor :
        A
        M
        A
        N


 */