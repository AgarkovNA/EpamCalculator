package Cal1;

import java.util.*;
import java.util.Scanner;

public class Cal1_test {
	public static void main(String[] args)
	    {
	        System.out.println("������� 2 ������������� �����");
	        Scanner as= new Scanner(System.in);
	        int num1,num2;
	        num1 = as.nextInt();
	        num2 = as.nextInt();
	        System.out.println("��������: 1 ��� ������������, 2 ��� ���������, 3 ��� ���������, 4 ��� �������");
	        int choose;
	        choose = as.nextInt();
	        switch (choose){
	        case 1:
	            System.out.println(summation( num1,num2));
	            break;
	        case 2:
	            System.out.println(subtraction( num1,num2));
	            break;      
	        case 3:
	            System.out.println(multiplication( num1,num2));
	            break;
	        case 4:
	            System.out.println(division( num1,num2));
	            break;
	            default:
	                System.out.println("YOU KNOW NOTHING JOHN SNOW!!!");

	        }

	    }
	    public static double summation(double x, double y)
	    {
	    	
	        double result = x + y;
	        return result;
	    }
	    public static double subtraction(double x, double y)
	    {
	        double result = x-y;
	        return result;
	    }
	    public static double multiplication(double x, double y)
	    {
	    	double result = x*y;
	        return result;
	    }
	    public static double division(double x, double y)
	    {
	        double result = x/y;
	        return result;
	    }

	}