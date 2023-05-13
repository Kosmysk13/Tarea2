package org.example;

import javax.swing.*;
import java.awt.*;
public class PanelExpendedor extends JPanel{
    protected PanelDepB pdb;
    protected int[] Xs= {381,381,420,420};
    protected int[] Ys= {80,580,540,120};

    Image cocalogo;
    Image spritelogo;
    Image snickerslogo;
    Image super8logo;
    public PanelExpendedor(){
        pdb = new PanelDepB();
        cocalogo = new ImageIcon("cocalogo1.png").getImage();
        spritelogo = new ImageIcon("spritelogo.png").getImage();
        snickerslogo = new ImageIcon("snickerslogo.png").getImage();
        super8logo = new ImageIcon("super8logo.png").getImage();
    }
    public void paint (Graphics g){
        super.paint(g);
        g.setColor(new Color(137,23,11));
        g.fillRect(80, 80, 300, 500);                               //Expendedor
        g.setColor(Color.black);
        g.drawRect(80, 80, 300, 500);                               //Borde del expendedor
        g.setColor(new Color(80,23,11));
        g.fillPolygon(Xs,Ys,4);
        g.setColor(Color.black);
        g.drawPolygon(Xs,Ys,4);
        g.setColor(new Color (199,219,219));
        g.fillRect(93, 93, 220, 400);                               //"Vidrio"
        g.setColor(Color.black);
        g.drawRect(93, 93, 220, 400);
        g.setColor(Color.white);
        g.fillRect(330, 200, 30, 20);                                //Entrada moneda
        g.setColor(Color.black);
        g.drawRect(330, 200, 30, 20);
        g.setColor(Color.white);
        g.fillRect(330, 465, 30, 20);                                //Salida moneda
        g.setColor(Color.black);
        g.drawRect(330, 465, 30, 20);
        g.setColor(Color.white);
        g.fillRect(93, 520, 90, 30);                                 //Entrega de Producto
        g.setColor(Color.black);
        g.drawRect(93, 520, 90, 30);
        g.setColor(Color.white);
        g.fillRect(316,230,60,160);
        g.drawImage(cocalogo,319,232,null);
        g.drawImage(spritelogo,319,272,null);
        g.drawImage(snickerslogo,319,312,null);
        g.setColor(Color.black);
        g.fillRect(316,350,60,40);
        g.drawImage(super8logo,319,352,null);
        g.drawRect(316,230,60,160);
        g.drawLine(316,270,376,270);
        g.drawLine(316,310,376,310);
        g.drawLine(316,350,376,350);
        pdb.paint(g);
    }
}
