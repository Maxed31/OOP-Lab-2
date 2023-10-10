package org.example;
import java.sql.SQLOutput;
import java.util.*;
/*public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input;
        while(true){
            System.out.println("Enter the password");
            input = keyboard.nextLine();
            if (Objects.equals(input, "Carrot")){
                System.out.println("Correct password");
                System.out.println("The secret is: jryy qbar! ");
                break;
            }
            System.out.println("Wrong password!");
        }
        }
    }*/
/*public class Main{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        int read;
            System.out.println("Enter your first number: ");
            read = keyboard.nextInt();
            sum += read;
            System.out.println("Enter your second number: ");
            read = keyboard.nextInt();
            sum += read;
            System.out.println("Enter your third number: ");
            read = keyboard.nextInt();
            sum += read;

        System.out.println("Your sum is: " + sum);

    }
}*/
/*public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the numbers you wish to sum: ");
        while (true){
            int read = Integer.parseInt(keyboard.nextLine());
            if(read == 0){
                break;
            }
            sum += read;
            System.out.println("Current sum: " + sum);

        }
        System.out.println("Final sum is: " + sum);
    }
}*/
/*public class Main{
    public static void main(String []args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("First: ");
        int a = keyboard.nextInt();
        System.out.println("Second: ");
        int b = keyboard.nextInt();

        if (a < b) {
           while(a <= b){
               System.out.println(a);
               a +=1;
            }
        }
        else
         {
             System.out.println("lmao");
            }
        }
    }*/
public class Main {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = keyboard.nextInt();
        int i = 0;
        int sum = 0;
        while (i <= num){
            sum += (int)Math.pow(2,i);
            i++;
        }
        System.out.println("Sum equals to: " + sum);
    }
}
