package com.sunny.utility;

import java.util.Scanner;

public class TestingUtility
{
	public static int inputInteger()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number");
		int number = sc.nextInt();
		return number;
	}
	public static double inputDouble()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number");
		double number = sc.nextDouble();
		return number;
	}
	public static int dayOfWeek(int d, int m, int y)
	{
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}
	public static int temperaturConversion(int tem, char t) {
		int conver;
		if (t == 'c' || t == 'C') 
		{
			conver = (tem * 9 / 5) + 32;
			System.out.println(tem+" degree celcius  =  "+conver+"  farhenhite");
		} 
		else 
		{
			conver = (tem - 32) * 5 / 9;
			System.out.println(tem+" degree farhenhite  =  "+conver+"  celcius");
		} 
		return conver;
	}
	public static double sqrt(double c) {

		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) 
		{
			t = (c / t + t) / 2;
		}

		return t;
	}
	public static int[] toBinary(int d) {

		String bin = "";
		while (d != 0) 
		{
			bin = (d % 2) + bin;
			d /= 2;
		}
		while (bin.length() % 4 != 0) 
		{
			bin = 0 + bin;
		}
		return stringToIntArray(bin);
	}
	public static int[] stringToIntArray(String bin) 
	{
		int[] binary = new int[bin.length()];
		for (int i = 0; i < binary.length; i++) {
			binary[i] = bin.charAt(i) - 48;
		}
		return binary;
	}
	public static int toDecimal(int[] binary) {
		int dec = 0, j = 0;
		for (int i = binary.length - 1; i >= 0; i--) 
		{
			if (binary[i] == 1) {
				dec = dec + (int) Math.pow(2, j);
			}
			j++;
		}
		return dec;
	}
	public static double monthlyPayment(double p, double y, double r)
	{
		double n = 12 * y;
		double r0 = r / (12 * 100);
		double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
		return payment;
		
	}
	/**
	 * Function to print array
	 *
	 * @param array the array to print integer on console
	 */
	public static void showArr(int[] arr) {
		// System.out.println("array is ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}


	/**
	 * Function to check if no is power of 2
	 *
	 * @param number to check the for power of 2
	 * @return boolean for prime no
	 */
	public static boolean powerOf2(int n) {
		// calculate power of 2 using math.pow
		// check if is equal to given no
		// stops if pow is greater than given number
		int i = 0, temp = (int) Math.pow(2, i);
		while (temp < n) {
			if (temp == n) {
				return true;
			}
			i++;
		}
		return false;
	}

	/**
	 * Function to swap nibbles in array
	 *
	 * @param int array to swap nibbles in array
	 * @return return swapped array
	 */
	public static int[] swapNibbles(int[] arr) {
		// swap nibbles at first and last of the array
		// j is used for saving last 4 index of the array
		int temp, j = arr.length - 4;
		for (int i = 0; i < 4; i++) 
		{ // loop runs 4 times and swap first four element to last four elements
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}
	public static char c_f_Input() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter temp in c or f");
		char t = s.next().charAt(0);
		if (t != 'f' && t != 'F' && t != 'c' && t != 'C')
		{
			System.out.println("enter correct input");
			return c_f_Input();
		}
		else return t;
	}
}
