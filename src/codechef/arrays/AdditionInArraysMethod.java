package codechef.arrays;

import codechef.Exponentiable;

public class AdditionInArraysMethod extends Exponentiable {
	 private RepeatedlyMultipliable helper;

	 public AdditionInArraysMethod(RepeatedlyMultipliable helper) {
		 this.helper = helper;
	 }
	 
	@Override
	public String[] npowern(int n, int e) {
		String output = helper.repeatedMultiply(n,e);
		return new String[] { output };
	}
}
