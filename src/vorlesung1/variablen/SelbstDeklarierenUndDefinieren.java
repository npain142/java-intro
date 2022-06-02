package vorlesung1.variablen;

class SelbstDeklarierenUndDefinieren {
	public static void main(String [] ignored) {
		// deklariere eine Variable "birnen"  vom Typ int
		int birnen;
		// weise ihr den Wert drei zu
		birnen = 3;
		System.out.println("3 erwartet: " + birnen);
		// addiere f�nf zu dem Wert
		birnen += 5;
	System.out.println("8 erwartet: " + birnen);
		// deklariere eine Variable "aepfel" und weise ihr den Wert f�nf zu
		int aepfel = 5;
		System.out.println("5 erwartet: " + aepfel);
		// subtrahiere zwei von dem Wert
		aepfel -= 2;
	System.out.println("3 erwartet: " + aepfel);


	}
}
