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
public static void printString (String s, int r){
	 if (r == s.length()){return;}
     else{
     	System.out.println(s.charAt(r));
     	printString(s,++r);
     	return;
     }

        }
public static void printBackward(String s, int r){
        if (r == 0){return;}
        else{
        	System.out.println(s.charAt(r-1));
        	printBackward(s,--r);
        	return;
        }
                }
        
public static void reverseString(String s, int r){
        if (r == 0){return;}
        else{
        	System.out.print(s.charAt(r-1));
        	reverseString(s,--r);
        	return;}	
	}



                
        



//THIS IS FOR reverseString()
//public static void main (String[] args){
//        String helloworld="hello";
//                int temp = helloworld.length();
//					reverseString(helloworld, temp);
//                }
//        }



//THIS IS FOR printBackward()
//public static void main (String[] args){
//        String helloworld = "Hello";
//        int temp = helloworld.length();
//        printBackward(helloworld, temp); 
//        }
//}
        



//THIS IS FOR printString()
//public static void main (String[] args){
//        String helloworld = "Hello";
//        int temp = 0;
//        printString(helloworld,temp);
//}
//	}

