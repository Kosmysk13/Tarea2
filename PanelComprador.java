package org.example;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    public PanelComprador(){
    }
    public void paint (Graphics g){
        super.paint(g);
        g.setColor(new Color(243,228,35));
        g.fillRect(600, 80, 400, 500);
        g.setColor(Color.black);
        g.drawRect(600, 80, 400, 500);
    }
}
