package Utils;

public class Utils {

	private final static int DEFAULT_MIN_VALUE = 1;
	private final static int DEFAULT_MAX_VALUE = 10;

	private final static String[] VEGETABLE_NAMES = {
			"Lettuce",
			"Cabbage",
			"Onion",
			"Spinach",
			"Potato",
			"Celery",
			"Asparagus",
			"Radish",
			"Broccoli",
			"Artichoke",
			"Tomato",
			"Cucumber",
			"Eggplant",
			"Carrot",
			"Green bean"
	};

	public static int getRandomNumber() {
		return (int) (Math.random() * (DEFAULT_MAX_VALUE - DEFAULT_MIN_VALUE)) + DEFAULT_MIN_VALUE;
	}

	public static int getRandomNumber(int maxValue) {
		return (int) (Math.random() * (Math.abs(maxValue) - DEFAULT_MIN_VALUE)) + DEFAULT_MIN_VALUE;
	}

	public static int getRandomNumber(int minValue, int maxValue) {
		if (minValue > maxValue) {
			int memory = maxValue;
			maxValue = minValue;
			minValue = memory;
		}
		return (int) (Math.random() * (Math.abs(maxValue) - Math.abs(minValue))) + Math.abs(minValue);
	}

	public static String getRandomVegetable() {
		int randomPosition = getRandomNumber(VEGETABLE_NAMES.length - 1);
		return VEGETABLE_NAMES[randomPosition];
	}

}
