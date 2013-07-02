package codechef;

import codechef.arrays.AdditionInArraysMethod;
import codechef.arrays.ArrayHelper;

public class NExponentialN {
	
	public static void main(String[] args) {
		Exponentiable method = new AdditionInArraysMethod(new ArrayHelper());
		
		int n = Integer.parseInt(args[0]);
		long startTime = System.nanoTime();
		String[] result = method.npowern(n);
		long runTime = System.nanoTime() - startTime; 
		
		System.out.println(result[0]);
		System.out.println(runTime * Math.pow(10, -9) + " seconds");
	}
}
