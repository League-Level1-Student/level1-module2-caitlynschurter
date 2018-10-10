import javax.swing.JOptionPane;

import org.junit.experimental.theories.ParameterSignature;

public class PopcornPopper2000 {
public static void main(String[] args) {

	Microwave micro = new Microwave();
	
	String popCornFlavor = JOptionPane.showInputDialog("What flavr cornpop do yous wants?");
	Popcorn pop = new Popcorn(popCornFlavor);
	
	micro.putInMicrowave(pop);
	
	String popCornTimeS = JOptionPane.showInputDialog("How longs do yous cooks da popcorns");
	int popCornTime = Integer.parseInt(popCornTimeS);
	micro.setTime(popCornTime);
	
	micro.startMicrowave();
	
}
}
