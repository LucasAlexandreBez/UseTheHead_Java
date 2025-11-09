package core;

import java.util.Random;

public class PhraseOMatic {

	public static void main(String[] args) {
		String[] wordListOne = {"neblina", "curiosidade", "faísca", "oceano", "vertigem", "algoritmo", "miragem", "abismo", "relâmpago", "aurora"};
		String[] wordListTwo = {"labirinto", "ecos", "serenidade", "enigma", "tempestade", "horizonte", "vórtice", "silêncio", "fragmento", "constelação"};
		String[] wordListThree = {"bruma", "sintonia", "cadência", "mistério", "penumbra", "inspiração", "reflexo", "paradoxo", "equilíbrio", "infinito"};

		int oneLenght = wordListOne.length;
		int twoLenght = wordListTwo.length;
		int threeLenght = wordListThree.length;
		
		Random random = new Random();
		
		int rand1 = random.nextInt(oneLenght);
		int rand2 = random.nextInt(twoLenght);
		int rand3 = random.nextInt(threeLenght);
		
		String phraseString = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		System.out.println("Precisamos de " + phraseString);
		
	}
}
