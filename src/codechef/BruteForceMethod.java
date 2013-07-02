package codechef;

import java.math.BigInteger;

public class BruteForceMethod extends Exponentiable {
	public BigInteger npowern(BigInteger n, BigInteger e) {
		BigInteger product= BigInteger.ONE;
		for(BigInteger i = BigInteger.ONE; i.compareTo(e) < 1; i = i.add(BigInteger.ONE)) {
			product = product.multiply(n);
		}
		return product;
	}
}
