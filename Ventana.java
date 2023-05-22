package org.example;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Crea la ventana que va a ver el Cliente, contiene el panel principal
 */
public class Ventana extends JFrame{
    private PanelPrincipal dp;

    /**
     * Metodo constructor que se encarga de instanciar el panel principal, definir los bordes y acciones basicas
     */
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