import java.util.*;

class Ex4{

	public int [] ex4_1(int [] a){
        Arrays.sort(a);
        return a;
	}

	public int [] ex4_2(int [] a){
        List<Integer> list = new ArrayList<Integer>();
        for (int tmp : a) {
            list.add((Integer)tmp);
        }

        Collections.sort(list, Comparator.reverseOrder());

        for (int i = 0; i < a.length; i++) {
            a[i] = list.get(i);
        }
        return a;
	}

	public String [] ex4_3(int [] a){
        String [] hoge = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                hoge[i] = "零";
            } else if (a[i] < 0) {
                hoge[i] = "負";
            } else {
                hoge[i] = "正";
            }
        }
            return hoge;
    }


	public int ex4_4(int a){
		return String.valueOf(a).length();

	}

	public int ex4_5(int a){
        int hoge = 0;
        for (int i = 1; i < a + 1; i++) {
            hoge += i;
        }
		return hoge;
	}

	public int [] ex4_6(int a){
        List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < a + 1; i++) {
            if (a % i == 0) {
                list.add(i);
            }
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
		return array;

	}

	public boolean ex4_7(int a){
        if (a == 1) {
              return false;
        }
        if (a == 2) {
              return true;
        }
 
        for (int i = 2; i < a; i++) {
           if (a % i == 0) {
                return false;
            }
        }
        return true;
	}

	public int ex4_8(int [] a){
        int answer = 0;
	for (int hoge: a) {
       answer += hoge;
    }
		return answer;
	}

	public int ex4_9(int [] a){
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
        sum += a[i];
    }
		return (int)Math.round((double)sum / a.length);

	}
}

