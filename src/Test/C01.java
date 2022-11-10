package Test;

import java.util.Scanner;

public class C01 {

	public static boolean Iscontain(String str, String[] text) {
		if (text[0].contains(str) || text[1].contains(str) || text[2].contains(str)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[3];

		for (int i = 1; i <= arr.length; i++) {
			System.out.print(i + ". 문자열을 입력하세요 : ");
			arr[i - 1] = sc.nextLine();
		}

		System.out.print("찾을 문자열 입력하세요 : ");
		String search = sc.nextLine();

		System.out.println(search + " 포함 여부 : " + Iscontain(search, arr));

	}

}