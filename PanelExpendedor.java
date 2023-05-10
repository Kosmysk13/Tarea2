package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.jar.JarEntry;

public class PanelExpendedor extends JPanel{
    public PanelExpendedor(){

    }
    public void paint (Graphics g){
        super.paint(g);
        g.setColor(new Color(137,23,11));
        g.fillRect(80, 80, 300, 500);
        //g.setColor(Color.lightGray);
        g.setColor(new Color (199,219,219));
        g.fillRect(93, 93, 220, 400);                               //Vidrio
        g.setColor(Color.white);
        g.fillRect(332, 200, 30, 5);                                //Entrada moneda
        g.fillRect(332, 480, 30, 5);                                //Salida moneda
        g.fillRect(93, 520, 70, 30);                                //Entrega de Producto
    }
}
