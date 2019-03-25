import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Pick a week number between 1 and 7");
		var sc = new Scanner(System.in);
		var nb = sc.nextInt();
		System.out.println("This is "+weekDay(nb));
	}

	public static String weekDay(int nb){
		return switch(nb) {
			case 1 -> WEEK.MONDAY.toString();
			case 2 -> WEEK.TUESDAY.toString();
			case 3 -> WEEK.WEDNESDAY.toString();
			case 4 -> WEEK.THURSDAY.toString();
			case 5 -> WEEK.FRIDAY.toString();
			case 6 -> WEEK.SATURDAY.toString();
			case 7 -> WEEK.SUNDAY.toString();
			default -> throw new IllegalArgumentException("Must be between 1 and 7 !");
		};
	}

	static enum WEEK{
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	}

}