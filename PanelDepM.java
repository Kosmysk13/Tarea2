package org.example;

import javax.swing.*;
import java.awt.*;
public class PanelDepM extends JPanel{
    Moneda moneda;
    int xposm,xposmv,yposm,yposmv,numaux;
    public PanelDepM(){
        xposmv=670;
        xposm=670;
        yposm=150;
        yposmv=350;
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.white);
    }
    public void addMon (Moneda mon,int num){
        if (xposm==945){
            xposm=670;
            yposm+=25;
        }
        if (xposmv==945){
            xposmv=670;
            yposmv-=25;
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
                g.fillOval(xposmv, yposmv, 15, 15);
                g.setColor(Color.black);
                g.drawOval(xposmv-1, yposmv-1, 16, 16);
                xposmv+=25;
            }else if (moneda.getValor()==1000){
                g.setColor(new Color(111,137,175));
                g.fillOval(xposmv, yposmv, 15, 15);
                g.setColor(Color.black);
                g.drawOval(xposmv-1, yposmv-1, 16, 16);
                xposmv+=25;
            }
        }


    }

}
