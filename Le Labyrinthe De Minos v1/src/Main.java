import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Nassim
 * @author Sibory
 * cette classe est la phase de lancement du programme 
 */
public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		try {
			Fenetre fenetre = new Fenetre(); 
			
		} catch(NumberFormatException exception) {
			System.out.println("Le num�ro d'entr�e pour la taille du labyrinthe doit �tre un entier");
		}

	}
	
}

/**
 * Ceci est le remplacement de JPanel pour les labyrinthes qui stocke comme �l�ment de donn�es le labyrinthe
 * et appelle la fonction de dessin des labyrinthes
 */

class LabyrinthePanel extends JPanel{

	private Labyrinthe labyrinthe; // l'objet labyrinthe
	
	/*
	 * Constructeur de la classe LabyrinthePanel
	 */
	public LabyrinthePanel(Labyrinthe monLabyrinthe) {
		labyrinthe = monLabyrinthe;
		
		JButton bouton = new JButton("G�n�rer labyrinthe");
		add(bouton);
		
		bouton.addActionListener(new ActionListener() {		//ACTION LISTENERS
			@Override
			public void actionPerformed(ActionEvent e) {
				// Appelle d'une nouvelle fen�tre afin de generer le labyrinthe
				
				new Fenetre().setVisible(true);
			}
		});
	}
	
	/*
	 * La m�thode paintComponent est appel�e � chaque fois que le panneau doit �tre affich� ou actualis�
	 * Tout ce qu'on veut dessiner sur le panel doit �tre dessin� dans cette m�thode.
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.darkGray); 
		
		this.setPreferredSize(labyrinthe.tailleFenetre());
		
		labyrinthe.draw(g);
		
	
	}
}



