package Test;

import java.util.ArrayList;

class Cal {

	int arr[] = new int[10];
	ArrayList<Integer> list = new ArrayList<Integer>();

	private static Cal instance = null;

	public static Cal getinstance() {
		if (instance == null) {
			instance = new Cal();
		}
		return instance;
	}

	public int InsertVal(int tmp) {
		try {
			list.add(tmp);

		} catch (Exception e) {
			return -1;
		}
		return 0;
	}

	public void ShowVal() {
		System.out.println("-----------조회-----------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}

public class Test1 {

	public static void main(String[] args) {
		Cal cal = Cal.getinstance();

		for (int i = 1; i <= 100; i++) {
			cal.InsertVal(i);
		}
		cal.ShowVal();

	}

}
