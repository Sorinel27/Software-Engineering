//lab 11 problema 1 Fratean Sorin, grupa 2022
//import java.util.Random;
//import java.util.Arrays;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class clasaTest extends JFrame {

	static final long serialVersionUID = 1L;

    GridLayout experimentLayout = new GridLayout(0, 3);
    JButton clear;
    JButton zero;
    JButton one;
    JButton two;
    JButton three;
    JButton four;
    JButton five;
    JButton six;
    JButton seven;
    JButton eight;
    JButton nine;
    JButton sum;
    JButton difference;
    JButton multi;
    JButton divide;
    JButton equal;
    JButton point;
    TextField td;
    double a = 0;
    double b = 0;
    double result = 0;
    String ok = "";
    
    public clasaTest(String name) {
        super(name);
        setResizable(true);
    }
    public void addComponentsToPane(final Container pane) {
        final JPanel compsToExperiment = new JPanel();
        compsToExperiment.setLayout(experimentLayout);
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(2,3));
        td = new TextField(30);
        Clicklistener click = new Clicklistener();
        clear = new JButton("C");
        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        point = new JButton(".");
        equal = new JButton("=");
        sum = new JButton("+");
        difference = new JButton("-");
        multi = new JButton("*");
        divide = new JButton("/");
        JButton aaa = new JButton("aaaaaaaaaaa");
        Dimension dim = aaa.getPreferredSize();
        compsToExperiment.setPreferredSize(new Dimension((int)(dim.getWidth() * 2.5)+maxGap, (int)(dim.getHeight() * 3.5)+maxGap * 2));
        
        clear.addActionListener(click);
        zero.addActionListener(click);
        one.addActionListener(click);
        two.addActionListener(click);
        three.addActionListener(click);
        four.addActionListener(click);
        five.addActionListener(click);
        six.addActionListener(click);
        seven.addActionListener(click);
        eight.addActionListener(click);
        nine.addActionListener(click);
        sum.addActionListener(click);
        difference.addActionListener(click);
        multi.addActionListener(click);
        divide.addActionListener(click);
        equal.addActionListener(click);
        point.addActionListener(click);
        
        compsToExperiment.add(td);
        compsToExperiment.add(clear);
        compsToExperiment.add(nine);
        compsToExperiment.add(eight);
        compsToExperiment.add(seven);
        compsToExperiment.add(six);
        compsToExperiment.add(five);
        compsToExperiment.add(four);
        compsToExperiment.add(three);
        compsToExperiment.add(two);
        compsToExperiment.add(one);
        compsToExperiment.add(zero);
        compsToExperiment.add(point);
        compsToExperiment.add(equal);
        compsToExperiment.add(sum);
        compsToExperiment.add(difference);
        compsToExperiment.add(multi);
        compsToExperiment.add(divide);
        
        pane.add(compsToExperiment, BorderLayout.NORTH);
        pane.add(new JSeparator(), BorderLayout.CENTER);
        pane.add(controls, BorderLayout.SOUTH);
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
    		if (e.getSource() == point) {
    			td.setText(td.getText() + ".");
    		}
    		if (e.getSource() == sum) {
    			a = Double.parseDouble(td.getText());
    			ok = "+";
    			td.setText("");
    		}
    		if (e.getSource() == difference) {
    			a = Double.parseDouble(td.getText());
    			ok = "-";
    			td.setText("");
    		}
    		if (e.getSource() == multi) {
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