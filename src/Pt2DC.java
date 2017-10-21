/**
 * coucou
 */
/**
tata
*/

import java.awt.Color;

public class Pt2DC extends Pt2D {
	
	private Color couleur;
	
	Pt2DC(){
		super();
		couleur = Color.BLACK;//c'est une donnée de classe
	}
	Pt2DC(Pt2DC p){
		super(p.abs, p.y);
		this.couleur = p.couleur;
		// si c'etait un lien de compostion 
		// j'aurais mis: this.couleur= new Color(c);
	}
	Pt2DC(double x, double y, Color c){
		this.set_abs( x); this.set_ord(y);
		this.couleur=c;
	}
	public void set_color(Color c) {
		this.couleur = c;
	}
	public Color get_color() {
		return this.couleur;
	}
	public void finalize () {
		couleur = null; // on détruit l'instance Color à la déstruction du Pt2DC
		
	}
	
	
}
