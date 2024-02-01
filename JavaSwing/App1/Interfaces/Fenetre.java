package Interfaces;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Fenetre extends JFrame{
  
  public Fenetre(){
    this.setTitle("Ma première fenetre java");
    this.setSize(400,500);
    this.setResizable(true);
    this.setLocationRelativeTo(null);
    
    //body
      this.setContentPane(new Canvas());
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }
}
