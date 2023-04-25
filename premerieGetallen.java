
public class premerieGetallen {

    public static void main(String[] args) {
        priemgetallen();
    }

    private static void priemgetallen() {
        for(int getal = 1; getal <= 100; getal++) {
            int aantalDelers = 0;
            for (int deler = 1; deler <= getal; deler++) {
                if (getal % deler == 0) {
                    aantalDelers++;
                }
            }
            if (aantalDelers == 2) {
                System.out.println(getal + " is een priemgetal");
            }
        }
    }
}
