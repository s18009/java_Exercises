class Ex7{

	public int ex7_1(int a, int b){
	    if (a > b) {
            return b;
        } else {
		return a;
        }
	}

	public int ex7_1(int a, int b, int c){
    int [] n = {a, b, c};
	int min = a;
    for (int i = 0; i < n.length; i++) {
        if (min > n[i]) {
            min = n[i];
        }
    }
		return min;
	}

	public int ex7_1(int [] a){
	int min = a[0];
    for (int i = 0; i < a.length; i++) {
        if (min > a[i]) {
            min = a[i];
        }
    }
		return min;
	}


	public int ex7_2(int x){
    return Math.abs(x);
	}

	public long ex7_2(long x){
    return Math.abs(x);
   	}

	public float ex7_2(float x){
    return Math.abs(x);
	}

	public double ex7_2(double x){
    return Math.abs(x);
	}

	public String ex7_3(byte x){
    int i = Byte.toUnsignedInt(x);
   	String tmp = String.format("%8s", Integer.toBinaryString(i)).replace(' ', '0');
	return tmp;
	}

	public String ex7_3(short x){
    int i = Short.toUnsignedInt(x);
   	String tmp = String.format("%16s", Integer.toBinaryString(i)).replace(' ', '0');
	return tmp;
	}

	public String ex7_3(int x){
   	String tmp = String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
	return tmp;
	}

	public String ex7_3(long x){
   	String tmp = String.format("%64s", Long.toBinaryString(x)).replace(' ', '0');
	return tmp;
	}
}