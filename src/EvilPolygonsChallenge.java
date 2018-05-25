import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot juk = new Robot();
		// 2. Set the speed to 100
		juk.setSpeed(100);
		int colorChoice = JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE,
				JOptionPane.DEFAULT_OPTION, null, new String[] { "Color 1", "Color 2", "Color 3" }, 0);

		// 3. Use if statements to check the the value of colorChoice and set the pen
		// color accordingly
		if (colorChoice == 2)
			;
		{
			juk.setPenColor(255, 0, 0);
		}
		if (colorChoice == 1)
			;
		{
			juk.setPenColor(0, 0, 255);
		}
		if (colorChoice == 3)
			;
		{
			juk.setPenColor(0, 255, 0);
		}
		// 4. Ask the use how many polygons they want to be drawn.
		String turd = JOptionPane.showInputDialog("how many sided polygon would you like?");

		int tuf = Integer.parseInt(turd);

		if (tuf <= 2) {
			JOptionPane.showMessageDialog(null, "*ERROR COMPUTE MACHINE BROKE*");

		}
		// 5. Use the robot to draw the number of polygons the user requested.

		// 6. Make it so your shapes do not overlap

		// 7. Challenge: add more colors to the Option Dialog.
	}
}
