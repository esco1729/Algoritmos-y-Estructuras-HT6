
public class Cartas {
	private String tipoCarta;
	private String nombre;
	private int cant;
	
	
	public Cartas(String tipoCarta, String nombre, int cant) {
		this.tipoCarta = tipoCarta;
		this.nombre = nombre;
		this.cant = cant;
	}
	
	public Cartas(String tipo) {
		tipoCarta = tipo;
		cant = 1;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	
	public void agregar() {
		cant++;
	}
	
	public int getCant() {
		return cant;
	}
	
	public String toString() {
		return "Nombre: " + this.nombre + "\n Tipo: " + this.tipoCarta;
	}

	
	
}
