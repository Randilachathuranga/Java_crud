package Exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter a whole number to divide: ");
            int x = input.nextInt();

            System.out.println("Enter a whole number to divide by : ");
            int y = input.nextInt();

            int z = x/y;
            System.out.println("result : " + z);
        }
        catch(ArithmeticException e){
            System.out.println("You cant divide by zero");
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a number");
        }catch (Exception e){
            System.out.println("Something gonna wrong");
        }finally {
            System.out.println("its gonna right");
        }
    }
}
