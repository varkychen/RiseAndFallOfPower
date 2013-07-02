package codechef;

import java.math.BigInteger;

public class DivideConquer2 extends Exponentiable {
	public static final BigInteger TWO = new BigInteger("2"); 
	
	public BigInteger npowern(BigInteger n, BigInteger e) {
		BigInteger result = BigInteger.ONE;
		BigInteger base = n;
		BigInteger i = BigInteger.ONE;
		
		while(i.compareTo(e) <= 0) {
			if(e.mod(TWO) == BigInteger.ZERO) {
				base = base.multiply(base);
				e = e.divide(TWO);
			} else {
				result = result.multiply(base);
				e = e.subtract(BigInteger.ONE);
			}
		}
		return result;
	}
}
