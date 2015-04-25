
public class Tv extends Elektronik{
	
	String Kualsu;
	String Layar;
	
	public Tv(String Merk, String Voltase, String Berat, String Kualsu, String Layar){
		super(Merk, Voltase, Berat);
		this.Kualsu=Kualsu;
		this.Layar=Layar;
		
	}

	public String getKualsu() {
		return Kualsu;
	}

	public String getLayar() {
		return Layar;
	}
	
	
	

}
