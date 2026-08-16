# Object-Oriented Programming Lab #2 -- Spring 26

## Today's Topics

-   Flow Controls: If, While, For, Do-While
-   Recursion
-   User Input
-   Array

## Code to Read User Input Using `Scanner`

> Need to import `java.util.Scanner`

``` java
Scanner scan = new Scanner(System.in);
int inputNum = scan.nextInt();
double input = scan.nextDouble();
```

# Problems / Assignments

## 1. Square of a Number

Write a Java application that will prompt the user to provide a number
as input. Read input as a number and display the square of the number.

    Sample Input   Expected Output
  -------------- -----------------
               7                49
              -8                64
               3                 9

## 2. Even or Odd

Write a Java program that will prompt the user to provide a number as
input. Read input as a number and display whether the number is even or
odd.

    Sample Input Expected Output
  -------------- -----------------
               7 Odd
               8 Even
              11 Odd

## 3. Prime Number

Write a Java program to determine whether a given number is prime or
not.

    Sample Input Expected Output
  -------------- -----------------
               7 Prime
               9 Not Prime
              11 Prime

## 4. Day of the Week

Write a program that will take an integer number, and print the day of
the week depending on the number. To find the day of the week, you need
to divide the number by 7 and find the remainder. The day will have the
following value depending on the remainder.

    Remainder Day of the Week
  ----------- -----------------
            0 Saturday
            1 Sunday
            2 Monday
            3 Tuesday
            4 Wednesday
            5 Thursday
            6 Friday

  -----------------------------------------------------------------------
             Sample Input Expected Output         Explanation
  ----------------------- ----------------------- -----------------------
                        9 Monday                  As `9 % 7 = 2`, the
                                                  output is Monday

                       14 Saturday                As `14 % 7 = 0`, the
                                                  output is Saturday
                                                  according to the above
                                                  table.

                       27 Friday                  As `27 % 7 = 6`, the
                                                  output is Friday
                                                  according to the above
                                                  table.
  -----------------------------------------------------------------------

## 5. LCM of Two Numbers

Write a program that will take two integer numbers from the user, and
print the LCM of those numbers.

  Sample Input     Expected Output
  -------------- -----------------
  2, 3                           6
  4, 6                          12
  3, 9                           9

## 6. Divisible by 3 or 5, but Not Both

Write a Java program that will take 10 numbers from the user and only
print the numbers (among those 10 numbers) that are divisible by 3 or 5
but not both.

## 7. Summation of the Even Digits

Write a program in Java to display the summation of the even digits of a
number.

    Sample Input   Expected Output Explanation
  -------------- ----------------- --------------------------------------------------
             472                 6 1st and 3rd digits are even. Hence, `4 + 2 = 6`
           90357                 0 No even digit
            1820                10 2nd and 3rd digits are even. Hence, `8 + 2 = 10`

## 8. Fibonacci Series

Write a Java program to print the Fibonacci series up to the **nᵗʰ
item**. The value of `n` will be provided by the user as input.

    Sample Input Expected Output
  -------------- ----------------------
               2 1, 1
               4 1, 1, 2, 3
               7 1, 1, 2, 3, 5, 8, 13

## 9. Factorial Using Recursion

Write a Java program and print the factorial of number `n` which will be
provided by the user as input. If `n < 0`, print **"Factorial is only
applicable for positive number"**.

**Note:** Use recursion.

    Sample Input   Expected Output
  -------------- -----------------
               0                 1
               1                 1
               7              5040

## 10. Find Maximum and Minimum in an Array

Write a Java program that will go through the items of an array and find
the max and min values. Take the following values as the input of the
array.

  Sample Input                       Expected Output
  ---------------------------------- --------------------------------------
  `{11, 4, 5, 3, 9, 13, 1}`          **Max:** 13`<br>`{=html}**Min:** 1
  `{9, -3, 2, 22, -7}`               **Max:** 22`<br>`{=html}**Min:** -7
  `{-11, -4, -5, -3, -9, -13, -1}`   **Max:** -1`<br>`{=html}**Min:** -13
