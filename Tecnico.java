
public class Tecnico {

	private String codigoTaller;
	
	public Tecnico (String codigoTaller) {
		super();
		this.codigoTaller=codigoTaller;
	}

}

	public void setCodigoTaller(String codigoTaller) {
		this.codigoTaller = codigoTaller;
	}
	
	public String getCodigoTaller() {
		return codigoTaller;
	}

	@Override
	public String toString() {
		return "Tecnico [codigoTaller=" + codigoTaller + "]";
	}

}
