package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame ();
	JPanel panel = new JPanel();
	char currentLetter= generateRandomLetter();
	JLabel hi = new JLabel();
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}

	
	
	public void createUI() {
		frame.add(panel);
		frame.setVisible(true);
		currentLetter = generateRandomLetter();
		
		hi.setText(""+currentLetter);
		panel.add(hi);
		hi.setFont(hi.getFont().deriveFont(28.0f));
		hi.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		frame.pack();
		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		currentLetter = generateRandomLetter();
		hi.setText(currentLetter + "");
		frame.pack();
		}
}
