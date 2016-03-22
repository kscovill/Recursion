package recursion;

import javax.swing.JOptionPane;

public class StringRecursion {
	static int count = -1;
	
	public static void StringRecursion() {
		String string = JOptionPane.showInputDialog(null, "Enter a String (one word)");
		char[] stringer = string.toCharArray();
		System.out.println("Your final String is:\n");
		
		stringer(stringer);
		
	}
	public static String stringer(char[] array){
		String string = "";
		
		if (string.length() == array.length){
			return string;
		}
		count = count +1;
		try{
			System.out.println(array[count]+ "\n");
		}catch(ArrayIndexOutOfBoundsException e){
			return(string);
		}
		string = string + array[count];
		return(stringer(array)) ;
	}
}
