package org.example;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ventana extends JFrame{
    private PanelPrincipal dp;
    public Ventana(){
        super("Mi Expendedor");
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(171, 235, 198 ));
        dp = new PanelPrincipal();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(dp);                        //BOTONES
        this.setSize(1280,1024);
        setLocationRelativeTo(null);            //Ventana se inicia centrada
        this.setVisible(true);
    }
}