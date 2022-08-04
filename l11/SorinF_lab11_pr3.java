//lab 11 problema 3 Fratean Sorin, grupa 2022
import java.awt.*;
import javax.swing.*;


class MyDrawing extends JPanel {
	private static final long serialVersionUID = 1L;
	@Override 
    public void paintComponent(Graphics g) {
         super.paintComponent(g);
         g.drawLine(0, 0, 500, 200);
    }
}

public class clasaTest{
    	final static String tab1Panel = "Drawing area";
    	final static String tab2Panel = "Font, size and color";
    	final static String tab3Panel = "Geomatrical shape";
    	final static int extraWindowWidth = 100;
    	
    
	
   	public void addComponentToPane(Container pane) {
        	JTabbedPane tabbedPane = new JTabbedPane();

        	JPanel tab1 = new JPanel();
        	
        	MyDrawing drawing = new MyDrawing();

        	tab1.add(drawing);

        	JPanel tab2 = new JPanel();
        	tab2.add(new JTextField("Font type", 20));
        	tab2.add(new JTextField("Size", 20));
        	tab2.add(new JTextField("Color", 20));
        	
        	JPanel tab3 = new JPanel();
        	
        	tab3.add(new JTextField("Geometrical shape", 20));
        	tab3.add(new JTextField("Size / radius", 20));

        	tabbedPane.addTab(tab1Panel, tab1);
        	tabbedPane.addTab(tab2Panel, tab2);
        	tabbedPane.addTab(tab3Panel, tab3);

        	pane.add(tabbedPane, BorderLayout.CENTER);
    	}

    
    	private static void createAndShowGUI() {
        
        	JFrame frame = new JFrame("TabbedView");
        	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        	clasaTest demo = new clasaTest();
        	demo.addComponentToPane(frame.getContentPane());

       
        	frame.pack();
        	frame.setVisible(true);
    	}

    	public static void main(String[] args) {
        
		try {
            		UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        	} 
		catch (UnsupportedLookAndFeelException ex) {
            		ex.printStackTrace();
        	} 
		catch (IllegalAccessException ex) {
            		ex.printStackTrace();
        	} 
		catch (InstantiationException ex) {
            		ex.printStackTrace();
        	} 
		catch (ClassNotFoundException ex) {
            		ex.printStackTrace();
        	}
            createAndShowGUI();
            
    	}
}
