import java.awt.Graphics;

public class Pt2D {

	private double abs, ord;
	public static final byte TRACE_CERCLE = 1;
	public static final byte TRACE_CROIX = 2;
	public static final byte TRACE_PLUS = 3;

	Pt2D() {
		this(0.0, 0.0);
	}

	Pt2D(Pt2D p) {
		this.abs = p.abs;
		this.ord = p.ord;
	}

	Pt2D(double x, double y) {
		this.abs = x;
		this.ord = y;
	}

	public double get_abs() {
		return this.abs;
	}

	public double get_ord() {
		return this.ord;
	}

	public void set_abs(double x) {
		this.abs = x;
	}

	public void set_ord(double y) {
		this.ord = y;
	}

	public void set_absord(double x, double y) {
		this.ord = y;
		this.abs = x;
	}

	public static void setType(byte t) {
		type = t;
	}

	public static void setLonguer(int L) {
		Longueur = L;
	}

	public double distance(Pt2D p) {
		return Math.sqrt(
				(this.abs - p.get_abs) * (this.abs - p.get_abs) + (this.ord - p.get_ord) * (this.ord - p.get_ord));
	}

	@Override
	public String toString() {
		return "C'est le point(" + this.abs + "," + this.ord + ")";
	}

	public  boolean equals(Pt2D p) {
		boolean result = ((this.abs == p.abs) && (this.ord == p.ord)) ? true : false;
		return result;
	}

	public void paint(Graphics g) {

	}

	@Override // ceci est une annotation pour dire que nous avons redefini la methode equals de la classe mere
	public boolean equals(Object obj) {
		if(obj instanceof Pt2D) {
			Pt2D p2= (Pt2D) obj; //on caste la variable obj
			return (p2.abs == this.abs ) && (p2.ord == this.ord);)
		}
		else return false;
	}

}
