package Components;
import javax.swing.*;
import java.awt.*;
public class Fenetre extends JFrame{
	public Fenetre(){
		this.setTitle("Ma premiere fenetre Java");
		this.setLocationRelativeTo(null);
		this.setSize(400,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		JPanel pane=new JPanel();
		this.add(pane);
		JButton btn=new JButton("Cliquez-moi");
		pane.add(btn);
	}

}

