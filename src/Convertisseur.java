
public class Convertisseur {
	
	String nom="convertisseur par defaut";
	int value_d;
	int valut_a;
	String fonction;
	
	//Constructeurs
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

	
	// Getters and Setters
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

	
	
	//FONCTION UTILES
	//fonction qui recherche les parenthèses les plus restrintes donné par un talbeau
	int[] reach(int bc_i[])
	{
		int bc_f[] = bc_i;
		for(int i=bc_i[0]+1; i<= this.fonction.length(); i++)
		{
			switch(this.fonction.charAt(i))
			{
			case '(':
				bc_f[0]=i;
			break;
			
			case')':
				bc_f[1]=i;
			break;		
			}
			return bc_f;
		}
		return bc_f;
	}
	
	//Renvoit un chiffre a partir d'un caractère
	int quel_chifr(String ltre)
	{
		int chiffre=0;
		switch(ltre)
		{
		case"0":
			chiffre=0;
			break;
		case"1":
			chiffre=1;
			break;
		case"2":
			chiffre=2;
			break;
		case"3":
			chiffre=3;
			break;
		case"4":
			chiffre=4;
			break;
		case"5":
			chiffre=5;
			break;
		case"6":
			chiffre=6;
			break;
		case"7":
			chiffre=7;
			break;
		case"8":
			chiffre=8;
			break;
		case"9":
			chiffre=9;
			break;
			
		}
		return chiffre;
	}
	
	//Renvoit une lettre a partir d'un chiffre
	String quel_ltre(int chiffre)
	{
		String lettre="x";
		switch(chiffre)
		{
		case 0:
			lettre="0";
			break;
		case 1:
			lettre="1";
			break;
		case 2:
			lettre="2";
			break;
		case 3:
			lettre="3";
			break;
		case 4:
			lettre="4";
			break;
		case 5:
			lettre="5";
			break;
		case 6:
			lettre="6";
			break;
		case 7:
			lettre="7";
			break;
		case 8:
			lettre="8";
			break;
		case 9:
			lettre="9";
			break;
			
		}
		return lettre;
	}

	//Renvoit un nombre a partir d'une chaine ou vice versa
	long quel_nbr(int br[])
	{
		long nbr=0;
		for(int i=br[0]; i<=br[1]; i++)
		{
			nbr+=quel_chifr(conv(this.fonction.charAt(br[i])))*10^((br[1]-br[0])-i);
		}
		return nbr;
	}

	//Convertisseur de char a String
	String conv(char letr)
	{
		String lettre="x";
		switch(letr)
		{
		case '0':
			lettre="0";
			break;
		case '1':
			lettre="1";
			break;
		case '2':
			lettre="2";
			break;
		case '3':
			lettre="3";
			break;
		case '4':
			lettre="4";
			break;
		case '5':
			lettre="5";
			break;
		case '6':
			lettre="6";
			break;
		case '7':
			lettre="7";
			break;
		case '8':
			lettre="8";
			break;
		case '9':
			lettre="9";
			break;
		}
		return lettre;
	}

	//Recherche de nombre a gauche et a droite (l ou r)
	int[] reach_nbr(char d, int p)
	{
		int po[]={0,0};
		boolean continu=true;
		if (d=='l')
		{
			po[0]=po[1]=p-1;
			while(continu)
			{
				if(p!=0 && p!=1 && p!=2 && p!=3 && p!=4 && p!=5 && p!=6 && p!=7  && p!=8  && p!=9)
					continu=false;
				else
					continu=true;
				po[1]--;
			}
		}
		else
		{
			po[0]=po[1]=p+1;
			while(continu)
			{
				if(p!=0 && p!=1 && p!=2 && p!=3 && p!=4 && p!=5 && p!=6 && p!=7  && p!=8  && p!=9)
					continu=false;
				else
					continu=true;
				po[1]++;
			}
			
		}
		return po;
	}

	//FONCTION D'OPERATION






}
