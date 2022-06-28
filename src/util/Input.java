package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);

    public String getString(){
//        System.out.println("Please enter a string: ");
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Enter yes or no: (Y/N)");
        String resp = scanner.nextLine();
        boolean decision = false;
        if (resp.equalsIgnoreCase("y")){
            decision = true;
        }
        System.out.println(decision);
        return decision;
    }

    public int getInt() {
        int num = 0;
        System.out.println("Enter a number: ");
        try {
            num = Integer.parseInt(String.valueOf(getString()));
        } catch (Exception e) {
            System.out.println("Invalid input.");
            getInt();
        }
        return num;
    }


    public int getInt(int min, int max) {
        System.out.println("Enter a number between " + min + " and " + max);
        int userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            return getInt(min, max);
        } else {
            return userInput;
        }
    }

    public double getDouble(){
        double num = 0;
        System.out.println("Enter a decimal number: ");
        try {
            num = Double.parseDouble(getString());
        }catch (Exception e) {
            System.out.println("Invalid input.");
            getDouble();
        }
        return num;
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a number between " + min + " and " + max);
        double userInput = scanner.nextDouble();
        if (userInput < min || userInput > max) {
            return getDouble(min, max);
        }
        System.out.println("Congrats! You hit within the range. Your number is: " + userInput);
        return userInput;

    }

    public int getBinary() {
        int result = 0;
        int base = 2;
        System.out.println("Enter a binary number: ");
        try{
            String userInput = scanner.next();
            result = Integer.valueOf(userInput, base);
        }catch (Exception e) {
            System.out.println("Invalid input.");
            getBinary();
        }
        return result;
    }

    public int getHex() {
        int result =0;
        int base = 16;
        System.out.println("Enter a hexidecimal number: ");
        try{
            String userInput = scanner.next();
            result = Integer.valueOf(userInput, base);
        }catch (Exception e) {
            System.out.println("Invalid input");
            result = getHex();
        }
        return result;
    }
}
