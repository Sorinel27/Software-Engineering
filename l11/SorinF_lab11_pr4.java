//lab 11 problema 4 Fratean Sorin, grupa 2022
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class clasaTest extends JFrame{
	private static final long serialVersionUID = 1L;
	
	static Button b1;
	static TextField tf1;
	static TextField tf2;
	static String name;
	static String group;
	static Label label1;
	static int WIDTH = 170;
	static int HEIGHT = 30;
	
	
	public static void main(String[] args) {
		Frame f = new Frame("App");
		f.setLayout(new FlowLayout());
		label1 = new Label("");
		
		
		tf1 = new TextField(15);
		tf1.setFont(new Font("SansSerif", Font.PLAIN, 16));
		tf1.setText("Type the name");
		
		tf2 = new TextField(15);
		tf2.setFont(new Font("SansSerif", Font.PLAIN, 16));
		tf2.setText("Type the group");
		 
		f.add(tf1);
		f.add(tf2);
		b1 = new Button("Apply the values");
		b1.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	label1.setText("Name: " + tf1.getText() + " Group: " + tf2.getText());
		    	label1.setSize(WIDTH, HEIGHT);
				label1.setBackground(Color.GRAY);
		    }
		});
		f.add(b1);
		f.add(label1);

		f.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(1);
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});

		// afisarea ferestrei
		f.setSize(500, 500);
		
		f.setVisible(true);
	}
}
