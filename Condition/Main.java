package Condition;

//Calculate Distance Between Two Points

import java.util.Scanner;

//public class Condition.Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the points of X coordinates:- ");
//        System.out.print("x1 = ");
//        double x1 = scanner .nextDouble();
//        System.out.print("x2 = ");
//        double x2 = scanner.nextDouble();
//        System.out.println("Enter the points of Y coordinates:-  ");
//        System.out.print("y1 = ");
//        double y1 = scanner.nextDouble();
//        System.out.print("y2 = ");
//        double y2 = scanner.nextDouble();
//        if (Double.isNaN(x1) || Double.isNaN(x2) || Double.isNaN(y1) || Double.isNaN(y2)){
//            System.out.println("Invalid coordinates! Coordinates should be in numerical values.");
//        }else {
//            double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
//            System.out.println("The distance between two points is " + distance);
//        }
//    }
//}

//Calculate Commission Percentage
//public class Condition.Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the  sales amount:- ");
//        double sales = scanner.nextDouble();
//        double commissionPercentage = 0;
//        if (sales > 50000){
//            commissionPercentage =10;
//        }else if (sales > 30000){
//            commissionPercentage = 7;
//        } else if (sales> 1000) {
//            commissionPercentage =5;
//        }else if(sales >= 0){
//            commissionPercentage = 2;
//        }else {
//            System.out.println("Invalid Sales amount! sales cannot be negative.");
//        }
//        double commission = (sales * commissionPercentage)/100;
//        System.out.println("The commission percentage is " + commissionPercentage + "%");
//        System.out.println("Commission amount  is " + commission);
//    }
//}

import java.util.Scanner;

//public class Condition.Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.print("Enter the initial cost of asset: ");
//        double cost = scanner.nextDouble();
//
//        System.out.print("Enter the salvage value at the end of its life: ");
//        double salvageValue = scanner.nextDouble();
//
//        System.out.print("Enter the useful life of asset in years: ");
//        int usefulLife = scanner.nextInt();
//
//
//        if (cost <= 0 || salvageValue < 0 || usefulLife <= 0 || salvageValue > cost) {
//            System.out.println("Invalid input. Please ensure all values are positive and salvage value is less than cost.");
//        } else {
//            double annualDepreciation = (cost - salvageValue) / usefulLife;
//            System.out.printf("\nAnnual Depreciation: ₹%.2f\n", annualDepreciation);
//            System.out.println("Year-wise depreciation schedule:");
//
//            for (int year = 1; year <= usefulLife; year++) {
//                double bookValue = cost - (annualDepreciation * year);
//                System.out.printf("Year %d: Book Value = ₹%.2f\n", year, bookValue);
//            }
//        }
//    }
//}

//Calculate the Batting Average
//public  class Condition.Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the total run score: ");
//        int totalScore = scanner.nextInt();
//        System.out.print("Enter the number of times out: ");
//        int TimesOut = scanner.nextInt();
//        if (totalScore < 0 || TimesOut < 0){
//            System.out.println("Invalid input! Runs and times out should be non negative");
//        } else if (TimesOut==0) {
//            System.out.println("Batting average not applicable");
//        }else {
//            double average = (double)totalScore / TimesOut;
//            System.out.print("Batting average:  " + average);
//        }
//    }
//}


//Calculate the CGPA

//public class Condition.Main{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of subjects: ");
//        int n = scanner.nextInt();
//
//        int totalGradePoints = 0;
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print("Enter marks for Subject " + i + ": ");
//            int marks = scanner.nextInt();
//
//            int gradePoint;
//
//            if (marks >= 90 && marks <= 100) {
//                gradePoint = 10;
//            } else if (marks >= 80) {
//                gradePoint = 9;
//            } else if (marks >= 70) {
//                gradePoint = 8;
//            } else if (marks >= 60) {
//                gradePoint = 7;
//            } else if (marks >= 50) {
//                gradePoint = 6;
//            } else if (marks >= 40) {
//                gradePoint = 5;
//            } else if (marks >= 0) {
//                gradePoint = 0;
//            } else {
//                System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
//                i--;
//                continue;
//            }
//
//            totalGradePoints += gradePoint;
//        }
//
//        double cgpa = (double) totalGradePoints / n;
//        System.out.printf("Your CGPA is: %.2f\n", cgpa);
//
//        scanner.close();
//    }
//}

//Power in java

//public class Condition.Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Take input
//        System.out.print("Enter base: ");
//        int base = scanner.nextInt();
//
//        System.out.print("Enter exponent: ");
//        int exponent = scanner.nextInt();
//
//        long result = 1;
//
//        if (exponent == 0) {
//            result = 1;
//        } else if (exponent > 0) {
//            for (int i = 1; i <= exponent; i++) {
//                result *= base;
//            }
//        } else {
//            for (int i = 1; i <= -exponent; i++) {
//                result *= base;
//            }
//            System.out.println("Result = 1/" + result + " (Decimal format not handled)");
//            scanner.close();
//            return;
//        }
//
//        System.out.println("Result = " + result);
//        scanner.close();
//    }
//}

//public class Condition.Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the principal amount ₹: ");
//        double principalAmount = scanner.nextDouble();
//        System.out.print("Enter the annual interest rate : ");
//        double annualRate = scanner.nextDouble();
//        System.out.print("Enter the time in years: ");
//        int years = scanner.nextInt();
//        if ( principalAmount < 0 || annualRate < 0 || years < 0){
//            System.out.println("Invalid input! All the values  non negative");
//        }else {
//            double amount = principalAmount;
//            for (int i = 1; i <=years ; i++) {
//                amount = amount*(1+annualRate /100);
//            }
//            double compoundInterest = amount - principalAmount;
//            System.out.printf("Compound Interest = ₹%.2f%n", compoundInterest);
//            System.out.printf("Total Amount = ₹%.2f%n", amount);
//        }
//    }
//}

import java.util.Scanner;

//public class Condition.Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//        int original = number;
//
//        int digits = 0;
//        int temp = number;
//
//        while (temp != 0) {
//            digits++;
//            temp /= 10;
//        }
//
//        int sum = 0;
//        temp = number;
//
//        while (temp != 0) {
//            int digit = temp % 10;
//            int power = 1;
//
//            for (int i = 1; i <= digits; i++) {
//                power *= digit;
//            }
//
//            sum += power;
//            temp /= 10;
//        }
//
//        if (sum == original) {
//            System.out.println(original + " is an Armstrong number.");
//        } else {
//            System.out.println(original + " is not an Armstrong number.");
//        }
//    }
//}

// Find the ncr and npr
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();

        if (n >= r && n >= 0 && r >= 0) {
            int npr = factorial(n) / factorial(n - r);
            int ncr = factorial(n) / (factorial(r) * factorial(n - r));

            System.out.println("nCr (Combination) = " + ncr);
            System.out.println("nPr (Permutation) = " + npr);
        } else {
            System.out.println("Invalid input! Ensure that n >= r and both are non-negative.");
        }
    }
    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
