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
    String ret = String.format("8%s", x);
	return ret;
	}

	public String ex7_3(short x){
		
		String ret = "";
		
		return ret;
	}

	public String ex7_3(int x){
		
		String ret = "";
		
		return ret;
	}

	public String ex7_3(long x){
		
		String ret = "";
		
		return ret;
	}
}