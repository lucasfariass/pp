package questao04;

public class BitsMain {
	
	public static void main(String[] args) {
		Bits bits = new Bits(2);
		Bits bits2 = new Bits(3);
		bits.setBits(true, 0);
		bits.setBits(true, 1);

		bits2.setBits(true, 0);
		bits2.setBits(false, 1);
		bits2.setBits(false, 2);

		bits.and(bits2);

		System.out.println(bits);
	}

}
