package org.example;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ventana extends JFrame{
    private PanelPrincipal dp;
    private PanelBotones bp;
    public Ventana(){
        super("Mi Expendedor");
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(205,225,243));
        dp = new PanelPrincipal();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(dp,BorderLayout.CENTER);
        bp = new PanelBotones();                          //BOTONES
        this.add(bp);                                     //BOTONES
        this.setSize(1280,1024);
        setLocationRelativeTo(null);            //Ventana se inicia centrada
        this.setVisible(true);
    }
}