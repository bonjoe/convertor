
public class Convertiseur {
	
	String nom="convertisseur par defaut";
	int value_d;
	int valut_a;
	String fonction;
	
	public Convertiseur()
	{
		
	}
	public Convertiseur(String f)
	{
		fonction=f;
	}
	
	public Convertiseur(int d, String f)
	{
		value_d=d;
		fonction=f;
	}

	public int getValue_d() {
		return value_d;
	}

	public void setValue_d(int value_d) {
		this.value_d = value_d;
	}

	public int getValut_a() {
		return valut_a;
	}

	public void setValut_a(int valut_a) {
		this.valut_a = valut_a;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	
	private int reach(int deb)
	{
		
	}
	

}
