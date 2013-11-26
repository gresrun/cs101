package net.nate.hw5;

public class Recurse {
public static char first(String s) {
	return s.charAt(0);
	}
public static String rest(String s){
	return s.substring(1, s.length());
	}
public static int length(String s) {
	return s.length();
	}
public static void printString (String s){
	for (int i = 0; i < s.length(); i++)
	System.out.println(s.substring(i,i+1));

	}
public static void printBackward(String s){
	for (int i = s.length()-1; i > -1;i--){
		System.out.print(s.substring(i,i+1));
		}
	}
public static void reverseString(String s){
	for (int i = s.length()-1; i > -1;i--){
		System.out.print(s.substring(i,i+1));
		}
	}
}


//FOR PART 5
//public static void main (String[] args){
//	String helloworld = "Hello";
//	reverseString(helloworld);
//		
//		}
//	}



//THIS IS PART 4
//public static void main (String[] args){
//	String helloworld = "Hello";
//	printBackward(helloworld);
//   }
//}
	



//THIS IS FOR PART 3
//public static void main (String[] args){
//	String helloworld = "Hello";
//	printString(helloworld);
//	
//		}


	

