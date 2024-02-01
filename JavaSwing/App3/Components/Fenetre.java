package Components;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Fenetre extends JFrame{
  public Fenetre(){
    Dimension dim=new Dimension(600,600);
    Font font=new Font("Courier",Font.BOLD,20);
    JTextField f1=new JTextField();
    f1.setFont(font);
    JTextField f2=new JTextField();
    f2.setFont(font);
    JTextField f3=new JTextField();
    f3.setFont(font);
    JPanel pane=new JPanel();
    pane.setLayout(new GridLayout(1,2));
    JButton s1=new JButton("Submit");
    s1.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
           int a,b,c;
           	    String res;
           Fenetre.this.setVisible(false);
           a=Integer.valueOf(f1.getText()).intValue();
           b=Integer.valueOf(f2.getText()).intValue();
           c=Integer.valueOf(f3.getText()).intValue();
           Equation2 equ=new Equation2();
           equ.setA(a);
           equ.setB(b);
           equ.setC(c);
           equ.calcDelta();
           equ.resolve();
           dispose();
           res=equ.getResults();
      	 JFrame fr=new JFrame();
    	JLabel lab=new JLabel(res);
      	fr.setTitle("Formulaiire d'equation");
    	fr.setSize(600,600);
    	fr.setResizable(true);
    	fr.setLocationRelativeTo(null);
    	fr.add(lab);
      	fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	fr.setVisible(true);
      }
    }
    );
    JButton s2=new JButton("Reset");
    s2.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        f1.setText("");
        f2.setText("");
        f3.setText("");
      }
    }
    );
    pane.add(s1);
    pane.add(s2);
    JPanel pane1=new JPanel();
    Canvas can1=new Canvas();
    can1.setText("Entrez a :");
    Canvas can2=new Canvas();
    can2.setText("Entrez b:");
    Canvas can3=new Canvas();
    can3.setText("Entrez c:");
    this.setTitle("Formulaiire d'equation");
    this.setSize(dim);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setLayout(new GridLayout(7,1));
    this.add(can1);
    this.add(f1);
    this.add(can2);
    this.add(f2);
    this.add(can3);
    this.add(f3);
    this.add(pane);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }
}

