package org.example;

import javax.swing.*;
import java.awt.*;
public class PanelExpendedor extends JPanel{
    protected PanelDepP pdp;
    protected int[] Xs= {381,381,420,420};
    protected int[] Ys= {80,660,620,120};
    protected int xExp=80,yExp=80;
    public PanelExpendedor(){
        pdp = new PanelDepP(xExp,yExp);
    }
    public void paint (Graphics g){
        super.paint(g);
        g.setColor(new Color(137,23,11));
        g.fillRect(xExp, yExp, 300, 580);                               //Expendedor
        g.setColor(Color.black);
        g.drawRect(xExp, yExp, 300, 580);                               //Borde del expendedor
        g.setColor(new Color(80,23,11));
        g.fillPolygon(Xs,Ys,4);
        g.setColor(Color.black);
        g.drawPolygon(Xs,Ys,4);
        g.setColor(new Color(171, 178, 185));
        g.fillRect(330, 200, 30, 20);                                //Entrada moneda
        g.setColor(Color.black);
        g.drawRect(330, 200, 30, 20);
        g.setColor(new Color(171, 178, 185));
        g.fillRect(330, 465, 30, 20);                                //Salida moneda
        g.setColor(Color.black);
        g.drawRect(330, 465, 30, 20);
        g.setColor(new Color(171, 178, 185));
        g.fillRect(93, 520, 150, 130);                                 //Entrega de Producto
        g.setColor(Color.black);
        g.drawRect(93, 520, 150, 130);
        g.setColor(Color.white);
        g.drawRect(316,230,60,160);
        g.drawLine(316,270,376,270);
        g.drawLine(316,310,376,310);
        g.drawLine(316,350,376,350);
        pdp.paint(g);
    }
}
