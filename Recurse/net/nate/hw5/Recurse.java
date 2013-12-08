package net.nate.hw5;

public class Recurse {

	public static char first(String s) {
		return s.charAt(0);
	}

	public static String rest(String s) {
		return s.substring(1, s.length());
	}

	public static int length(String s) {
		return s.length();
	}

	public static void printString(String s) {
		if (length(s) > 0) {
			System.out.print(first(s));
			printString(rest(s));
		}
	}

	public static void printBackward(String s) {
		if (length(s) > 0) {
			printBackward(rest(s));
			System.out.print(first(s));
		}
	}

	public static String reverseString(String s) {
		String result = "";
		if (length(s) > 0) {
			result = reverseString(rest(s));
			result += first(s);
		}
		return result;	
	}

	public static void main(String[] args){
		String helloworld = "hello";
		System.out.println("reverseString");
		System.out.println(reverseString(helloworld));
		System.out.println("printBackward");
		printBackward(helloworld);
		System.out.println();
		System.out.println("printString");
		printString(helloworld);
		System.out.println();
	}
}

