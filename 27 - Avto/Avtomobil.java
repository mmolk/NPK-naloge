import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Avtomobil extends JPanel {
	
	Color rdeca = new Color(255, 0, 0);
	Color modra = new Color(0, 0, 255);
	Color siva = new Color(50, 50, 50);
	Color crna = new Color(0, 0, 0);
	
	
	public static void main(String[] args) {
		
		JFrame okvir = new JFrame();
		okvir.setSize(400, 400);
		
		okvir.add(new Avtomobil() );
		okvir.setVisible(true);
		okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public void paint(Graphics g) {
		
		//Naslov:
		g.setColor(rdeca);
		g.drawString("P O R S C H E", 150, 60);
		g.drawString("PARANEMA", 155, 85);
		
		//Zadnjni del avta:
		g.drawOval(270, 170, 50, 50);
		g.setColor(crna);
		g.fillOval(270, 170, 50, 50);
		
		//Chassis:
		g.drawRect(100, 170, 200, 50);
		g.setColor(crna);
		g.fillRect(100, 170, 200, 50);
		
		//kolesa:
		int x = 100;
		int y = 200;
		int w = 40;
		int h = 40;
		g.drawOval(x, y, w, h);
		g.setColor(siva);
		g.fillOval(x, y, w, h);
		
		g.drawOval(235, y, w, h);
		g.setColor(siva);
		g.fillOval(235, y, w, h);
		
		//Kabina:
		g.drawRect(185, 145, 75, 25);
		g.setColor(modra);
		g.fillRect(185, 145, 75, 25);
		
		//Zadnji del kabine - polygon:		
		int[] trikotnikX = new int[3];
		int[] trikotnikY = new int[3];
		
		//koordinate trikotnika:
		trikotnikX[0] = 260;
		trikotnikX[1] = 260;
		trikotnikX[2] = 300;
		
		trikotnikY[0] = 145;
		trikotnikY[1] = 170;
		trikotnikY[2] = 170;
		
		Polygon zadnjiDel = new Polygon(trikotnikX, trikotnikY, trikotnikX.length);
		g.setColor(crna);
		g.fillPolygon(zadnjiDel);
		g.drawPolygon(zadnjiDel);
		
		//vetrobran:		
		int[] vetroX = new int[3];
		int[] vetroY = new int[3];
		
		vetroX[0] = 185;
		vetroX[1] = 185;
		vetroX[2] = 155;
		
		vetroY[0] = 145;
		vetroY[1] = 170;
		vetroY[2] = 170;
		
		Polygon vetrobran = new Polygon(vetroX, vetroY, vetroX.length);
		g.setColor(modra);
		g.fillPolygon(vetrobran);
		g.drawPolygon(vetrobran);
		
		//Hauba:
		int[] haubaX = new int[3];
		int[] haubaY = new int[3];
		
		haubaX[0] = 100;
		haubaX[1] = 100;
		haubaX[2] = 50;

		haubaY[0] = 170;
		haubaY[1] = 220;
		haubaY[2] = 220;
		
		Polygon hauba = new Polygon(haubaX, haubaY, haubaX.length);
		g.setColor(crna);
		g.fillPolygon(hauba);
		g.drawPolygon(hauba);
		
	}

	
	
	
	
	
	
	
}
