
public class Kipasangin extends Elektronik{
	
	String Kuling;
	String dinamo;
	
	public Kipasangin(String Merk, String Voltase, String Berat, String Kuling, String dinamo){
		super(Merk, Voltase, Berat);
		this.Kuling=Kuling;
		this.dinamo=dinamo;
	}

	public String getKuling() {
		return Kuling;
	}

	public String getDinamo() {
		return dinamo;
	}
	
	
	

}
