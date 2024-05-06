package modele;

import controleur.Global;

import modele.Objet;

import java.net.URL;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Gestion des murs
 *
 */
public class Mur extends Objet {

	private static final int ARENE_LARGEUR = 800;  // Taille de l'arène en largeur
    private static final int ARENE_HAUTEUR = 600; // Taille de l'arène en hauteur
    private static final int MUR_TAILLE = 35;     // Taille d'un mur
    
	/**
	 * Constructeur
	 */
	public Mur() {
		posX = (int) Math.round(Math.random() * (ARENE_LARGEUR - MUR_TAILLE)) ;
		posY = (int) Math.round(Math.random() * (ARENE_HAUTEUR - MUR_TAILLE)) ;

		lblMur = new JLabel();
        lblMur.setBounds(posX, posY, MUR_TAILLE, MUR_TAILLE);
		URL resource = getClass().getClassLoader().getResource(controleur.Global.MUR);
		lblMur.setIcon(new ImageIcon(resource));	
	}
	
	
}
