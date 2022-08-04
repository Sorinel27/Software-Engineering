import java.applet.Applet;
import java.awt.*;
import java.util.Scanner;

public class AppletClass extends Applet {

	private static final long serialVersionUID = 1L;

	String name;
	String group;

	@Override
	public void init() {
		getData();
	}

	public void paint(Graphics g) {
		g.drawRect(0, 0, getSize().width - 1, getSize().height - 1);
		g.setColor(Color.blue);
		g.drawString("Hello " + name + " from group " + group, (getSize().width) / 2, (getSize().height - 1) / 2);
	}

	public void getData() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		this.name = scanner.next();

		System.out.print("Enter your group: ");
		this.group = scanner.next();
		scanner.close();

	}

}