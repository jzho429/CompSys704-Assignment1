package org.compsys704;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class POS extends JFrame {
    private JPanel panel;
    private static final Color backgroundColor = new Color(74, 74, 72);

    public POS() {
        panel = new POSCanvas();
        panel.setPreferredSize(new Dimension(700, 500));
        panel.setBackground(backgroundColor);
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;

        this.add(panel, c);
        this.setTitle("Automatic Bottler System");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public static void main(String[] args) {
        POS cl = new POS();
        cl.pack();
        cl.setVisible(true);

        while (true) {
            try {
                cl.repaint();
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
