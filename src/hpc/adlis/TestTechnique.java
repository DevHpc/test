package hpc.adlis;

public class TestTechnique {

	// HPC-ADLIS TEST TECHNIQUE
	// Utiliser les sysout pour les réponses

	public void question1() {
		// Quelle est la différence entre interface et classe ?

		System.out.println();
	}

	public void question2() {
		// Qu'est-ce que l'héritage ?

		System.out.println();
	}

	public void question3() {
		// Qu'est-ce qu'un Design Pattern?

		System.out.println();

	}

	public void question4() {
		// Qu'est-ce qu'une classe abstraite et quelle est l'intèrêt d'avoir des
		// méthodes abstraites ?

		System.out.println();

	}

	// Raphael est un codeur fou mais qui a encore beaucoup à apprendre.
	// Corriger le code ci-dessous
	// Résulats a chercher:
	// question5_Factorielle(4) = 24
	// question5_Factorielle(5) = 120

	/**
	 * Méthode permettant de calculer la factorielle d'un nombre
	 * 
	 * @param n
	 *            le nombre dont on veut la factorielle
	 */
	public int question5_Factorielle(int n) {
		if (n = 0) {
			return 1;
		} else
			return question5_Factorielle(n);
	}

	// Pascal,technico-commercial nous demande de réaliser la fonction
	// ci-dessous

	/**
	 * Méthode permettant de trouver le nombre de pairs possibles pour des éléments différents,
	 * l'ordre n'étant pas important.
	 * Exemple: Prenons 3 élement A,B,C et D. 
	 * Les paires de A sont AB,AC et AD => 3
	 * les paires de B sont BC et BD (BA = AB car ordre non important) => 2
	 * les paires de C sont CD (CA = AC et CB = BC car ordre non important) => 1
	 * Paires de D dèja compté plus haut donc 0
	 * 
	 *  Le résultat est donc de 6 paires pour 4 élément
	 * 
	 * @param nbElem
	 *            le nombre d'élément dont on veut toutes les paires
	 */
	public int question6_paire(int n) {
		return 0;
	}

	//Une nouvelle demande du service informatique! Cette fois ci c'est Pascale qui vous demande
	//de réaliser un parseur de chaine (Mais où va t-elle chercher toutes ces iées....)
	//Votre Mission ? Coder !!
	
	/**
	 * Méthode permettant de parser des chaines de parenthèses et/ou de crochets simples
	 * Une première version simple vous est demandé, conidéré ( = [ et ) = ]  
	 * pas de distinction pour les ouvertures et fermetures
	 * Exemple: ()() => true
	 * 			([]) => true
	 * 			((]] => true
	 * 			((] => false
	 * 
	 * Une 2eme version,plus compliqué et seulement si vous vous senter capable et que vous avez le temps 
	 * est de vérifier le type de parenthèse
	 * Donc ( n'est plus pareil que [ et de même pour les fermetures
	 * Par exemple: (([])) => true
	 * 				((])) => Faux un ( a besoin d'être fermer 
	 * 
	 *  Le résultat est donc de 6 paires pour 4 élément
	 * 
	 * @param nbElem
	 *            le nombre d'élément dont on veut toutes les paires
	 */
	public boolean question7_parseur(String chaineAParse) {
		return false;
	}
	
	//Pour Finir Francis aussi du service Info a une demande
	
	
	/**
	 * Méthode permettant de jouer avec l'ordinateur via une recherche d'un nombre mystère
	 * Votre fonction doit générer un nombre aléatoire entre 1 et 50
	 * Votre fonction doit récupérer l'entrée de l'utilisateur et le guider petit a petit vers le nombre 
	 * trouvé aléatoirement
	 * Votre fonction doit quand (le nombre généré aléatoirement est trouvé) affiché le nombre de fois que 
	 * l'utilisateur a tapé un chiffre
	 * 
	 *   Un exemple de partie: 
	 *   Nombre aléatoire 35
	 *   -> user tape 20
	 *   ordi répond le nombre est plus grand (car 35 est plus grand que 20)
	 *   -> user tape 40
	 *   ordi repond le nombre est plus petit (car 35 est plus petit que 40)
	 *   -> user tape 34
	 *   ordi repond le nombre est plus grand (car 35 est plus grand que 34)
	 *   -> user tape 35
	 *   ordi repond trouvé et affiche 4 éssai car il a fallu 4 tentative pour trouver le nombre mystère
	 *   
	 */
	public void question8_nombreMystère() {
		
	}
	
	public static void main(String[] args) {
		// Utiliser ce main pour tester vos méthodes
		TestTechnique test = new TestTechnique();

	}

}
