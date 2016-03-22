package recursion;

import javax.swing.JOptionPane;

public class intRecursion {
	static String j;
	static int num;
	static int count = 0;
	public static void intRecursion() {
		while(true){
			boolean yes = true;
			try{
				j = JOptionPane.showInputDialog(null, "Please enter a number.");
				num = Integer.parseInt(j);
			}catch(NumberFormatException e){
				System.out.println("ERROR: PLEASE ENTER A NUMBER");
				yes = false;
			}
			if(yes == true){
				break;
			}
		}
		int times = SquareRoot(num);
		int exponent = 2^(times);
		JOptionPane.showMessageDialog(null, "To get to 1 by dividing by 2, it took " + times + " iteration(s) to get there. \n "
				+ "Which is close to 2 to the power of: " + times);
		
	}
	public static int SquareRoot(int root){
		if (root == 1){
			return(count);		
		}else{
			count = count +1;
			root = root/2;
			return(SquareRoot(root));
		}
		
	}
}
