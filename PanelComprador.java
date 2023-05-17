package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

public class PanelComprador extends JPanel implements ActionListener{
    Comprador com=null;
    Expendedor exp = new Expendedor();
    int cualP=0;
    int cont[]={0,0,0,0};
    int auxCompra=0;
    Timer timer;
    PanelDepP pdp;
    ImageIcon Mon500,Mon1000,Mon1500,Fondo;
    protected Moneda mon,monaux,monvu;
    protected int saldo,vuelto;
    int i=0,j=-1,auxk,auxl,auxsacamon=0;
    protected JButton CocaColaBot,SpriteBot,SnickersBot,Super8Bot,AgregaMonBot,VueltoBot,ExitButton;
    protected JButton Moneda500Bot,Moneda1000Bot,Moneda1500Bot;
    JRadioButton[][] MonedaPago=new JRadioButton[6][8];
    int xposm,yposm;
    public PanelComprador(){
        pdp = new PanelDepP(80,80);
        this.add(pdp);
        xposm=670;
        yposm=150;

        Mon500 = new ImageIcon("Moneda500.png");
        Mon1000 = new ImageIcon("Moneda1000.png");
        Mon1500 = new ImageIcon("Moneda1500.png");
        Fondo = new ImageIcon("Fondo.png");

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
            if (xposm==915){
                xposm=670;
                yposm+=45;
            }
            if (e.getSource()==Moneda500Bot){
                j++;
                if (j==7){
                    j=0;
                    i++;
                }
                if (auxsacamon==0){
                    MonedaPago[i][j] = new JRadioButton();
                    MonedaPago[i][j].setBounds(xposm,yposm,35,35);
                    MonedaPago[i][j].setIcon(Mon500);
                    MonedaPago[i][j].addActionListener(this);
                    MonedaPago[i][j].setFocusable(false);
                    MonedaPago[i][j].setBackground(new Color(247, 220, 85));
                    this.add(MonedaPago[i][j]);
                }else{
                    MonedaPago[i][j].setIcon(Mon500);
                    auxsacamon=0;
                }
                xposm+=35;
            }else if (e.getSource()==Moneda1000Bot){
                j++;
                if (j==7){
                    j=0;
                    i++;
                }
                if (auxsacamon==0){
                    MonedaPago[i][j] = new JRadioButton();
                    MonedaPago[i][j].setBounds(xposm,yposm,35,35);
                    MonedaPago[i][j].setIcon(Mon1000);
                    MonedaPago[i][j].addActionListener(this);
                    MonedaPago[i][j].setFocusable(false);
                    MonedaPago[i][j].setBackground(new Color(247, 220, 85));
                    this.add(MonedaPago[i][j]);
                }else{
                    MonedaPago[i][j].setIcon(Mon1000);
                    auxsacamon=0;
                }
                xposm+=35;
            }else if (e.getSource()==Moneda1500Bot){
                j++;
                if (j==7){
                    j=0;
                    i++;
                }
                if (auxsacamon==0){
                    MonedaPago[i][j] = new JRadioButton();
                    MonedaPago[i][j].setBounds(xposm,yposm,35,35);
                    MonedaPago[i][j].setIcon(Mon1500);
                    MonedaPago[i][j].addActionListener(this);
                    MonedaPago[i][j].setFocusable(false);
                    MonedaPago[i][j].setBackground(new Color(247, 220, 85));
                    this.add(MonedaPago[i][j]);
                }else{
                    MonedaPago[i][j].setIcon(Mon1500);
                    auxsacamon=0;
                }
                xposm+=35;
            }
        }
        for (int k=0;k<6;k++){
            for (int l=0;l<7;l++){
                if (e.getSource()==MonedaPago[k][l]){
                    if (MonedaPago[k][l].getIcon()==Mon500){
                        monaux = new Moneda500();
                        auxk=k;
                        auxl=l;
                    }else if (MonedaPago[k][l].getIcon()==Mon1000){
                        monaux = new Moneda1000();
                        auxk=k;
                        auxl=l;
                    }else if (MonedaPago[k][l].getIcon()==Mon1500){
                        monaux = new Moneda1500();
                        auxk=k;
                        auxl=l;
                    }
                }
            }
        }

        if (e.getSource()==AgregaMonBot){
            if (monaux!=null){
                if (auxk==i){
                    if (auxl==6||auxl==j){
                    }else{
                        for (int b=auxl+1;b<j+1;b++){
                            MonedaPago[auxk][b-1].setIcon(MonedaPago[auxk][b].getIcon());
                        }
                    }
                }else{
                    if (j==6){
                        if (auxl==6){
                        }else{
                            for (int b=auxl+1;b<j+1;b++){
                                MonedaPago[auxk][b-1].setIcon(MonedaPago[auxk][b].getIcon());
                            }
                        }
                        for (int a=auxk+1;a<i+1;a++){
                            for (int b=1;b<j+1;b++){
                                MonedaPago[a][b-1].setIcon(MonedaPago[a][b].getIcon());
                            }
                        }
                    }else{
                        if (auxl==6){
                            MonedaPago[auxk][auxl].setIcon(MonedaPago[auxk+1][0].getIcon());
                        }else{
                            for (int b=auxl;b<7;b++){
                                if (b==6){
                                    MonedaPago[auxk][b].setIcon(MonedaPago[auxk+1][0].getIcon());
                                }else{
                                    MonedaPago[auxk][b].setIcon(MonedaPago[auxk][b+1].getIcon());
                                }
                            }
                        }
                        for (int a=auxk+1;a<i+1;a++){
                            for (int b=0;b<j+1;b++){
                                if (b==6){
                                    MonedaPago[a][b].setIcon(MonedaPago[a+1][0].getIcon());
                                }else{
                                    if (MonedaPago[a][b+1]!=null){
                                        MonedaPago[a][b].setIcon(MonedaPago[a][b+1].getIcon());
                                    }
                                }
                            }
                        }
                    }

                }
            }
            System.out.println("Se agrega moneda: " + monaux.getSerie());
            mon = monaux;
            monaux = null;
            MonedaPago[i][j].setIcon(Fondo);
            if(i!=0&&j==0){
                i--;
                j=5;
            }else{
                j--;
            }
            auxsacamon=1;
            xposm-=35;
        }
        if (auxCompra==0&&mon!=null){
            if (e.getSource()==CocaColaBot){
                cualP = 1;
                auxCompra=1;
                pdp.mover(cualP-1,cont[0]);
                cont[0]++;
            }else if (e.getSource()==SpriteBot){
                cualP = 2;
                auxCompra=1;
                pdp.mover(cualP-1,cont[1]);
                cont[1]++;
            }else if (e.getSource()==SnickersBot){
                cualP = 3;
                auxCompra=1;
                pdp.mover(cualP-1,cont[2]);
                cont[2]++;
            }else if (e.getSource()==Super8Bot){
                cualP = 4;
                auxCompra=1;
                pdp.mover(cualP-1,cont[3]);
                cont[3]++;
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
                vuelto=com.cuantoVuelto();
                System.out.println("Se recibe: "+com.queConsumio()+" Numero de serie: "+com.cualSerie());
                auxCompra=0;
                cualP=0;
                mon=null;
            }
        }
        if (e.getSource()==VueltoBot){
            if (vuelto==500){
                j++;
                if (j==7){
                    j=0;
                    i++;
                }
                monvu = new Moneda500();
                MonedaPago[i][j].setIcon(Mon500);
                xposm+=35;
            }else if (vuelto==1000){
                j++;
                if (j==7){
                    j=0;
                    i++;
                }
                monvu = new Moneda1000();
                MonedaPago[i][j].setIcon(Mon1000);
                xposm+=35;
            }else if (vuelto==0){
                monvu = null;
                System.out.println("No hay vuelto");
            }
            if (monvu!=null){
                System.out.println("Se retira vuelto: $" + monvu.getSerie());
            }
            vuelto=0;
        }
        if (e.getSource()==ExitButton){
            System.exit(0);
        }

    }
}
