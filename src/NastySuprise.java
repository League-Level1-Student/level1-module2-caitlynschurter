import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
public class NastySuprise implements ActionListener {
	
	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	
	public static void main(String[] args) {
		new NastySuprise().getGoing();
		
	}
	
	

	private void getGoing() {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		
		JPanel panel = new JPanel();
		frame.add(panel);
	
		leftButton.setText("Twick");
		leftButton.setSize(150,30);
		leftButton.addActionListener(this);
		
		rightButton.setText("Tweat");
		rightButton.setSize(150,30);
		rightButton.addActionListener(this);
		
		panel.add(leftButton);
		panel.add(rightButton);
		
		frame.pack();
	}

	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//https://www.chickensmoothie.com/oekaki/image/image.php?id=1347900&size=large&format=auto&rev=1357394913
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == leftButton) {
			showPictureFromTheInternet("https://www.chickensmoothie.com/oekaki/image/image.php?id=1347900&size=large&format=auto&rev=1357394913"); 
		}
		
		else if (buttonPressed == rightButton) {
			showPictureFromTheInternet("https://www.clipartmax.com/png/middle/66-662002_purple-cute-kawaii-unicorn-ghost-snapchat-tongue-tumblr-cute-snapchat-ghosts.png");
		}
	}

	
	
}
