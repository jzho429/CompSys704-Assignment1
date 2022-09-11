package org.compsys704;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.systemj.ipc.TCPSender;

public class POSCanvas extends JPanel {

    private static final Color CHARCOAL = new Color(38, 70, 83);
    private static final Color PERSIANGREEN = new Color(42, 157, 143);
    private static final Color MAIZECRAYOLA = new Color(233, 196, 106);
    private static final Color SANDYBROWN = new Color(244, 162, 97);
    private static final Color BURNTSIENNA = new Color(231, 111, 81);
    private static final Color MOUNTBATTENPINK = new Color(161, 134, 158);
    private static final Color PERIWINKLECRAYOLA = new Color(187, 194, 226);

    JTextField liquid1 = new JTextField();
    JTextField liquid2 = new JTextField();
    JTextField liquid3 = new JTextField();
    JTextField liquid4 = new JTextField();
    JTextField quantity = new JTextField();

    JButton orderButton = new JButton();

    public POSCanvas() {
        setLayout(null);
        liquid1.setColumns(8);
        liquid2.setColumns(8);
        liquid3.setColumns(8);
        liquid4.setColumns(8);

        Dimension d = liquid1.getPreferredSize();
        liquid1.setBounds(190, 175 - d.height, d.width, d.height);
        liquid2.setBounds(190, 245 - d.height, d.width, d.height);
        liquid3.setBounds(190, 315 - d.height, d.width, d.height);
        liquid4.setBounds(190, 385 - d.height, d.width, d.height);
        add(liquid1);
        add(liquid2);
        add(liquid3);
        add(liquid4);

        quantity.setColumns(8);
        d = quantity.getPreferredSize();
        quantity.setBounds(469, 170 - d.height, d.width, d.height);
        add(quantity);

        try {
            Image img = ImageIO.read(getClass().getResource("coolerButton.png")).getScaledInstance(230, 100,
                    BufferedImage.SCALE_SMOOTH);
            orderButton.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        orderButton.setBounds(410, 250, 230, 100);
        orderButton.setOpaque(false);
        orderButton.setContentAreaFilled(false);
        orderButton.setBorderPainted(false);
        orderButton.addActionListener(l -> {
            System.out.println("Order button pressed");
            sendOrder();
        });
        add(orderButton);
    }

    int getTotal() {
        // If any of the text fields are empty, return 0
        if (liquid1.getText().equals("") || liquid2.getText().equals("")
                || liquid3.getText().equals("") || liquid4.getText().equals("")) {
            return 0;
        }
        // If any of the text fields are not integers, return 0
        try {
            int total = Integer.parseInt(liquid1.getText())
                    + Integer.parseInt(liquid2.getText())
                    + Integer.parseInt(liquid3.getText())
                    + Integer.parseInt(liquid4.getText());
            return total;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    int getQuantity() {
        // If the text field is empty, return 0
        if (quantity.getText().equals("")) {
            return 0;
        }
        // If the text field is not an integer, return 0
        try {
            int total = Integer.parseInt(quantity.getText());
            return total;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    void sendOrder() {
        // Send order to the server
        try {
            System.out.println("Sending order");
            TCPSender sender = new TCPSender();
            sender.;
            sender.close();
        } catch (Exception e) {
            System.out.println("SADGE");
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(g.getFont().deriveFont(30f));
        g.setColor(BURNTSIENNA);
        g.drawString("Group 8 Purchase Order System", 30, 50);
        g.setColor(MAIZECRAYOLA);
        g.fillRoundRect(30, 70, 300, 380, 20, 20);
        g.setColor(PERIWINKLECRAYOLA);
        g.fillRoundRect(370, 70, 300, 380, 20, 20);
        g.setColor(CHARCOAL);
        g.setFont(g.getFont().deriveFont(25f));
        g.drawString("Fill Amounts", 50, 120);
        g.setFont(g.getFont().deriveFont(20f));
        g.drawString("Liquid 1(%)", 50, 170);
        g.drawString("Liquid 2(%)", 50, 240);
        g.drawString("Liquid 3(%)", 50, 310);
        g.drawString("Liquid 4(%)", 50, 380);

        g.setFont(g.getFont().deriveFont(25f));
        g.drawString("Quantity", 469, 120);

        if (getTotal() != 100) {
            g.setFont(g.getFont().deriveFont(20f));
            g.drawString("Values do not add up to 100", 50, 420);
        }
        if (getQuantity() == 0) {
            g.setFont(g.getFont().deriveFont(20f));
            g.drawString("Quantity not valid", 442, 420);
        }
    }
}
