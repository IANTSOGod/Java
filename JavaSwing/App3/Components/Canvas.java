package Components;
import java.awt.*;
import javax.swing.*;
public class Canvas extends JPanel{
    public String text=""; 
    public void setText(String txt){
      this.text+=txt;
    }
    @Override
    public void paintComponent(Graphics g){
      Font font=new Font("Courier",Font.BOLD,20);
      g.setFont(font);
      g.setColor(Color.RED);
      g.drawString(this.text,this.getWidth()/3,this.getHeight()/2);
  }  
}
