package org.example;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ventana extends JFrame{
    private PanelPrincipal dp;
    public Ventana(){
        super("Mi Ventana");
        this.setLayout(new BorderLayout());
        dp = new PanelPrincipal();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(dp,BorderLayout.CENTER);
        this.setSize(1000,800);
        setLocationRelativeTo(null);            //Ventana se inicia centrada
        this.setVisible(true);
    }
}