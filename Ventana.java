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
        dp = new PanelPrincipal();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(dp,BorderLayout.CENTER);
        bp = new PanelBotones();
        this.add(bp);
        /*dp.setLayout(new GridLayout(3,2));
        JButton rB1 = new JButton("1");
        dp.add(rB1);
        dp.add(new JToggleButton("2"));
        dp.add(new JButton("3"));
        dp.add(new JCheckBox("4"));
        dp.add(new JButton("5"));
        dp.add(new JRadioButton("6"));*/
        this.setSize(1000,800);
        setLocationRelativeTo(null);            //Ventana se inicia centrada
        this.setVisible(true);
    }
}