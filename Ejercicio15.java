import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

class Ejercicio15 {
	
	public static void main(String args[])
	{
	   int fibonacci[] = new int[100];
	   int a =0,b=1,c;

	   for (int i=0;i<100;i++)
	   {
	   	
	   	fibonacci[i]=a;
	   	c = a+b;
	   	a = b;
	   	b = c;

	   }
       
       for (int i=0;i<100;i++)
       {
       	System.out.println(fibonacci[i]);
       }


	}
}
