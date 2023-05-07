package org.example;

import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel{
    public PanelExpendedor(){

    }
    public void paint (Graphics g){
        super.paint(g);
        g.fillOval(100,100,100,100);
        g.drawLine(30,30,200,200);
    }
}
