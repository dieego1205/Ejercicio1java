
public class Oficial {
	
	private String categoria;
	
	public Tecnico (String categoria) {
		super();
		this.categoria=categoria;
	}

}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return categoria;
	}

	@Override
	public String toString() {
		return "Oficial [categoria=" + categoria + "]";
	}
	
}
