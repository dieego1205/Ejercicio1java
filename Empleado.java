
public class Empleado {
	
	private String nombre;
	
	public Empleado(String nombre) {
		super();
		this.nombre=nombre;
	}

}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getnombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "]";
	}
}
	