package org.example;
import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;

    public PanelPrincipal(){
        com = new PanelComprador();
        exp = new PanelExpendedor();
        this.setSize(1000,800);
        this.setBackground(new Color(205,225,243));

    }
    public void paint (Graphics g){
        super.paint(g);
        //com.paint(g);
        exp.paint(g);


        /*g.setColor(Color.red);
        g.fillOval(100,100,100,100);
        g.drawLine(30,30,200,200);*/
    }
}
