package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelBotones extends JPanel implements ActionListener,MouseListener{
    int auxCompra=0;
    JButton CocaColaBot;
    JButton SpriteBot;
    JButton SnickersBot;
    JButton Super8Bot;
    JButton ComprarAgainBot;
    ButtonGroup MonedasBots;
    JRadioButton Moneda100Bot;
    JRadioButton Moneda500Bot;
    JRadioButton Moneda1000Bot;
    JRadioButton Moneda1500Bot;
    public PanelBotones(){
        MonedasBots = new ButtonGroup();
        Moneda100Bot = new JRadioButton("Moneda 100");
        Moneda100Bot.setBounds(400,150,125,50);
        Moneda100Bot.addActionListener(this);
        MonedasBots.add(Moneda100Bot);
        this.add(Moneda100Bot);
        Moneda500Bot = new JRadioButton("Moneda 500");
        Moneda500Bot.setBounds(525,150,125,50);
        Moneda500Bot.addActionListener(this);
        MonedasBots.add(Moneda500Bot);
        this.add(Moneda500Bot);
        Moneda1000Bot = new JRadioButton("Moneda 1000");
        Moneda1000Bot.setBounds(650,150,125,50);
        Moneda1000Bot.addActionListener(this);
        MonedasBots.add(Moneda1000Bot);
        this.add(Moneda1000Bot);
        Moneda1500Bot = new JRadioButton("Moneda 1500");
        Moneda1500Bot.setBounds(775,150,125,50);
        Moneda1500Bot.addActionListener(this);
        MonedasBots.add(Moneda1500Bot);
        this.add(Moneda1500Bot);
        CocaColaBot = new JButton("CocaCola");
        CocaColaBot.setBounds(400,200,250,50);
        CocaColaBot.addActionListener(this);
        CocaColaBot.setFocusable(false);
        this.add(CocaColaBot);
        SpriteBot = new JButton("Sprite");
        SpriteBot.setBounds(650,200,250,50);
        SpriteBot.addActionListener(this);
        SpriteBot.setFocusable(false);
        this.add(SpriteBot);
        SnickersBot = new JButton("Snickers");
        SnickersBot.setBounds(400,250,250,50);
        SnickersBot.addActionListener(this);
        SnickersBot.setFocusable(false);
        this.add(SnickersBot);
        Super8Bot = new JButton("Super 8");
        Super8Bot.setBounds(650,250,250,50);
        Super8Bot.addActionListener(this);
        Super8Bot.setFocusable(false);
        this.add(Super8Bot);
        ComprarAgainBot = new JButton("Comprar nuevamente");
        ComprarAgainBot.setBounds(650,520,250,50);
        ComprarAgainBot.addActionListener(this);
        ComprarAgainBot.setFocusable(false);
        this.add(ComprarAgainBot);

        this.setLayout(null);

        this.setSize(800,600);
        this.setBackground(new Color(199,219,250));
    }
    public void paint (Graphics g){
        super.paint(g);
    }
    @Override
    public void actionPerformed(ActionEvent e){
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
            }else{
            }
        }else{
            if (e.getSource()==ComprarAgainBot){
                auxCompra=0;
            }
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
