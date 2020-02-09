import javax.swing.JOptionPane;

public class rollercoaster {
	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("How tall are you?");
		int height = Integer.parseInt(input);
		if (height > 48) {
			JOptionPane.showMessageDialog(null, "You can go on the rollercoaster!");
		} else {
			JOptionPane.showMessageDialog(null, "You need to grow more first.");
		}
	}

}
