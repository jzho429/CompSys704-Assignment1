package org.compsys704;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Canvas extends JPanel {

	private static final Color CHARCOAL = new Color(38, 70, 83);
	private static final Color PERSIANGREEN = new Color(42, 157, 143);
	private static final Color MAIZECRAYOLA = new Color(233, 196, 106);
	private static final Color SANDYBROWN = new Color(244, 162, 97);
	private static final Color BURNTSIENNA = new Color(231, 111, 81);
	private static final Color MOUNTBATTENPINK = new Color(161, 134, 158);
	private static final Color PERIWINKLECRAYOLA = new Color(187, 194, 226);

	public Canvas() {

	}

	private void turnConveyorOnOff(Graphics g, boolean on) {
		if (on) {
			g.setColor(PERSIANGREEN);
		} else {
			g.setColor(CHARCOAL);
		}
		g.fillRoundRect(30, 400, 640, 50, 20, 20);
	}

	private void turnTurnTableOnOff(Graphics g, boolean on) {
		if (on) {
			g.setColor(PERSIANGREEN);
		} else {
			g.setColor(PERIWINKLECRAYOLA);
		}
		g.fillOval(200, 180, 300, 300);
	}

	private void setBottlePosColor(Graphics g, boolean[] bottlePos) {
		int[][] positions = {
				{ 170, 410 },
				{ 170, 230 },
				{ 335, 140 },
				{ 500, 230 },
				{ 500, 410 }
		};
		for (int i = 0; i < bottlePos.length; i++) {
			if (bottlePos[i]) {
				g.setColor(PERSIANGREEN);
			} else {
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

	private void turnLidLoaderOnOff(Graphics g, boolean on) {
		if (on) {
			g.setColor(PERSIANGREEN);
		} else {
			g.setColor(MAIZECRAYOLA);
		}
		g.fillRect(280, 20, 140, 100);
		g.setColor(Color.BLACK);
		g.drawString("Lid Loader", 305, 80);
	}

	private void turnCapperOnOff(Graphics g, boolean on) {
		if (on) {
			g.setColor(PERSIANGREEN);
		} else {
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
		if (States.conveyorOnE) {
			turnConveyorOnOff(g, true);
		} else {
			turnConveyorOnOff(g, false);
		}

		// Turntable
		if (States.rotaryTableTriggerE) {
			turnTurnTableOnOff(g, true);
		} else {
			turnTurnTableOnOff(g, false);
		}

		// Bottle Positions
		boolean[] states = {
				States.bottleAtPos1E,
				States.bottleAtPos2E,
				States.bottleAtPos3E,
				States.bottleAtPos4E,
				States.bottleAtPos5E
		};
		setBottlePosColor(g, states);

		// Fillers
		if (States.filler1E) {
			setFillerColor(g, 1);
		} else if (States.filler2E) {
			setFillerColor(g, 2);
		} else if (States.filler3E) {
			setFillerColor(g, 3);
		} else if (States.filler4E) {
			setFillerColor(g, 4);
		} else {
			setFillerColor(g, 0);
		}

		// LidLoader
		if (States.bottleAtPos3E) {
			turnLidLoaderOnOff(g, true);
		} else {
			turnLidLoaderOnOff(g, false);
		}

		// Capper
		if (States.bottleAtPos5E) {
			turnCapperOnOff(g, true);
		} else {
			turnCapperOnOff(g, false);
		}
	}
}
