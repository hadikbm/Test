package h1;

public class H1_main {

	public static void main(String[] args) {
		
double guthaben, monEingang;
int rating;
boolean warnhinweis = false, negativ = false;
guthaben = -100;
monEingang = 200;
rating = -2;

if (guthaben < 0) {
	negativ = true;
}
else if (guthaben >= 0) {
	negativ = false;
}
if (guthaben > 0 ) {
	rating = rating + 3;
}
if (guthaben == 0) {
	rating = rating + 2;
}
if (guthaben < 0 && Math.abs(monEingang) >= Math.abs(guthaben) ) {
	rating = rating + 1;
}
if (guthaben < 0 && Math.abs(monEingang) < Math.abs(guthaben) ) {
	rating = rating - 1;
}
if (guthaben < 0 && Math.abs(monEingang) < Math.abs(guthaben) && rating < 0 ) {
	warnhinweis = true;
}
	else if(guthaben >= 0 && Math.abs(monEingang) >= Math.abs(guthaben) && rating >= 0)  {
		warnhinweis = false;
	}
	
System.out.println("Bewertung:");
System.out.println(rating);
System.out.println("Wahrnhinweis?");
System.out.println(warnhinweis);
System.out.println("Negatives Guthaben?");
System.out.println(negativ);
	}

}
