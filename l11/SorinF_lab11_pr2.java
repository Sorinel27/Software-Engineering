//lab 11 problema 2 Fratean Sorin, grupa 2022
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class clasaTest extends JFrame{
	static final long serialVersionUID = 1L;
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
    static JButton button;
    static JButton zero;
    static JButton one;
    static JButton two;
    static JButton three;
    static JButton four;
    static JButton five;
    static JButton six;
    static JButton seven;
    static JButton eight;
    static JButton nine;
    static JButton plus;
    static JButton minus;
    static JButton multiply;
    static JButton divide;
    static JButton point;
    static JButton equal;
    static JButton clear;
    static TextField td;
    static double a, b, result;
    static String ok;
    
    public clasaTest(String name) {
      super(name);
      setResizable(true);
    }

    public void addComponentsToPane(final Container pane) {
        if (RIGHT_TO_LEFT) {
            	pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
		pane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		Clicklistener click = new Clicklistener();
		if (shouldFill) {
			c.fill = GridBagConstraints.HORIZONTAL;
		}
		
		td = new TextField("");
		c.fill = GridBagConstraints.HORIZONTAL;   
		c.gridx = 0;
		c.gridy = 0;
		pane.add(td, c);
		
		seven = new JButton("7");
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		seven.addActionListener(click);
		pane.add(seven, c);
	
		eight = new JButton("8");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 1;
		c.gridy = 1;
		eight.addActionListener(click);
		pane.add(eight, c);
	
		nine = new JButton("9");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 2;
		c.gridy = 1;
		nine.addActionListener(click);
		pane.add(nine, c);
		
		four = new JButton("4");
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		four.addActionListener(click);
		pane.add(four, c);
	
		five = new JButton("5");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 1;
		c.gridy = 2;
		five.addActionListener(click);
		pane.add(five, c);
	
		six = new JButton("6");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 2;
		c.gridy = 2;
		six.addActionListener(click);
		pane.add(six, c);
		
		one = new JButton("1");
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 3;
		one.addActionListener(click);
		pane.add(one, c);
	
		two = new JButton("2");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 1;
		c.gridy = 3;
		two.addActionListener(click);
		pane.add(two, c);
	
		three = new JButton("3");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 2;
		c.gridy = 3;
		three.addActionListener(click);
		pane.add(three, c);
		
		zero = new JButton("0");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 4;
		zero.addActionListener(click);
		pane.add(zero, c);
		
		point = new JButton(".");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 1;
		c.gridy = 4;
		point.addActionListener(click);
		pane.add(point, c);
		
		equal = new JButton("=");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 2;
		c.gridy = 4;
		equal.addActionListener(click);
		pane.add(equal, c);
		
		plus = new JButton("+");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 3;
		c.gridy = 4;
		plus.addActionListener(click);
		pane.add(plus, c);
		
		minus = new JButton("-");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 3;
		c.gridy = 3;
		minus.addActionListener(click);
		pane.add(minus, c);
		
		multiply = new JButton("*");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 3;
		c.gridy = 2;
		multiply.addActionListener(click);
		pane.add(multiply, c);
		
		clear = new JButton("Clear");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 1;
		c.gridy = 0;
		clear.addActionListener(click);
		pane.add(clear, c);
		
		divide = new JButton("/");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 3;
		c.gridy = 1;
		divide.addActionListener(click);
		pane.add(divide, c);
    }
    
    private class Clicklistener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
    		if (e.getSource() == equal) {
    			b = Double.parseDouble(td.getText());
    			if(ok == "+")
    				result = a + b;
    			if(ok == "-")
    				result = a - b;
    			if(ok == "*")
    				result = a * b;
    			if(ok == "/")
    				result = a / b;
    			td.setText(String.valueOf(result));
    		}
    		if (e.getSource() == clear) {
    			td.setText("");
    			a = 0;
    			b = 0;
    		}
    		if (e.getSource() == zero) {
    			td.setText(td.getText() + "0");
    		}
    		if (e.getSource() == one) {
    			td.setText(td.getText() + "1");
    		}
    		if (e.getSource() == two) {
    			td.setText(td.getText() + "2");
    		}
    		if (e.getSource() == three) {
    			td.setText(td.getText() + "3");
    		}
    		if (e.getSource() == four) {
    			td.setText(td.getText() + "4");
    		}
    		if (e.getSource() == five) {
    			td.setText(td.getText() + "5");
    		}
    		if (e.getSource() == six) {
    			td.setText(td.getText() + "6");
    		}
    		if (e.getSource() == seven) {
    			td.setText(td.getText() + "7");
    		}
    		if (e.getSource() == eight) {
    			td.setText(td.getText() + "8");
    		}
    		if (e.getSource() == nine) {
    			td.setText(td.getText() + "9");
    		}
    		if (e.getSource() == button) {
    			System.out.println(button.getText());
    		}
    		
    		if (e.getSource() == plus) {
    			a = Double.parseDouble(td.getText());
    			ok = "+";
    			td.setText("");
    		}
    		if (e.getSource() == minus) {
    			a = Double.parseDouble(td.getText());
    			ok = "-";
    			td.setText("");
    		}
    		if (e.getSource() == multiply) {
    			a = Double.parseDouble(td.getText());
    			ok = "*";
    			td.setText("");
    		}
    		if (e.getSource() == divide) {
    			a = Double.parseDouble(td.getText());
    			ok = "/";
    			td.setText("");
    		}
    	}
    }

    
    private static void createAndShowGUI() {
        
    	clasaTest frame = new clasaTest("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addComponentsToPane(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500, 300);
    }

    public static void main(String[] args) {
       
    	try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    	createAndShowGUI();
           
    }
}