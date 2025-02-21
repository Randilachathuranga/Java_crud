//import javax.swing.*;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class one {
//
//    public static void main(String[] args) {
//        // print
//        // System.out.println("\t\"Hello World\"");
//
//        // variable
////         int x = 10;
////         double y = 5.21;
////         char letter = 'a';
////         boolean isTrue = true;
////         String name = "John";
////         System.out.println(x + " and " +y + " and " + letter + " and " + isTrue + " and " + name);
//
//        // input
////         Scanner input = new Scanner(System.in);
////         System.out.print("What is your name ?");
////         String name = input.nextLine();
////         System.out.print("What is your age ?");
////         int age = input.nextInt();
////         System.out.println("Hello " + name + " you are " + age + " years old");
//
////         String name = JOptionPane.showInputDialog("What is your name ?");
////         int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age ?"));
////         System.out.println("Hello " + name + " you are " + age + " years old");
//
//        // random value
////         Random rand = new Random();
////         int x = rand.nextInt(6) + 1;
////         System.out.println(x);
////         int x = 10;
////         if(x > 5){
////         System.out.println("x is greater than 5");
////         } else {
////         System.out.println("x is less than 5");
////         }
//
////         String name = "Tuesday";
////         switch (name) {
////         case "Monday":
////         System.out.println("Today is Monday");
////         break;
////         case "Tuesday":
////         System.out.println("Today is Tuesday");
////         break;
////         default:
////         System.out.println("Today is not Monday or Tuesday");
////         break;
////         }
//
//        // logical operator
////         int x = 10;
////         int y = 20;
////         if(x > 5 && y > 15){
////         System.out.println("x is greater than 5 and y is greater than 15");
////         }
//
//        // int x = 0;
//        // while (x < 10) {
//        // System.out.println("Hello" + x);
//        // x++;
//        // }
//
//        // for (int x = 0; x < 10; x++) {
//        // System.out.println("Hello" + x);
//        // }
//
//        // for (int i = 0; i < 5; i++) {
//        // System.out.println();
//        // for (int j = 5; j > i; j--) {
//        // System.out.print("*");
//        // }
//        // }
//
//        // arrays
////         int[] numbers = new int[5];
////         int[] numbers = { 1, 2, 3, 4, 5 };
////         System.out.println(numbers[0]);
////         String[] names = { "John", "Doe", "Smith" };
////         System.out.println(names[0]);
//
//        // // 2D arrays
//        // int[][] numbers2 = { { 1, 2, 3 }, { 4, 5, 6 } };
//        // for(int i=0;i<numbers2.length;i++){
//        // for(int j=0;j<numbers2[i].length;j++){
//        // System.out.print(numbers2[i][j]);
//        // }
//        // System.out.println();
//        // }
//
////         String name = " BRO  ";
////          String result = name.trim();
////          System.out.println(result);
//         // and i can compare two strings using
//         // equals,equalsIgnoreCase,length,charAt,substring
//         // indexOf,contains,replace,split
//         // toLowerCase,toUpperCase
//         // and if i use name.trim() the all empty spaces are ignored
////        String name2 = "B,R,O";
////        for (int i = 0; i < 4; i++) {
////         System.out.println(name2.split(",")[i]);
////         }
//
//        // reference data types
////         Boolean a = true;
////         Character b = 'a';
////         Integer c = 10;
////         Double d = 5.21;
////         String e = "Hello";
////         System.out.println(b);
//
//        // Array list
//        // ArrayList<String> foods = new ArrayList<String>();
//        // foods.add("Pizza");
//        // foods.add("Hamburger");
//        // foods.add("Hotdog");
//        // foods.set(1, "Sushi");
//         // foods.remove(0);
//        // foods.clear(); // id use this, array list will be cleared
//        // System.out.println(foods);
//
//        // 2d arrya list
//        // ArrayList<ArrayList<String>> groceryList = new ArrayList();
//        // ArrayList<String> bakeryList = new ArrayList();
//        // bakeryList.add("pasta");
//        // bakeryList.add("garlic bread");
//        // ArrayList<String> produceList = new ArrayList();
//        // produceList.add("tomato");
//        // produceList.add("zucchini");
//        // ArrayList<String> drinksList = new ArrayList();
//        // drinksList.add("soda");
//        // drinksList.add("coffee");
//        // groceryList.add(bakeryList);
//        // groceryList.add(produceList);
//        // groceryList.add(drinksList);
//        // System.out.println(groceryList);
//
//        // for each loop
//        // String[] cars = { "BMW", "Audi", "Honda" };
//        // ArrayList<Integer> num = new ArrayList();
//        // num.add(1);
//        // num.add(2);
//        // num.add(3);
//        // for (String i : cars) {
//        // System.out.println(i);
//        // }
//        // for(int i : num){
//        // System.out.println(i);
//        // }
//
////        // methods
////         sumof_numbers(10, 10);
////         int d = sum(4,6);
////         System.out.println(d);
////
////         final double pi = 3.124; // if used final keyword value cant be changed
////         System.out.println(pi);
////    }
////     static void sumof_numbers(int a, int b) {
////     System.out.println(a + b);
////     }
////     static int sum(int a, int b) {
////     return a + b;
////     }
//
//}