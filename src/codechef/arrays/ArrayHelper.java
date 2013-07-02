package codechef.arrays;

public class ArrayHelper implements RepeatedlyMultipliable {
	
	@Override
	public String repeatedMultiply(int n, int e) {
		int[] result = loadIntoArray(n);
		for(int j=1; j<e; j++) {
			int[] tempSum = new int[1];
			for(int i=0; i<result.length; i++) {
				int output = result[i] * n;
				tempSum = sumIntermediateResults(tempSum,loadIntoArray(output),i);
			}
			result = tempSum;
		}
		return convertToString(result);
	}

	private String convertToString(int[] result) {
		StringBuilder builder = new StringBuilder();
		boolean isBeginZero = true;
		for(int i=result.length-1; i>=0; i--) {
			if(isBeginZero) {
				if(result[i] != 0) {
					isBeginZero = false;
					builder.append(result[i]);
				}
			} else {
				builder.append(result[i]);
			}
		}
		return builder.toString();
	}

	private int[] loadIntoArray(int n) {
		int j = 0;
		for(int i=n; i!=0; i/=10) {
			j++;
		}
		int[] resultArray = new int[j];
		
		int k = 0;
		for(; n!=0; n/=10) {
			resultArray[k++] = n%10;
		}
		return resultArray;
	}

	private int[] sumIntermediateResults(int[] tempSum, int[] loadIntoArray, int offset) {
		int resultSize = Math.max(tempSum.length, loadIntoArray.length);
		int[] result = new int[resultSize + 1];
		boolean carryForward = false;
		
		for(int i=0; i<offset; i++) {
			result[i] = tempSum[i];
		}
		
		int numberOfLoops = Math.max(tempSum.length-offset,loadIntoArray.length);
		
		for(int i=0; i < numberOfLoops; i++) {
			int a = (i+offset < tempSum.length ? tempSum[i+offset] : 0);
			int b = (i < loadIntoArray.length ? loadIntoArray[i] : 0);
			int sum = (carryForward ? a+b+1 : a+b);
			carryForward = sum > 9;
			result[i+offset] = sum % 10;
		}
		
		return result;
	}
}
