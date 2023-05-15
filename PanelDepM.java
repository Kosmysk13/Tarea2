package org.example;

import javax.swing.*;
import java.awt.*;
public class PanelDepM extends JPanel{
    Moneda moneda;
    int xposm,yposm,numaux;
    public PanelDepM(){
        xposm=670;
        yposm=150;
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.white);
    }
    public void addMon (Moneda mon,int num){
        if (xposm==945){
            xposm=670;
            yposm+=25;
        }
        numaux = num;
        moneda = mon;
    }
    public void paint (Graphics g){
        if (numaux==1){
            if (moneda.getValor()==500){
                g.setColor(Color.yellow);
                g.fillOval(xposm, yposm, 15, 15);
                g.setColor(Color.black);
                g.drawOval(xposm-1, yposm-1, 16, 16);
                xposm+=25;
            }else if (moneda.getValor()==1000){
                g.setColor(new Color(111,137,175));
                g.fillOval(xposm, yposm, 15, 15);
                g.setColor(Color.black);
                g.drawOval(xposm-1, yposm-1, 16, 16);
                xposm+=25;
            }else if (moneda.getValor()==1500){
                g.setColor(new Color(200,100,0));
                g.fillOval(xposm, yposm, 15, 15);
                g.setColor(Color.black);
                g.drawOval(xposm-1, yposm-1, 16, 16);
                xposm+=25;
            }
        }else if (numaux==2){
            if (moneda.getValor()==500){
                g.setColor(Color.yellow);
                g.fillOval(xposm, yposm, 15, 15);
                g.setColor(Color.black);
                g.drawOval(xposm-1, yposm-1, 16, 16);
                xposm+=25;
            }else if (moneda.getValor()==1000){
                g.setColor(new Color(111,137,175));
                g.fillOval(xposm, yposm, 15, 15);
                g.setColor(Color.black);
                g.drawOval(xposm-1, yposm-1, 16, 16);
                xposm+=25;
            }
        }


    }

}
