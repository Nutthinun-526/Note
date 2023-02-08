import javax.swing.JOptionPane;

public class RectangleDemo1 {


	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(4.5, 15, "red");
		
		JOptionPane.showMessageDialog(null, r1.toString(),"Rectangle",1, null);

	}

}
