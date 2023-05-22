package org.example;
import javax.swing.*;
import java.awt.*;

/**
 * Crea el panel que contendra al panel comprador y panel expendedor en su interior, se encarga de juntar ambos
 * paneles para mostrarse en uno solo para la Ventana
 */
public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;

    /**
     * Metodo constructor que crea instancias del panel comprador y panel expendedor
     * Ademas define los limites del panel
     */
    public PanelPrincipal(){
        this.setLayout(new BorderLayout());
        com = new PanelComprador();
        exp = new PanelExpendedor();
        this.add(com);
        this.setSize(1280,1024);
        this.setBackground(new Color(171, 235, 198 ));
        this.setVisible(true);
    }

    /**
     * Metodo que se encarga de la parte visual del panel
     * @param g  the <code>Graphics</code> context in which to paint
     */
    public void paint (Graphics g){
        super.paint(g);
        com.paint(g);
        exp.paint(g);
    }
}
