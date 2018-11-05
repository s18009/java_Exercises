import java.util.*;
class Ex6{

	public int [] ex6_1(){
		int [] ret = {5, 4, 3, 2, 1};
		return ret;
	}

	public double [] ex6_2(){
		double [] ret = {1.1, 2.2, 3.3, 4.4, 5.5};
		return ret;
	}

	public int [] ex6_3(int a, int b){
		int [] ret = new int[a];
        for (int i = 0; i < a; i++) {
            ret[i] = b;
        }
		return ret;
	}

	public int [] ex6_4(int [] a){
		int [] ret = new int[4];
        int max = a[0];
        int min = a[1];
        for (int i = 0; i < a.length; i++){
            ret [0] += a[i];
            int v = a[i];
            if (v > max) {
                max = v;
            }
            if (v < min) {
                min = v;
            }
        }
        ret[1] = (int)Math.round((double)ret[0] / a.length);
        ret[2] = max;
        ret[3] = min;
		return ret;
    }

	public int ex6_5(int [] a, int key){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
               return i;
            }
        }
        return -1;
	}

	public int ex6_6(int [] a, int key){
	     for (int i = a.length - 1; i >= 0 ; i--) {
            if (a[i] == key) {
               return i;
            }
        }
        return -1;
	}


	public void ex6_7(int [] a, int idx){
        List<Integer> list = new ArrayList<Integer>();
        for (int tmp : a) {
            list.add(tmp);
        }

        list.remove(idx);
        list.add(a[a.length-1]);
		int [] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
	}

	public void ex6_8(int [] a, int idx, int n){
		
	}

	public void ex6_9(int [] a, int idx, int x){
		
	}

	public void ex6_10(int [] a, int [] b){
		
	}

	public int [] ex6_11(int [] a){
		
		int [] ret = new int[0];

		return ret;
	}

	public int [] ex6_12(int [] a, int x){
		
		int [] ret = new int[0];

		return ret;
	}

	public int [] ex6_13(int [] a, int idx){
		
		int [] ret = new int[0];

		return ret;
	}
	
	public int [] ex6_14(int [] a, int idx, int n){
		
		int [] ret = new int[0];
		
		return ret;
	}
	
	public int [] ex6_15(int [] a, int idx, int x){
		
		int [] ret = new int[0];
		
		return ret;
	}
}