package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelBotones extends JPanel{
    public PanelBotones(){
        this.setLayout(new BorderLayout());
        this.add(new JButton("sur"), BorderLayout.SOUTH);
        this.add(new JButton("centro"), BorderLayout.CENTER);
        this.add(new JButton("norte"), BorderLayout.NORTH);
        this.add(new JButton("este"), BorderLayout.EAST);
        this.add(new JButton("oeste"), BorderLayout.WEST);

        this.setSize(600,400);
        this.setBackground(Color.blue);
    }
}
