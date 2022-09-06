package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MainCanvas extends JPanel {

	private static final Color CHARCOAL = new Color(38, 70, 83);
	private static final Color PERSIANGREEN = new Color(42, 157, 143);
	private static final Color MAIZECRAYOLA = new Color(233, 196, 106);
	private static final Color SANDYBROWN = new Color(244, 162, 97);
	private static final Color BURNTSIENNA = new Color(231, 111, 81);
	private static final Color MOUNTBATTENPINK = new Color(161, 134, 158);
	private static final Color PERIWINKLECRAYOLA = new Color(187, 194, 226);

	public MainCanvas() {

	}

	private void turnConveyorOnOff(Graphics g, boolean on){
		if(on){
			g.setColor(PERSIANGREEN);
		}else{
			g.setColor(CHARCOAL);
		}
		g.fillRoundRect(30, 400, 640, 50, 20, 20);
	}

	private void turnTurnTableOnOff(Graphics g, boolean on){
		if(on){
			g.setColor(PERSIANGREEN);
		}else{
			g.setColor(PERIWINKLECRAYOLA);
		}
		g.fillOval(200, 180, 300, 300);
	}

	private void setBottlePosColor(Graphics g, boolean[] bottlePos){
		int[][] positions = {
			{170, 410},
			{170, 230},
			{335, 140},
			{500, 230},
			{500, 410}
		};
		for(int i = 0; i < bottlePos.length; i++){
			if(bottlePos[i]){
				g.setColor(PERSIANGREEN);
			}else{
				g.setColor(SANDYBROWN);
			}
			g.fillRoundRect(positions[i][0], positions[i][1], 30, 30, 10, 10);
		}
		g.setColor(Color.BLACK);
		g.drawString("1", 180, 432);
		g.drawString("2", 180, 252);
		g.drawString("3", 345, 162);
		g.drawString("4", 510, 252);
		g.drawString("5", 510, 432);
	}

	private void turnLidLoaderOnOff(Graphics g, boolean on){
		if(on){
			g.setColor(PERSIANGREEN);
		}else{
			g.setColor(MAIZECRAYOLA);
		}
		g.fillRect(280, 20, 140, 100);
		g.setColor(Color.BLACK);
		g.drawString("Lid Loader", 305, 80);
	}

	private void turnCapperOnOff(Graphics g, boolean on){
		if(on){
			g.setColor(PERSIANGREEN);
		}else{
			g.setColor(MOUNTBATTENPINK);
		}
		g.fillRect(540, 120, 140, 100);
		g.setColor(Color.BLACK);
		g.drawString("Capper", 575, 180);
	}

	private void setFillerColor(Graphics g, int colorPosition) {
		g.setColor(BURNTSIENNA);
		switch (colorPosition) {
			case 1:
				g.fillRect(120, 20, 100, 75);
				g.fillRect(20, 95, 100, 75);
				g.fillRect(120, 95, 100, 75);
				g.setColor(PERSIANGREEN);
				g.fillRect(20, 20, 100, 75);
				break;
			case 2:
				g.fillRect(20, 95, 100, 75);
				g.fillRect(120, 95, 100, 75);
				g.fillRect(20, 20, 100, 75);
				g.setColor(PERSIANGREEN);
				g.fillRect(120, 20, 100, 75);

				break;
			case 3:
				g.fillRect(120, 95, 100, 75);
				g.fillRect(20, 20, 100, 75);
				g.fillRect(120, 20, 100, 75);
				g.setColor(PERSIANGREEN);
				g.fillRect(20, 95, 100, 75);

				break;
			case 4:
				g.fillRect(20, 20, 100, 75);
				g.fillRect(120, 20, 100, 75);
				g.fillRect(20, 95, 100, 75);
				g.setColor(PERSIANGREEN);
				g.fillRect(120, 95, 100, 75);
				break;
			default:
				g.fillRect(120, 20, 100, 75);
				g.fillRect(20, 95, 100, 75);
				g.fillRect(120, 95, 100, 75);
				g.fillRect(20, 20, 100, 75);
				break;
		}
		g.setColor(Color.BLACK);
		g.drawLine(120, 20, 120, 170);
		g.drawLine(20, 95, 220, 95);
		g.drawString("Fill 1", 50, 65);
		g.drawString("Fill 2", 150, 65);
		g.drawString("Fill 3", 50, 140);
		g.drawString("Fill 4", 150, 140);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(g.getFont().deriveFont(20f));
		// Conveyor
		turnConveyorOnOff(g, false);
		// Turntable
		turnTurnTableOnOff(g, false);
		// Bottle Positions
		setBottlePosColor(g, new boolean[]{false, false, false, true, false});
		// Fillers
		setFillerColor(g, 1);
		// LidLoader
		turnLidLoaderOnOff(g, false);
		// Capper
		turnCapperOnOff(g, false);
	}
}
