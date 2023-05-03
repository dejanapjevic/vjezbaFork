package dejanaProjekat;

public class Auto {
	private String naziv;
	private float brzina;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public float getBrzina() {
		return brzina;
	}
	public void setBrzina(float brzina) {
		this.brzina = brzina;
	}
	public Auto(String naziv, float brzina) {
		super();
		this.naziv = naziv;
		this.brzina = brzina;
	}
	

}
