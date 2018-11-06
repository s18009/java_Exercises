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


	public int [] ex6_7(int [] a, int idx){
    List<Integer> list = new ArrayList<Integer>();
    for (int tmp : a) {
    list.add(tmp);
    }
    list.remove(idx);

    int [] ret = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
        ret[i] = list.get(i);
    }
    return ret;
}


    public int [] ex6_8(int [] a, int idx, int n){
        List<Integer> list = new ArrayList<Integer>();
        if (idx != n) {
            for(int tmp: a) {
                list.add(tmp);
            }
            for (int i = 0; i < n; i++) {
                list.remove(idx);
            }

            int [] ret = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                ret[i] = list.get(i);
            }
            return ret;
        }
        return a;
    }

    public int [] ex6_9(int [] a, int idx, int x){
    List<Integer> list = new ArrayList<Integer>();
    for(int tmp: a) {
        list.add(tmp);
    }

    list.add(idx, x);
    int [] ret = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
        ret[i] = list.get(i);
    }
    return ret;
    }

    public void ex6_10(int [] a, int [] b){
    int [] ret = new int[b.length];
    int foo;
    if (a.length > b.length) {
        foo = b.length;
    } else {
        foo = a.length;
    }
    for (int i = 0; i < foo; i++) {
        ret[i] = b[i];
    }
    for (int i = 0; i < foo; i++) {
        b[i] = a[i];
    }
    for (int i = 0; i < foo; i++) {
        a[i] = ret[i];
    }
    }

    public int [] ex6_11(int [] a){
        int [] ret = new int[a.length];
        for (int i = 0; i < a.length; i++) {
           ret[i] = a[i];
        }
        return ret;
    }

    public int [] ex6_12(int [] a, int x){
    List<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < a.length; i++) {
       if (x == a[i]) {
           list.add(i);
       }
    }
    int [] foo = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
        foo[i] = list.get(i);
    }
    return foo;
    }

    public int [] ex6_13(int [] a, int idx){
    List<Integer> list = new ArrayList<Integer>();
    if (a.length < idx+1 || idx < 0) return a;
    for(int tmp: a) {
        list.add(tmp);
    }
    list.remove(idx);

    int [] foo = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
        foo[i] = list.get(i);
    }
    return foo;
    }

    public int [] ex6_14(int [] a, int idx, int n){
    List<Integer> list = new ArrayList<Integer>();
    int [] hoge = new int[0];
    if (idx > n) {
        return a;
    }
    if (n > a.length) {
        return hoge;
    }

    for(int tmp: a) {
        list.add(tmp);
    }
    for (int i = 0; i < n; i++) {
        list.remove(idx);
    }
    int [] ret = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
        ret[i] = list.get(i);
    }
    return ret;

}


    public int [] ex6_15(int [] a, int idx, int x){
    List<Integer> list = new ArrayList<Integer>();
    for(int tmp: a) {
        list.add(tmp);
    }
    if (0 > idx) {
        list.add(0, x);
    } else {
        list.add(idx, x);
    }

    int [] ret = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
        ret[i] = list.get(i);
    }
    return ret;

}
}