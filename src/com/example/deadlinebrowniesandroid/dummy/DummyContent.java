package com.example.deadlinebrowniesandroid.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Flashcard;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

	/**
	 * An array of sample Flashcards.
	 */
	public static List<Flashcard> flashCards = new ArrayList<Flashcard>();

	/**
	 * A map of sample Flashcards.
	 */
	public static Map<String, Flashcard> Flash_MAP = new HashMap<String, Flashcard>();

	static {
		// Add sample items.
		addItem(new Flashcard("The answer to all questions", "42", 0));
		addItem(new Flashcard("Was gibt es heute zu essen?", "Gyros", 2));
		addItem(new Flashcard("Aber...", "Ihre Frau Mama!", 5));
		addItem(new Flashcard("This is madness!", "This is Spartaaa!", 5));
		addItem(new Flashcard("You know nothing...", "...Jon Snow", 5));
	}

	private static void addItem(Flashcard item) {
		flashCards.add(item);
		Flash_MAP.put(item.getQuestion(), item);
	}
}
