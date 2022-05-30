
public class Operario {
	
	private String maquina;
	
	public Tecnico (String maquina) {
		super();
		this.maquina=maquina;
	}

}

	public void setMaquina(String maquina) {
		this.maquina = maquina;
	}
	
	public String getMaquina() {
		return maquina;
	}

	@Override
	public String toString() {
		return "Operario [maquina=" + maquina + "]";
	}
	
}
