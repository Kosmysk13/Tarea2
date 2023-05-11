package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelBotones extends JPanel implements ActionListener,MouseListener{
    int auxCompra=0;
    Moneda mon;
    JButton CocaColaBot;
    JButton SpriteBot;
    JButton SnickersBot;
    JButton Super8Bot;
    JButton ComprarAgainBot;
    JButton ExitButton;
    ButtonGroup MonedasBots;
    JRadioButton Moneda100Bot;
    JRadioButton Moneda500Bot;
    JRadioButton Moneda1000Bot;
    JRadioButton Moneda1500Bot;
    protected PanelDepB pb;
    public PanelBotones(){
        MonedasBots = new ButtonGroup();
        pb = new PanelDepB();
        Moneda100Bot = new JRadioButton("Moneda 100");
        Moneda100Bot.setBounds(625,150,125,50);
        Moneda100Bot.addActionListener(this);
        Moneda100Bot.setFocusable(false);
        Moneda100Bot.setBackground(new Color(205,225,243));
        MonedasBots.add(Moneda100Bot);
        this.add(Moneda100Bot);
        Moneda500Bot = new JRadioButton("Moneda 500");
        Moneda500Bot.setBounds(750,150,125,50);
        Moneda500Bot.addActionListener(this);
        Moneda500Bot.setFocusable(false);
        Moneda500Bot.setBackground(new Color(205,225,243));
        MonedasBots.add(Moneda500Bot);
        this.add(Moneda500Bot);
        Moneda1000Bot = new JRadioButton("Moneda 1000");
        Moneda1000Bot.setBounds(875,150,125,50);
        Moneda1000Bot.addActionListener(this);
        Moneda1000Bot.setFocusable(false);
        Moneda1000Bot.setBackground(new Color(205,225,243));
        MonedasBots.add(Moneda1000Bot);
        this.add(Moneda1000Bot);
        Moneda1500Bot = new JRadioButton("Moneda 1500");
        Moneda1500Bot.setBounds(1000,150,125,50);
        Moneda1500Bot.addActionListener(this);
        Moneda1500Bot.setFocusable(false);
        Moneda1500Bot.setBackground(new Color(205,225,243));
        MonedasBots.add(Moneda1500Bot);
        this.add(Moneda1500Bot);
        CocaColaBot = new JButton("CocaCola");
        CocaColaBot.setBounds(625,200,250,50);
        CocaColaBot.addActionListener(this);
        CocaColaBot.setFocusable(false);
        this.add(CocaColaBot);
        SpriteBot = new JButton("Sprite");
        SpriteBot.setBounds(875,200,250,50);
        SpriteBot.addActionListener(this);
        SpriteBot.setFocusable(false);
        this.add(SpriteBot);
        SnickersBot = new JButton("Snickers");
        SnickersBot.setBounds(625,250,250,50);
        SnickersBot.addActionListener(this);
        SnickersBot.setFocusable(false);
        this.add(SnickersBot);
        Super8Bot = new JButton("Super 8");
        Super8Bot.setBounds(875,250,250,50);
        Super8Bot.addActionListener(this);
        Super8Bot.setFocusable(false);
        this.add(Super8Bot);
        ComprarAgainBot = new JButton("Comprar nuevamente");
        ComprarAgainBot.setBounds(650,430,200,50);
        ComprarAgainBot.addActionListener(this);
        ComprarAgainBot.setFocusable(false);
        this.add(ComprarAgainBot);
        ExitButton = new JButton("Salir");
        ExitButton.setBounds(950,430,100,50);
        ExitButton.addActionListener(this);
        this.add(ExitButton);

        this.setLayout(null);

        this.setSize(800,600);
        this.setBackground(new Color(205,225,243));
        this.setVisible(true);
    }
    public void paint (Graphics g){
        super.paint(g);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (auxCompra==0){
            if (e.getSource()==Moneda100Bot){
                mon = new Moneda100();
            }else if (e.getSource()==Moneda500Bot){
                mon = new Moneda500();
            }else if (e.getSource()==Moneda1000Bot){
                mon = new Moneda1000();
            }else if (e.getSource()==Moneda1500Bot){
                mon = new Moneda1500();
            }
        }
        if (auxCompra==0){
            if (e.getSource()==CocaColaBot){
                System.out.println("Coca");
                auxCompra=1;
            }else if (e.getSource()==SpriteBot){
                System.out.println("Sprite");
                auxCompra=1;
            }else if (e.getSource()==SnickersBot){
                System.out.println("Snickers");
                auxCompra=1;
            }else if (e.getSource()==Super8Bot){
                System.out.println("Super 8");
                auxCompra=1;
            }
        }else{
            if (e.getSource()==ComprarAgainBot){
                auxCompra=0;
            }
        }
        if (e.getSource()==ExitButton){
            System.exit(0);
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
