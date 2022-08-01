package com.company;
import java.util.Scanner;
abstract class homework
{
    public abstract void nameoftheStudent();

}
class Name extends homework {
        public void  nameoftheStudent() {
            Scanner in = new Scanner(System.in);
            String name = in.next();
            int sum = Tamil() + English() + Maths() + Science() + Social();
            System.out.println(name + "" + " got the total marks of " + " " + sum + " " + "and got the avg of" +" " + sum / 5);
        }
        public static int Tamil ()
        {
            Scanner in = new Scanner(System.in);
            int tamil;
            tamil = in.nextInt();
            return tamil;
        }
        public static int English ()
        {
            Scanner in = new Scanner(System.in);
            int english;
            english = in.nextInt();
            return english;
        }
        public static int Maths ()
        {
            Scanner in = new Scanner(System.in);
            int maths;
            maths = in.nextInt();
            return maths;
        }
        public static int Science ()
        {
            Scanner in = new Scanner(System.in);
            int science;
            science = in.nextInt();
            return science;
        }
        public static int Social ()
        {
            Scanner in = new Scanner(System.in);
            int social;
            social = in.nextInt();
            return social;
        }
}
public class Main {
    public static void main(String[] args) {
        Name n =new Name();
        n.nameoftheStudent();
    }
}
