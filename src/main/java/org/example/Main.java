package org.example;
import java.util.*;
public class Main {
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
    }