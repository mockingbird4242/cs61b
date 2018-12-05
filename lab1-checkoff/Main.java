package com.company;

public class Main {
    /** decide whether year n is leap year or not
     *
     * @param n
     * @return
     */
    public static void isLeapYear(int n){
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 !=0 )) {
            System.out.println( n + " is a leap year");
        }
        else {
            System.out.println( n + " is not a leap year");
        }
    }
    public static void main(String[] args) {
	isLeapYear(2000);
	isLeapYear(1999);
	isLeapYear(2004);
	isLeapYear(2100);
    }
}
