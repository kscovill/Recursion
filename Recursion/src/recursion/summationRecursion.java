package recursion;

import javax.swing.JOptionPane;

public class summationRecursion {
	static int fin =0;
	static int star = 0;
	static int ende = 0;

	public static void summationRecursion(){
		while(true){
			boolean yes = true;
			try{
			String starter = JOptionPane.showInputDialog(null,"Please enter a starting point");
			star = Integer.parseInt(starter);
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "ERROR: PLEASE ENTER A VALID NUMBER");
				yes = false;
			}
			if(yes == true){
				break;
			}
		}
		while(true){
			boolean yes = true;
			try{
				String ender = JOptionPane.showInputDialog(null,"Please enter a starting point");
				ende = Integer.parseInt(ender);
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "ERROR: PLEASE ENTER A VALID NUMBER");
				yes = false;
			}
			if(yes == true){
				break;
			}
		}
		
		System.out.println("Equation: x^2 + 2  Start: " + star + "   End: "+ ende);
		int finish = Sum(star,ende);
		System.out.println("The answer is: " + finish);
	}
	public static int Sum(int start, int end){
		int s = start;
		fin = (int) (fin + (Math.pow(s,2))+2);
		if(s == end){
			return fin;
		}
		start = start + 1;
		return Sum(start,end);
	}
}
