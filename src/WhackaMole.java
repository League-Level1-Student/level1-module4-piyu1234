import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackaMole {
public static void main(String[] args) {
	JFrame hi = new JFrame();
	JPanel hi2 = new JPanel();
	JButton hi3 = new JButton();
	JButton hi4 = new JButton();
	hi2.add(hi3);
	hi2.add(hi4);
	hi.add(hi2);
	hi.setVisible(true);
    hi.setSize(600, 600);	
}
}
