public class Main {
    public static void main(String[] args) {

        int totalAmount = 10_000;
        int rublesPerMile = 20;
        int bonusMiles = totalAmount / rublesPerMile;

        System.out.println("Итого начисленно бонусных миль: " + bonusMiles);
    }
}
// Итого начисленно бонусных миль: 500