import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class SoftwareSales {
	public static void main(String [] args)
	   {
	   	DecimalFormat twoDecimal = new DecimalFormat("#,##0.00");
	   	final double retailPrice = 99;
	   	String inputPackageAmount;
	   	double discount, amountOfOrder, discountAmount, totalAmount, quantity;
	   	
	   	inputPackageAmount = JOptionPane.showInputDialog("enter the number of packages");
	   	quantity = Integer.parseInt(inputPackageAmount);
	   	
	   	if (quantity < 9)
	   		discount = 0;
	   	else if (quantity < 20)
	   		discount = 0.2;
	   	else if (quantity < 50)
	   		discount = 0.3;
	   	else if (quantity < 100)
	   		discount = 0.4;
	   	else discount = 0.5;
	   	
		amountOfOrder = quantity * retailPrice;
		discountAmount = amountOfOrder * discount; 
		totalAmount = amountOfOrder - discountAmount;
		
	   	JOptionPane.showMessageDialog(null, "The Discount amount is: $" + discountAmount + 
	   										"\nThe Purchase amount after the discount is: $" + totalAmount);	
	   	
	   }
	  
	     
	}