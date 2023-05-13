package org.example;

import javax.swing.*;
import java.awt.*;

public class PanelDepP extends JPanel{
    int posX;
    int posY;
    Timer timer;
    Image coca;
    Image sprite;
    Image snickers;
    Image super8;
    int xVel=1;
    int yVel=1;
    int x=0;
    int y=0;
    public PanelDepP(){
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.black);
        coca = new ImageIcon("cocalata.png").getImage();
        sprite = new ImageIcon("spritelata.png").getImage();
        snickers = new ImageIcon("snickers.png").getImage();
        super8 = new ImageIcon("super8.png").getImage();
        timer = new Timer(5000,null);
    }
    public void paint (Graphics g){
        //super.paint(g);
        g.drawImage(coca,72,95,null);
        g.drawImage(coca,147,95,null);
        g.drawImage(coca,222,95,null);
        g.drawImage(sprite,78,195,null);
        g.drawImage(sprite,153,195,null);
        g.drawImage(sprite,228,195,null);
        g.drawImage(snickers,93,295,null);
        g.drawImage(snickers,158,295,null);
        g.drawImage(snickers,223,295,null);
        g.drawImage(super8,55,344,null);
        g.drawImage(super8,115,344,null);
        g.drawImage(super8,172,344,null);
    }
}
