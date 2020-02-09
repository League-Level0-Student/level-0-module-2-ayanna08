import javax.swing.JOptionPane;

public class voting_booth {
	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("How old are you?");
		int age = Integer.parseInt(input);
		if (age > 18) {
			JOptionPane.showInputDialog("Who should the next president be?");
		} else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think!");
		}
	}

}
