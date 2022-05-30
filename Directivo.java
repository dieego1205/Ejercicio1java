
public class Directivo {
	
	private String area;
	
	public Tecnico (String area) {
		super();
		this.area=area;
	}

}

	public void setArea(String area) {
		this.area = area;
	}
	
	public String getArea() {
		return area;
	}

	@Override
	public String toString() {
		return "Directivo [area=" + area + "]";
	}
	
}
