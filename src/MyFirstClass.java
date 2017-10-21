
/**
 * @author Alaa
 * @description ceci est un td de java
 * @todo finir le td
 */
//import Pt2D.*;
//import Pt2DC.*;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;

public class MyFirstClass {
	public static void main(String[] args) {
		
		System.out.println("hello");
		Pt2D p = new Pt2D();
		Pt2D p2 = new Pt2D(30.6, 40.1);
		System.out.println(p.equals(p2));
		System.out.println(p2.toString());
		Pt2DC p3 = new Pt2DC();
		System.out.println(p3.toString());
		// JOptionPane.showMessageDialog(null, p3.toString());

		JFrame fenetre = new JFrame();
		// Définit un titre pour notre fenêtre
		fenetre.setTitle("Ma première fenêtre Java");
		// Définit sa taille : 400 pixels de large et 100 pixels de haut
		fenetre.setSize(400, 400);
		// Nous demandons maintenant à notre objet de se positionner au centre
		fenetre.setLocationRelativeTo(null);
		// Termine le processus lorsqu'on clique sur la croix rouge
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pan = new JPanel();
	    pan.setBackground(Color.ORANGE);        

		

		
		
		//Graphics g = getGraphics();

		//g.fillOval(20, 20, 75, 75);
		//fenetre.setContentPane(pan);
		
		// Et enfin, la rendre visible
		fenetre.setVisible(true);
		
		

		MyStack<String> my_stack= new MyStack<String>();
		
		
		
	}

}
