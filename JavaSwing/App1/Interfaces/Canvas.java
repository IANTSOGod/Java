package Interfaces;

//Bibliotheques de dessin d'image
/*
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
*/

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Canvas extends JPanel{
  public void paintComponent(Graphics g){
    Font font=new Font("Courier",Font.BOLD,20);
    g.setFont(font);
    g.setColor(Color.RED);
    g.drawString("Hello World",this.getWidth()/3,20);
    
    //upload image
    
    /*
    try{
      Image img=ImageIO.read(new File("galleryImage.jpg"));
      g.drawImage(img,0,0,this);
    }
    catch(IOException e){
      e.printStackTrace();
    }
    */
    
  }
}
