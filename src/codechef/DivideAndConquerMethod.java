package codechef;

import java.math.BigInteger;

public class DivideAndConquerMethod extends Exponentiable {
	public static final BigInteger TWO = new BigInteger("2");
	public static final long LONG_TWO = 2L;

	public BigInteger npowern(BigInteger n,BigInteger e) {
		BigInteger result = n;
		if(!e.equals(BigInteger.ONE)) {
			BigInteger temp = npowern(n,e.divide(TWO));
			if(e.mod(TWO).equals(BigInteger.ZERO)) {
				result = temp.multiply(temp);
			} else {
				result = n.multiply(temp).multiply(temp);
			}
		}
		return result;
	}

	public long npowern(long n,long e) {
		long result = n;
		if(e != 1L) {
			long temp = npowern(n,e/LONG_TWO);
			if(e % LONG_TWO == 0L) {
				result = temp*temp;
			} else {
				result = n*temp*temp;
			}
		}
		return result;
	}
}
