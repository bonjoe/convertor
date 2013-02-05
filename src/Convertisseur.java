
public class Convertisseur {
	
	String nom="convertisseur par defaut";
	int value_d;
	int valut_a;
	String fonction;
	
	public Convertisseur()
	{
		
	}
	public Convertisseur(String n, String f)
	{
		nom=n;
		fonction=f;
	}
	
	public Convertisseur(String n, String f, int d)
	{
		nom=n;
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
	
	int[] reach(int bc_i[])
	{
		int bc_f[] = bc_i;
		for(int i=bc_i[0]; i<= this.fonction.length();)
		{
			switch(this.fonction.charAt(i))
			{
			case '(':
				bc_f[0]=i;
				bc_f=reach(bc_f);
			break;
			
			case')':
				bc_f[1]=i;
			break;
			
			default:
				return bc_f;
			}
			
			
		}
		return bc_f;
	}
	

}
