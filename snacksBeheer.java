import java.util.ArrayList;

public class snacksBeheer {
    private static ArrayList<Snack> snacksLijst = new ArrayList<>();

    public snacksBeheer() {
    }

    public static ArrayList<Snack> getSnacksLijst() {
        return snacksLijst;
    }

    public static void addSnack(Snack newSnack) {
        snacksLijst.add(newSnack);
    }

    public static void removeSnack(Snack newSnack) {
        snacksLijst.remove(newSnack);
    }
}
