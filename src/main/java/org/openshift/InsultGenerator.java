package org.openshift;

import java.util.Random;

public class InsultGenerator {
	public String generateInsult() {
		String words[][] = {{"Artless", "Bawdy", "Beslubbering", "Uncapable"}, {"Base-court", "Bat-fowling", "Beef-witted", "Slow-working"}, {"Apple-john", "Baggage", "Barnacle", "Clouderian"}};
		String vowels = "AEIOU";
		String article = "an";
		String firstAdjective = words[0][new Random().nextInt(words[0].length)];
		String secondAdjective = words[1][new Random().nextInt(words[1].length)];
		String noun = words[2][new Random().nextInt(words[2].length)];
		if (vowels.indexOf(firstAdjective.charAt(0)) == -1) {
			article = "a";
		}
		return String.format("You are %s %s %s %s!", article, firstAdjective, secondAdjective, noun);
	}

}
