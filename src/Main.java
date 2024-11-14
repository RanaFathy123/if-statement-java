//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

/*
        Question 1
        Write a Java program that takes an integer as input and checks if it is positive,
         negative, or zero. Print an appropriate message based on the input. (without
        using  else if )

       1- input : int num
       2- check if number positive or negative or zero
       3- print positive or negative
  */
        int number = 2;
        if (number <= 0)
            System.out.println("negative or zero");
        else
            System.out.println("positive");

      /*  Write a Java program to determine if a given year is a leap year or not. The year is
        a leap year if:
        It is divisible by 4.
        But if the year is divisible by 100, it is not a leap year, unless it is also divisible
        by 400
        1- input : year
        2-
        -check if year modulus 4 is zero this mean that it leap year
        -if it divide by 100 it not leap year
        -if it divide by 400 it leap year
        3- print it leap year or not
        */


        int year = 2019;
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " " + "is" + " " + "leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + " " + "is" + " " + "Not a leap year");
        } else {
            System.out.println(year + " " + "is" + " " + "Not a leap year");
        }
 /*   Question 3
        Write a Java program that takes the age of a person as input and determines if
        they are:
        A minor (less than 18 years old),
        An adult 18 to 60 years old),
        Or a senior citizen (above 60 years old).

        1- input : age
        2-
        - check if age less than 18 is minor
        - else if age >= 18 and age <=60  is adult
        - else is senior citizen
        3- print category
   */

        int age = 62;
        if(age < 18)
            System.out.println("Minor");
        else if (age >= 18 && age <= 60)
            System.out.println("Adult");
        else
            System.out.println("Senior Citizen");

       /* Question 4
        Write a Java program that deal with three numbers  and prints the largest of the
        three numbers using
        if-else (without using else if ).

        1- input : numOne,numTwo,numThree
        2-check if numOne larger than numTwo and numOne larger than numThree it's mean that numOne is largest
        if numTwo larger than numOne and numTwo larger than numThree it's mean that numTwo is the largest
        else numThree is largest
        */

        int numOne = 100,numTwo=50,numThree=20;
        if(numOne > numTwo && numOne>numThree){
            System.out.println("Num One is Largest Number");
        } else{
            if(numTwo > numOne && numTwo>numThree){
                System.out.println("Num Two is Largest Number");
            }else {
                System.out.println("Num Three is Largest Number");
            }
        }
/*      Question 5
        Write a Java program that checks whether a given number is even or odd using
        if-else condition.
        1- input : num
        2- check if num % 2 is zer that mean it even else odd
        3- print num is even or odd
        */

        int num = 5;
        if(num % 2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }

}