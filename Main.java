
// Whole practice of the core java With one mini project



//package com.gauravsonurkar;
//
//import java.sql.SQLOutput;
//import java.util.Locale;
//import java.util.Scanner;
//
//public class Main {
//    static int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static void main(String[] args) {
        // write your code here
//        System.out.println("Hello world ");
        // variable

        /*
        just like
        water - bucket
        masala - box
        lunch - lunch box

        in java -
        vairiable are the those who contain the data values
           String , int , char , float,boolean
           how to declare the variable
           syntax - <data type > <variable> = values



         */

//        String name = "Harry";
//        System.out.println(name);
//
//        int a = 45, x = 4, y = 3;
//        float b = 45.22f;
//        boolean is_adult = false;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(is_adult);
//        System.out.println(x);

        //rules for constructing of variable in java

        /*
        1.can contain digits,underscore, dollar_sign , letter
        2.should begin with a latter , $ or _
          java is the case sensitive language
        3.that means harry and Harry is the two different name
        4. should not contaim whitespaces
        5 . you canot use  data type as the variable name

         */

        /*
        java having two types of data type
        1 primitive = byte (1 byte ) , short (2 bytes ) , int (4 bytes ) , long (8 bytes ) , float (4 bytes)
        double ( 8 bytes )  , boolean (1 bit ) , char (2 bytes ) .
        2 Non_primitive or reference data type



         */
//
//        byte u = 56;
//        System.out.println(u);
//        double k = 123.74874848;
//        System.out.println(k);
//
//        char grade = 'A';
//        System.out.println(grade);

        // operators in the java
        /*
        operand , operator , operand

       (operand) 4 +  6(operand) = (result) 10
       ( + is the operator)

       Types of the operators
       Arithmatic operator
       assignment operator
       Logical operators
       Comparison operator



         */
//        int num1 = 45, num2 = 5;
//        System.out.print("The value of the A+B is ");
//        System.out.println(num1 + num2);
//        System.out.print("The value of the A-B is ");
//        System.out.println(num1 - num2);
//        System.out.print("The value of the A*B is ");
//        System.out.println(num1 * num2);
//        System.out.print("The value of the A/B is ");
//        System.out.println(num1 / num2);
//        System.out.print("The value of the A%B is ");
//        System.out.println(num1 % num2);
//
//
//        System.out.println(num1++);
//        System.out.println(++num1);
//        System.out.println(num1--);
//        System.out.println(--num1);

        //Comparison operators

        /*
         1 ==   - checks for equally of two values

         2 != -   unequal
         3 <      less than
         4 >      greater than
         5 <=
         6 >=

         // logical operator
         1. && logical and operator - returns the true if the both condition is true
         2. || logical or operator -  returns the true if and only one condition is true condition is true
         3. ! logical not  - reverse the result from true to false and vise versa
         */
        //taking user input pfrom user

        // Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the string");
//        //String input = scan.nextLine();
//        String input = scan.next();
//        System.out.println("The string is " + input);
//        System.out.println("Enter the age = ");
//        int age = scan.nextInt();
//        System.out.println("The age is = " + age);
//
//        float hight = scan.nextFloat();
//        System.out.println("Enter your hight = ");
//        System.out.println("The hight is " + hight);
//
//
//        System.out.println("Enter the weight = ");
//        double weight = scan.nextDouble();
//        System.out.println("The weight is = " + weight);

        // string
//
//        String word = "Gaurav";
//        String sirname = "sonurkar";
//        System.out.println(word);
//        System.out.println(word + " from " +sirname); //concatenation
//
//        System.out.println(word.length()); //length
//
//        System.out.println(word.toUpperCase()); //uppercase
//
//        System.out.println(word.toLowerCase()); //lowercase
//
//        System.out.println(word+ " from\" " +sirname); // escape sequence character
//
//        System.out.println(word+ " from\t " +sirname); // escape sequence character
//
//        System.out.println(word+ " from\n  " +sirname); // escape sequence character
//
//        System.out.println(sirname.contains("son")); // contains() string tells u is it contain is in your string.
//        System.out.println(sirname.charAt(3)); // charAt() tells you the which char is on which indexing.
//        System.out.println(sirname.endsWith("kar")); // endwith() tells you ending wo0rds of the string.
//        System.out.println(sirname.indexOf("onu")); // which tells you what is the indexing of the string.

        // Math class

//        which help us to solve mathematics

        //int num1 = 4, num2 = 6;
//        System.out.println(Math.max(num1,num2));
//        System.out.println(Math.min(num1,num2));
//        System.out.println(Math.sqrt(num1));
//        System.out.println(Math.sqrt(25));
//        System.out.println("Enter the number that you want for the Sqrt = ");
//        int input = scan.nextInt();
//        System.out.println(Math.sqrt(input));
//
//        System.out.println(Math.abs(-4));
//        System.out.println(Math.abs(8));
//        System.out.println(Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random()); // Java math class function


        // conditional statements

        //  1. if-else conditional statements

       /* System.out.println("Enter the age = ");
        int age = scan.nextInt();
        System.out.println("The age is "+age);

        if(age>20)
        {
            System.out.println("You are an adult ");
        }
        else if (age>5)
        {
            System.out.println("You are not an kid ");

        }
        else
        {
            System.out.println("You are kid");
        }

        */

        // switch case

        //System.out.println("Enter the age = ");
        // int age = scan.nextInt();
        //System.out.println("The age is " + age);

//        switch (age) // it gives us the cases that we want to choose one at the time
//        {
//            case 12:
//                System.out.println("You are an kid ");
//                break;
//            case 21:
//                System.out.println("You are an adult");
//                break; // for stop the statement in itselfs loop
//            case 5:
//                System.out.println("You are 5 year old ");
//                break;
//
//            default:
//                System.out.println("you didi not match in any case ");
//
//
//        }

        // QUICK qUIZ

//        print sunday to saturday based on the 1 to 7 typed by the user
      /*  System.out.println("Enter the days between");

        int days = scan.nextInt();
        switch (days) {
            case 1:
                System.out.println("its an sunday");
                break;
            case 2:
                System.out.println("its an Monday");
                break;
            case 3:
                System.out.println("its an Theusday ");
                break;
            case 4:
                System.out.println("its an Wednesday");
                break;
            case 5:
                System.out.println("its an Thursday");
                break;
            case 6:
                System.out.println("its an Friday");
                break;
            case 7:
                System.out.println("its an Saturday");
                break;
            default:
                System.out.println("You Enter the Invalid case ");
          }
       */

        // LOOP

        // While loop example

//        synatx of the while loop
//                while (condition)
//                {
//                    //statements
//                }
        //code of the while loop

        /*int i = 0;
        while (i<100)
        {
            System.out.println(i); //anyfull can write code computer will understand good programmer write code for human understand

            i++;
        }*/

        //Do while loop

        // syntax :

//        do
//        {
//            //statement  // this code will keep executing until the comdition is true

//        }while(condition);
//
//        int j = 0;
//        do {
//            System.out.println(j);
//            j+=1;
//        }while (j>100); // This code will run attlist once


        /*
        int j = 0;
        do {
            System.out.println(j);
            j += 1;
        } while (j < 100); // tHIS CODE RUN UNTILL THE 100
        */

        // For loop
      /*  for(int i = 0;i<10;i++) // if write i<=10 then it will be run from 1 to 10:
        {
            System.out.println(i);
        }
*/
        // break and continue
//        for(int i = 0;i<10;i++)
//        {
//            System.out.println(i);
//            break; // it will only print the 0 itrretion will not be continued
//        }
//       2.Example
//       for (int i = 0; i <= 10; i++) {
//
//
//            if (i > 2) {
//                break;
//            } else {
//                System.out.println(i);
//            }
//        }
//
        // continue
//        for (int i = 0; i <= 10; i++) {
//
//
//            if (i == 2) {
//               continue; // it will skip
//            }
////            else {
////                System.out.println(i);
////            }
//        }
        //JAva arrays :

//        defination of the array is which contain similer data item of the data type

//        int[] marks = {1, 2, 3, 4};
        /*System.out.println(marks[0]);

        marks[3] = 34; // this will update your values also
        System.out.println(marks[3]);

         // Classical way to iterate an array
      for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
*/
        // for each loop

        /*for (int value : marks)
        {
            System.out.println(value);

        }*/


        /*int [] [] matrix = {{1,2,3}, {4,5,6}};
        System.out.println(matrix[0][1]);
        System.out.println(matrix[1][0]);
        */

        // String array in the for each loop
        /*String [] cars = {"harry","Maruti","Suzuki"};
        for (String value:cars)
        {
            System.out.println(value);
        }*/

        // Try - Catch
//        String [] cars = {"harry","Maruti","Suzuki"};
//      try {
//          System.out.println(cars[5]); // give error
//      }
//      catch (Exception e)
//      {
//          System.out.println(e);
//      }
//        System.out.println("gaurav");
//
//

//
//        Methods :
//        System.out.println(sum(5,7));


//        mini project Simple calculator

/*        Scanner input = new Scanner(System.in);

        int num1, num2;
        System.out.println("Enter the num1 and num2");
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println("Your 1s number is " + num1);
        System.out.println("your 2nd number is " + num2);

        String sen = "Enter 1 for Addition , 2 for Substraction, 3 for Multiplication , 4 for Division , 5 for Modulo";
        System.out.println(sen);
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("The Addition of this numbers is ");
                System.out.println(num1 + num2);
                break;

            case 2:
                System.out.println("The Subtraction of this numbers is ");
                System.out.println(num1 - num2);
                break;

            case 3:
                System.out.println("The Multiplication of this numbers is ");

                System.out.println(num1 * num2);
                break;

            case 4:
                System.out.println("The Division  of this numbers is ");
                System.out.println(num1 / num2);
                break;

            case 5:
                System.out.println("The Modulo of this numbers is ");
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("You Entered the Wrong case plz  " + sen);

        }

    }
}



 */


