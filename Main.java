package Hey;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwingUtilities.invokeLater(new Runnable () {
			public void run (){		
		JFrame frame = new MainFrame("Company personal");		
		frame.setVisible(true);
		frame.setSize(700, 850);
		//frame.pack();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
