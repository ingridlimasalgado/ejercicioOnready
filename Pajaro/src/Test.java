
public class Test {
	
	public static void main (String[] args){
		
		String a = "Pepe";
		int x = 10;
		
		Pajaro p = new Pajaro();
		p.volar();
		p.comer();
		p.edad=3;
		p.color="Blanco";
		// p es una referencia a una instancia
		
		Aguila g = new Aguila();
		g.volar();
		g.cazar();
		g.comer();
		
		Canario c = new Canario();
		c.comer();
		c.cantar();
		c.color="Amarillo";
		
		
		System.out.println(c.color);
	}
}
