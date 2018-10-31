import java.io.*;
import java.util.*;
class Ex3{

	public String ex3_0(int n){
        if (n > 0) {
            return "その値は正です";
        } else {
            return "その値は０か負です";
        }
	}

	public int ex3_1(int n){
        int b = Math.abs(n);
		return b;

	}

	public String ex3_2(int a, int b){
        String answer;
        if (a % b == 0) {
            answer = String.format("%dは%dの約数です", b, a);
        } else {
            answer = String.format("%dは%dの約数ではありません",b, a);
        }
        return answer;
    }

	public String ex3_3(int a, int b){
        String answer;
        if (a > b) {
            answer = String.format("%dの方が大きいです", a);
        } else if (a < b) {
            answer = String.format("%dの方が大きいです", b);
        } else {
            answer = "同じ値です";
        }
        return answer;
    }

    public String ex3_4(int a){
        if ( a < 0 ) {
            return "正でない整数値です";
        } else if (a % 5 == 0) {
            return "その値は5で割り切れます";
        } else {
            return "その値は5で割り切れません";
        }
    }

	public String ex3_5(int a){
        if (a < 0) {
            return "正でない整数値です";
        } else if (a % 10 == 0) {
            return "その値は10の倍数です";
        } else {
            return "その値は10の倍数ではありません";
        }
	}
	public String ex3_6(int a){
        if (a % 3 == 0) {
		    return "その値は3で割り切れます";
        } else if (a % 3 == 1) {
            return "その値を3で割った余りは1です";
        } else if (a % 3 == 2) {
            return "その値を3で割った余りは2です";
        } else {
            return "正でない整数値です";
        }
	}

	public String ex3_7(int a){
        if (a < 0 || 100 < a) {
            return "範囲(0～100)外の値です";
        } else if (a <= 59) {
		    return "不可";
        } else if (a <= 69) {
            return "可";
        } else if (a <= 79) {
            return "良";
        } else {
            return "優";
        }
	}

	public double ex3_8(double a, double b){
        if (a > b) {
		    return a;
        } else {
            return b;
        }
	}

	public int ex3_9(int a, int b){
        return a - b;
	}

	public String ex3_10(int a, int b){
        int answer = Math.abs(a - b);
        if (answer <= 10) {
            return "それらの差は10以下です";
        } else {
		    return "それらの差は11以上です";
        }
    }

	public int ex3_11(int a, int b, int c){
        int master = a;
        int[] datas = {a, b, c};
        for (int data : datas) {
            master = Math.min(master, data);
        }
        return master;
	}

	public int ex3_12(int a, int b, int c){
        int[] foo = {a, b, c};
        Arrays.sort(foo);
		return foo[1];
	}

	public String ex3_13(int a){
        String hoge;
        if (a >= 1 && a <= 2 || a == 12) {
		    hoge = "冬";
        } else if (a >= 3 && a <= 5) {
            hoge =  "春";
        } else if (a >= 6 && a <= 8) {
            hoge = "夏";
        } else if (a >= 9 && a <= 11) {
            hoge = "秋";
        } else {
            hoge = "範囲(1～12)外の値です";
        }
        return hoge;
	}

}
