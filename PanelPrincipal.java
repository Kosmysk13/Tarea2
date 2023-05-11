package org.example;
import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;

    public PanelPrincipal(){
        com = new PanelComprador();
        exp = new PanelExpendedor();
        this.setSize(1280,1024);
        this.setBackground(new Color(205,225,243));
    }
    public void paint (Graphics g){
        super.paint(g);
        com.paint(g);
        exp.paint(g);
    }
}
