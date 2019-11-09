import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleClicker {
public static void main(String[] args) {
makeButtons(); 

}

private static void makeButtons() {
	JOptionPane.showMessageDialog(null, "Make Buttons");
	JFrame hi = new JFrame();
	JPanel hi2 = new JPanel();
	JButton hi3 = new JButton("Joke");
	JButton hi4 = new JButton("Punchline");
	hi2.add(hi3);
	hi2.add(hi4);
	hi.add(hi2);
	hi.setVisible(true);
    hi.pack();	

    
	
}
}
