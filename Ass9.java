package assignments;

import java.util.Arrays;
import java.util.List;

public class Ass9 {
//WAP to implement predicate to check given list of array contain how many even and odd 
	
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(3, 4,5, 6, 7,12,10, 20);
		long evencount= list.stream().filter(num -> num % 2 == 0).count();
		long oddcount= list.stream().filter(num -> num % 2 != 0).count();
		
		System.out.println("there are "+evencount+" Even numbers");
		System.out.println("there are "+oddcount+" Odd numbers");
	}

}
