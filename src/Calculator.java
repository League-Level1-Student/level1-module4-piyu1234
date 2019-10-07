import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	JButton addition = new JButton();
	JButton subtraction = new JButton();
	JButton multiplication = new JButton();
	JButton division = new JButton();
	JTextField firstNumber = new JTextField(10);
	JTextField secondNumber = new JTextField(15);
	JPanel math1 = new JPanel();
	JFrame math2 = new JFrame();
	JLabel math3 = new JLabel();
 	public static void main(String[] args) {
 	Calculator mathIsFun = new Calculator();
 	mathIsFun.setup();
	}
 	void setup() { 
 	math2.setVisible(true);	
 	math2.add(math1);
 	math1.add(addition);
 	math1.add(division);
 	math1.add(firstNumber);
 	math1.add(math3);
 	math1.add(multiplication);
 	math1.add(secondNumber);
 	math1.add(subtraction);
 	
 		
 		
 		
 		
 		
 		
 	}
 	}

