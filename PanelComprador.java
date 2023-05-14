package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelComprador extends JPanel implements ActionListener{
    Comprador com=null;
    Expendedor exp = new Expendedor();
    int cualP=0;
    int auxCompra=0;
    Timer timer;
    PanelDepP p;
    Image imageaux;
    protected Moneda mon;
    protected String saldo;
    protected JButton CocaColaBot,SpriteBot,SnickersBot,Super8Bot,ComprarBot,VueltoBot,ComprarAgainBot,ExitButton;
    protected ButtonGroup MonedasBots;
    protected JRadioButton Moneda100Bot,Moneda500Bot,Moneda1000Bot,Moneda1500Bot;
    public PanelComprador(){
        p = new PanelDepP();
        MonedasBots = new ButtonGroup();
        Moneda100Bot = new JRadioButton("Moneda 100");
        Moneda100Bot.setBounds(1000,110,150,75);
        Moneda100Bot.addActionListener(this);
        Moneda100Bot.setFocusable(false);
        Moneda100Bot.setBackground(new Color(205,225,243));
        MonedasBots.add(Moneda100Bot);
        this.add(Moneda100Bot);
        Moneda500Bot = new JRadioButton("Moneda 500");
        Moneda500Bot.setBounds(1000,185,150,75);
        Moneda500Bot.addActionListener(this);
        Moneda500Bot.setFocusable(false);
        Moneda500Bot.setBackground(new Color(205,225,243));
        MonedasBots.add(Moneda500Bot);
        this.add(Moneda500Bot);
        Moneda1000Bot = new JRadioButton("Moneda 1000");
        Moneda1000Bot.setBounds(1000,260,150,75);
        Moneda1000Bot.addActionListener(this);
        Moneda1000Bot.setFocusable(false);
        Moneda1000Bot.setBackground(new Color(205,225,243));
        MonedasBots.add(Moneda1000Bot);
        this.add(Moneda1000Bot);
        Moneda1500Bot = new JRadioButton("Moneda 1500");
        Moneda1500Bot.setBounds(1000,335,150,75);
        Moneda1500Bot.addActionListener(this);
        Moneda1500Bot.setFocusable(false);
        Moneda1500Bot.setBackground(new Color(205,225,243));
        MonedasBots.add(Moneda1500Bot);
        this.add(Moneda1500Bot);

        CocaColaBot = new JButton("CocaCola");
        CocaColaBot.setBounds(650,110,150,150);
        CocaColaBot.addActionListener(this);
        CocaColaBot.setFocusable(false);
        this.add(CocaColaBot);
        SpriteBot = new JButton("Sprite");
        SpriteBot.setBounds(800,110,150,150);
        SpriteBot.addActionListener(this);
        SpriteBot.setFocusable(false);
        this.add(SpriteBot);
        SnickersBot = new JButton("Snickers");
        SnickersBot.setBounds(650,260,150,150);
        SnickersBot.addActionListener(this);
        SnickersBot.setFocusable(false);
        this.add(SnickersBot);
        Super8Bot = new JButton("Super 8");
        Super8Bot.setBounds(800,260,150,150);
        Super8Bot.addActionListener(this);
        Super8Bot.setFocusable(false);
        this.add(Super8Bot);
        ComprarBot = new JButton("Confirmar compra");
        ComprarBot.setBounds(670,440,200,50);
        ComprarBot.addActionListener(this);
        ComprarBot.setFocusable(false);
        this.add(ComprarBot);
        VueltoBot = new JButton("Sacar vuelto");
        VueltoBot.setBounds(920,440,200,50);
        VueltoBot.addActionListener(this);
        VueltoBot.setFocusable(false);
        this.add(VueltoBot);
        ComprarAgainBot = new JButton("Comprar nuevamente");
        ComprarAgainBot.setBounds(670,510,200,50);
        ComprarAgainBot.addActionListener(this);
        ComprarAgainBot.setFocusable(false);
        this.add(ComprarAgainBot);
        ExitButton = new JButton("Salir");
        ExitButton.setBounds(920,510,200,50);
        ExitButton.addActionListener(this);
        ExitButton.setFocusable(false);
        this.add(ExitButton);

        timer = new Timer(1000,null);
        timer.start();
        this.setLayout(null);

        this.setSize(1280,1024);
        this.setBackground(new Color(205,225,243));
        this.setVisible(true);
    }
    public void paint (Graphics g){
        super.paint(g);
        g.setColor(new Color(247, 220, 85));
        g.fillRect(600, 80, 600, 500);
        g.setColor(Color.black);
        g.drawRect(600, 80, 600, 500);
        g.drawRect(999, 109, 151, 301);
        g.drawRect(649, 109, 301, 301);
        g.setColor(new Color(247, 220, 85));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (auxCompra==0){
            int x=0;
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
                cualP = 1;
                System.out.println("Coca");
                auxCompra=1;
            }else if (e.getSource()==SpriteBot){
                cualP = 2;
                System.out.println("Sprite");
                auxCompra=1;
            }else if (e.getSource()==SnickersBot){
                cualP = 3;
                System.out.println("Snickers");
                auxCompra=1;
            }else if (e.getSource()==Super8Bot){
                cualP = 4;
                System.out.println("Super 8");
                auxCompra=1;
            }
        }else{
            if (e.getSource()==ComprarBot){
                try {
                    com = new Comprador(mon,cualP,exp);
                } catch (PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoInsuficienteException ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println(com.queConsumio()+" $"+com.cuantoVuelto());
                switch (cualP){
                    case 1:  imageaux = p.coca;getGraphics().drawImage(imageaux,105,530,null); break;
                    case 2:  imageaux = p.sprite;getGraphics().drawImage(imageaux,90,530,null); break;
                    case 3:  imageaux = p.snickers;getGraphics().drawImage(imageaux,105,530,null); break;
                    case 4:  imageaux = p.super8;getGraphics().drawImage(imageaux,100,490,null); break;
                    default: break;
                }
            }
            if (e.getSource()==ComprarAgainBot){
                auxCompra=0;

            }
        }
        if (e.getSource()==VueltoBot){
            int Vuelto = 0;
            Vuelto = Vuelto + com.cuantoVuelto();

        }
        if (e.getSource()==ExitButton){
            System.exit(0);
        }

    }
}
