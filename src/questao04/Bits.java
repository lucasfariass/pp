package questao04;

import java.util.Arrays;

public class Bits {
	
	private boolean[] bits;

	public Bits(int t) {
		this.bits = new boolean[t];
	}

	public boolean getBit(int pos) {
		return this.bits[pos];
	}

	public boolean[] getBits() {
		return this.bits;
	}

	public void setBits(boolean bit, int pos) {
		this.bits[pos] = bit;
	}

	public void and(Bits bits2) {
		int tam = this.bits.length < bits2.getBits().length ? this.bits.length : bits2.getBits().length;

		for (int i = 0; i < tam; i++) {
			bits[i] = bits[i] && bits2.getBits()[i];
		}
	}

	@Override
	public String toString() {
		return "Bits [bits=" + Arrays.toString(bits) + "]";
	}

}
