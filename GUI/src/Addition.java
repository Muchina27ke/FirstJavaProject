import javax.swing.JOptionPane;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String firstnumber = JOptionPane.showInputDialog("Enter first number: ");
String secondnumber = JOptionPane.showInputDialog("Enter second number: ");

int number1=Integer.parseInt(firstnumber);
int number2=Integer.parseInt(secondnumber);
 int sum =number1 + number2;
 JOptionPane.showMessageDialog(null, "The sum is : " +sum,"Sum of 2 integers", JOptionPane.PLAIN_MESSAGE);
 
	}

}
