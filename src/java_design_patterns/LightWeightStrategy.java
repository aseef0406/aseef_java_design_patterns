package java_design_patterns;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class LightWeightStrategy {
	
	 public static int getSum(List<Integer> values,Predicate<Integer> selector) {
		 int sum = 0;
		 for(var number:values) {
			 if(selector.test(number))
				 sum+=number;
		 }
		 return sum;
	 }
	 
	public static boolean isOdd(int number) {
		return number%2 != 0;
	}
	public static boolean isEven(int number) {
		return number%2 == 0;
	}
	
	 public static void  main(String args[]) {
		 
		List<Integer> values = Arrays.asList(1,2,3,4,5,7,8,9,10);
		System.out.println(getSum(values,number->true));
		System.out.println(getSum(values,number->number%2 == 0));
		System.out.println(getSum(values,LightWeightStrategy::isOdd));
		System.out.println(getSum(values,LightWeightStrategy::isEven));
	
	}
}
