
public class Personne {
	private String nom;
	private String prenom;
	private int age;

	public Personne() {
	}

	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	// Comparaison AGE

	public static int differenceAgeAMoinsAgeBstatic(Personne A, Personne B) {
		return A.getAge() - B.getAge();
	}

	public int differenceAgeBmoinsAgeA(Personne B) {
		return this.getAge() - B.getAge();
	}

	// Comparaison Alphabétique NOM

	public static int comparaisonAlphabetiqueNomChar(Personne A, Personne B) {
		String nomA = A.getNom().toLowerCase();
		String nomB = B.getNom().toLowerCase();
		int longueurMin = Math.min(nomA.length(), nomB.length());
		int i = 0;

		if (nomA.substring(0, longueurMin).equals(nomB.substring(0, longueurMin))) {
			if (nomA.length() < nomB.length())
				return (int) nomB.charAt(i) * (-1);
			else if (nomA.length() > nomB.length())
				return (int) nomA.charAt(i);
			else
				return 0;
		}

		else {
			while (nomA.charAt(i) == nomB.charAt(i))
				i++;
			return (int) nomA.charAt(i) - (int) nomB.charAt(i);
		}
	}

	public static int comparaisonAlphabetiqueNomSubString(Personne A, Personne B) {
		String nomA = A.getNom().toLowerCase();
		String nomB = B.getNom().toLowerCase();
		int longueurMin = Math.min(nomA.length(), nomB.length());
		int comparateur = 0;

		if (nomA.equals(nomB))
			return 0;

		if (nomA.length() < nomB.length()) {
			if (nomA.substring(0, longueurMin).equals(nomB.substring(0, longueurMin)))
				return (int) (nomB.charAt(longueurMin) - ((1000 * (50 - longueurMin))));
			nomB = nomB.substring(0, longueurMin);
		} else {
			if (nomA.substring(0, longueurMin).equals(nomB.substring(0, longueurMin)))
				return (int) (nomA.charAt(longueurMin) + ((1000 * (50 - longueurMin))));
			nomA = nomA.substring(0, longueurMin);
		}

		for (int i = 1; i <= longueurMin; i++) {
			if (nomA.substring(0, i).equals(nomB.substring(0, i)))
				continue;
			else {
				comparateur = (((int) nomA.charAt(i - 1)) - ((int) nomB.charAt(i - 1)));
				if (comparateur >= 0)
					comparateur = comparateur + (1000 * (50 - i));
				else
					comparateur = comparateur - (1000 * (50 - i));
				break;
			}
		}
		return comparateur;
	}

	public String toString() {
		return prenom + " " + nom + ", " + age + " ans";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
