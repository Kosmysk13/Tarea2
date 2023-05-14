package org.example;

import javax.swing.*;
import java.awt.*;
public class PanelDepP extends JPanel{
    //int x=72;
    int y=95;
    Image coca;
    Image sprite;
    Image snickers;
    Image super8;
    public PanelDepP(){
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.black);
        coca = new ImageIcon("cocalata.png").getImage();
        sprite = new ImageIcon("spritelata.png").getImage();
        snickers = new ImageIcon("snickers.png").getImage();
        super8 = new ImageIcon("super8.png").getImage();
    }
    public void paint (Graphics g){
        super.paint(g);
        g.drawImage(coca,72,y,null);
        g.drawImage(coca,147,y,null);
        g.drawImage(coca,222,y,null);
        g.drawImage(sprite,78,100+y,null);
        g.drawImage(sprite,153,100+y,null);
        g.drawImage(sprite,228,100+y,null);
        g.drawImage(snickers,93,200+y,null);
        g.drawImage(snickers,158,200+y,null);
        g.drawImage(snickers,223,200+y,null);
        g.drawImage(super8,55,249+y,null);
        g.drawImage(super8,115,249+y,null);
        g.drawImage(super8,172,249+y,null);
    }
}
