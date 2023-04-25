public class Main {
    public static void main(String[] args) {
        Snack snack1 = new Snack(123,"Redbull", 2);
        Snack snack2 = new Snack(231,"Moster", 3);
        Snack snack3 = new Snack(323,"Cola", 2);

        snacksBeheer.addSnack(snack1);
        snacksBeheer.removeSnack(snack2);

        snacksBeheer.addSnack(snack3);

        System.out.println(snacksBeheer.getSnacksLijst());
    }
}
