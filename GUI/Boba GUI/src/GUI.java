import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI {
	public GUI( ) {
	
		JLabel label = new JLabel();
		label.setText("Brilliant Boba");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0,0,0));
		label.setFont(new Font("Comic Sans MS",Font.BOLD, 69));
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(590, 0, 500, 200);
		
		JFrame frame = new JFrame();
		frame.setTitle("Boba Sort Main Page");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1690,1000);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(199, 178, 137));
		
		frame.add(label);
		
		
	}
	public static void main(String[] args) {
		new GUI();

	}

}
