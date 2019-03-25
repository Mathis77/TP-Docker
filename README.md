## TP sur l'utilisation de Docker
#### Par Mathis Rybczynski & Julien Motheron

#### Docker cloud - Hello World

First, we had to modify the docker-compose.yml file to bind (*by Juleron*) de source port.
Then we have :
	- src port : 8000
	- dst port : 80

However, we encountered a problem when we launched the *docker-compose up* command. In fact,
the command line was blocking at the line "Attaching to dockercloudhelloworld_helloworld_1".
But, it actually worked, it's just that it start a server (*Juleron wants to modify this
sentence*), then we didn't have control on command line.

#### JAVA 13

We added a folder ***HelloWorldJava/*** containing a **Dockerfile** and a java file.
The content of the Dockerfile will be used to build our application. Then, we have
coded a method that take an **int** parameter and return the name of the week. To do that,
we used **expression switch** that is a feature of JAVA 12. Furthermore, we tried to
implement consises methods, that is a featur of JAVA 13, but we failed because of an error
of "enable-preview". We used it at compilation time but it didn't change something.

This is the code of the java file :

```java
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
```

Thanks to expression switch, we can directly return the value of a switch.