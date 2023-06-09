package org.example;

import javax.swing.*;
import java.awt.*;

/**
 * Crea panel que contiene los productos dentro del Expendedor
 */

public class PanelDepP extends JPanel{
    int xExp,yExp;
    int[][] y=new int[4][3];
    int[][] x=new int[4][3];
    Image coca;
    Image sprite;
    Image snickers;
    Image super8;
    int auxinicial=0,auxj=1;
    Timer timer;

    /**
     * Metodo constructor que se encarga de definir las posiciones iniciales, las variables y el timer
     * Ademas define los limites del panel
     * @param xExp Este parametro ayuda a definir las posiciones relativas del expendedor en el eje X
     * @param yExp Este parametro ayuda a definir las posiciones relativas del expendedor en el eje Y
     */
    public PanelDepP(int xExp, int yExp){
        this.xExp=xExp+13;
        this.yExp=yExp+13;

        timer = new Timer(1000,null);
        timer.start();
        if (auxinicial==0){
            for(int i=0;i<3;i++){
                y[0][i]=this.yExp;
                y[1][i]=195;
                y[2][i]=295;
                y[3][i]=344;
                x[0][i]=72*auxj;
                x[1][i]=78*auxj;
                x[3][i]=55*auxj;
                auxj++;
            }
            x[2][0]=this.xExp;
            x[2][1]=156;
            x[2][2]=220;
            auxinicial=1;
        }

        coca = new ImageIcon("cocalata.png").getImage();
        sprite = new ImageIcon("spritelata.png").getImage();
        snickers = new ImageIcon("snickers.png").getImage();
        super8 = new ImageIcon("super8.png").getImage();

        this.setSize(1280,1024);
        this.setBackground(null);
        this.setVisible(true);
    }

    /**
     * Metodo que se encarga de mover un producto dentro del panel
     * @param cualP Parametro que ayuda a elegir que producto se debe mover dentro del panel
     * @param cont  Parametro contador que indica cuantas veces se ha retirado un producto, ayuda a mover el producto correcto
     */
    public void mover(int cualP,int cont) {
        x[cualP][cont]=96;
        y[cualP][cont]=540;
        repaint();
        timer.stop();
    }

    /**
     * Metodo que se encarga de la representacion visual del panel
     * @param g  the <code>Graphics</code> context in which to paint
     */
    public void paint (Graphics g){
        g.setColor(new Color (199,219,219));
        g.fillRect(xExp, yExp, 220, 400);
        g.setColor(Color.black);
        g.drawRect(xExp, yExp, 220, 400);
        for(int i=0;i<3;i++){
            g.drawImage(coca,x[0][i],y[0][i],null);
            g.drawImage(sprite,x[1][i],y[1][i],null);
            g.drawImage(snickers,x[2][i],y[2][i],null);
            g.drawImage(super8,x[3][i],y[3][i],null);
        }
    }
}
