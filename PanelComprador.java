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
    int cont[]={0,0,0,0};
    int auxCompra=0;
    Timer timer;
    PanelDepP pdp;
    PanelDepM pdm;
    Image imageaux;
    ImageIcon Mon500,Mon1000,Mon1500;
    protected Moneda mon,monaux,monvu;
    protected int saldo,vuelto;
    protected JButton CocaColaBot,SpriteBot,SnickersBot,Super8Bot,ComprarBot,AgregaMonBot,VueltoBot,ComprarAgainBot,ExitButton;
    protected JButton Moneda500Bot,Moneda1000Bot,Moneda1500Bot;
    JRadioButton MonedaPago;
    int xposm,xposmv,yposm,yposmv;
    public PanelComprador(){
        pdp = new PanelDepP();
        pdm = new PanelDepM();
        xposmv=670;
        xposm=670;
        yposm=150;
        yposmv=350;

        Mon500 = new ImageIcon("Moneda500.png");
        Mon1000 = new ImageIcon("Moneda1000.png");
        Mon1500 = new ImageIcon("Moneda1500.png");

        Moneda500Bot = new JButton("Moneda 500");
        Moneda500Bot.setBounds(1000,110,150,75);
        Moneda500Bot.addActionListener(this);
        Moneda500Bot.setFocusable(false);
        Moneda500Bot.setBackground(new Color(205,225,243));
        this.add(Moneda500Bot);
        Moneda1000Bot = new JButton("Moneda 1000");
        Moneda1000Bot.setBounds(1000,185,150,75);
        Moneda1000Bot.addActionListener(this);
        Moneda1000Bot.setFocusable(false);
        Moneda1000Bot.setBackground(new Color(205,225,243));
        this.add(Moneda1000Bot);
        Moneda1500Bot = new JButton("Moneda 1500");
        Moneda1500Bot.setBounds(1000,260,150,75);
        Moneda1500Bot.addActionListener(this);
        Moneda1500Bot.setFocusable(false);
        Moneda1500Bot.setBackground(new Color(205,225,243));
        this.add(Moneda1500Bot);

        CocaColaBot = new JButton();
        CocaColaBot.setBounds(316,230,60,40);
        CocaColaBot.addActionListener(this);
        CocaColaBot.setFocusable(false);
        CocaColaBot.setIcon(new ImageIcon("cocalogo1.png"));
        this.add(CocaColaBot);
        SpriteBot = new JButton();
        SpriteBot.setBounds(316,270,60,40);
        SpriteBot.addActionListener(this);
        SpriteBot.setFocusable(false);
        SpriteBot.setIcon(new ImageIcon("spritelogo.png"));
        this.add(SpriteBot);
        SnickersBot = new JButton();
        SnickersBot.setBounds(316,310,60,40);
        SnickersBot.addActionListener(this);
        SnickersBot.setFocusable(false);
        SnickersBot.setIcon(new ImageIcon("snickerslogo.png"));
        this.add(SnickersBot);
        Super8Bot = new JButton();
        Super8Bot.setBounds(316,350,60,40);
        Super8Bot.addActionListener(this);
        Super8Bot.setFocusable(false);
        Super8Bot.setIcon(new ImageIcon("super8logo.png"));
        this.add(Super8Bot);
        AgregaMonBot = new JButton();
        AgregaMonBot.setBounds(330, 200, 30, 20);
        AgregaMonBot.addActionListener(this);
        AgregaMonBot.setFocusable(false);
        this.add(AgregaMonBot);
        VueltoBot = new JButton();
        VueltoBot.setBounds(330, 465, 30, 20);
        VueltoBot.addActionListener(this);
        VueltoBot.setFocusable(false);
        this.add(VueltoBot);
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
        g.drawRect(999, 109, 151, 226);
        g.drawRect(649, 109, 301, 301);
        g.setColor(new Color(247, 220, 85));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (auxCompra==0){
            if (e.getSource()==Moneda500Bot){
                monaux = new Moneda500();
                //pdm.addMon(monaux,1);
                //pdm.paint(getGraphics());
                MonedaPago = new JRadioButton();
                MonedaPago.setBounds(xposm,yposm,35,35);
                MonedaPago.setIcon(Mon500);
                MonedaPago.addActionListener(this);
                MonedaPago.setFocusable(false);
                MonedaPago.setBackground(new Color(247, 220, 85));
                this.add(MonedaPago);
                xposm+=35;
            }else if (e.getSource()==Moneda1000Bot){
                monaux = new Moneda1000();
                //pdm.addMon(monaux,1);
                //pdm.paint(getGraphics());
                MonedaPago = new JRadioButton();
                MonedaPago.setBounds(xposm,yposm,35,35);
                MonedaPago.setIcon(Mon1000);
                MonedaPago.addActionListener(this);
                MonedaPago.setFocusable(false);
                MonedaPago.setBackground(new Color(247, 220, 85));
                this.add(MonedaPago);
                xposm+=35;
            }else if (e.getSource()==Moneda1500Bot){
                monaux = new Moneda1500();
                //pdm.addMon(monaux,1);
                //pdm.paint(getGraphics());
                MonedaPago = new JRadioButton();
                MonedaPago.setBounds(xposm,yposm,35,35);
                MonedaPago.setIcon(Mon1500);
                MonedaPago.addActionListener(this);
                MonedaPago.setFocusable(false);
                MonedaPago.setBackground(new Color(247, 220, 85));
                this.add(MonedaPago);
                xposm+=35;
            }
        }
        if (e.getSource()==AgregaMonBot){
            System.out.println("Se agrega moneda: " + monaux.getSerie());
            mon = monaux;
        }
        if (auxCompra==0&&mon!=null){
            if (e.getSource()==CocaColaBot){
                cualP = 1;
                auxCompra=1;
            }else if (e.getSource()==SpriteBot){
                cualP = 2;
                auxCompra=1;
            }else if (e.getSource()==SnickersBot){
                cualP = 3;
                auxCompra=1;
            }else if (e.getSource()==Super8Bot){
                cualP = 4;
                auxCompra=1;
            }
            if (cualP!=0){
                try {
                    com = new Comprador(mon,cualP,exp);
                } catch (PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoInsuficienteException ex) {
                    throw new RuntimeException(ex);
                }
                switch (cualP){
                    case 1:  imageaux = pdp.coca;getGraphics().drawImage(imageaux,105,530,null); break;
                    case 2:  imageaux = pdp.sprite;getGraphics().drawImage(imageaux,90,530,null); break;
                    case 3:  imageaux = pdp.snickers;getGraphics().drawImage(imageaux,105,530,null); break;
                    case 4:  imageaux = pdp.super8;getGraphics().drawImage(imageaux,100,490,null); break;
                    default: break;
                }
                vuelto=com.cuantoVuelto();
                System.out.println("Se recibe: "+com.queConsumio()+" Numero de serie: "+com.cualSerie());
            }
        }
        if (e.getSource()==VueltoBot){
            if (vuelto==500){
                monvu = new Moneda500();
            }else if (vuelto==1000){
                monvu = new Moneda1000();
            }else if (vuelto==0){
                monvu = null;
            }
            if (monvu!=null){
                System.out.println("Se retira vuelto: $" + monvu.getSerie());
                pdm.addMon(monvu,2);
                pdm.paint(getGraphics());
            }else {
                System.out.println("No hay vuelto");
            }
            vuelto=0;
            auxCompra=0;
            cualP=0;
        }
        if (e.getSource()==ExitButton){
            System.exit(0);
        }

    }
}
