import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class War implements MouseListener {
	JFrame frame;
	JPanel topPanel;
	JPanel middlePanel;
	JPanel bottomPanel;
	JLabel leftCard;
	JLabel rightCard;
	JButton goButton;
	JLabel topMessage;
	JLabel bottomMessage;
	JLabel leftCardTitle;
	JLabel rightCardTitle;
	JLabel leftScore;
	JLabel rightScore;

	ScoreKeeper scores = new ScoreKeeper(0, 0, 0);
	Deck deck;
	int playerPoints = 0;
	int computerPoints = 0;
	int bonusPoints = 0;

	public void Initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 400);
		frame.setTitle("War");

		topPanel = new JPanel();
		topPanel.setBackground(new Color(66, 226, 244));
		frame.add(topPanel, BorderLayout.NORTH);
		topMessage = new JLabel();
		topMessage.setText("Welcom to WAR");
		topPanel.add(topMessage);

		leftScore = new JLabel();
		frame.add(leftScore, BorderLayout.WEST);

		middlePanel = new JPanel();
		middlePanel.setBackground(new Color(242, 184, 238));
		frame.add(middlePanel, BorderLayout.CENTER);

		rightScore = new JLabel();
		frame.add(rightScore, BorderLayout.EAST);

		bottomPanel = new JPanel();
		bottomPanel.setBackground(new Color(255, 255, 255));
		frame.add(bottomPanel, BorderLayout.SOUTH);
		bottomMessage = new JLabel();

	}

	public static void main(String[] args) {
		testDeck();
		new War().Initialize();
	}

	private static void testDeck() {
		Deck d = new Deck();
		System.out.println(d);
		d.shuffle();
		System.out.println(d);
		int card = d.dealCard();
		System.out.print(card + " ");
		card = d.dealCard();
		System.out.print(card + " ");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource().equals(goButton)) {
			int playerCard = deck.dealCard();
			leftCard.setText(Integer.toString(playerCard));;
			int computerCard= deck.dealCard();
			rightCard.setText(Integer.toString(computerCard));
		}
		
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
