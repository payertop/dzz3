public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int amount = 20;
        int price = 10_000;
        int miles = service.calculate(price / amount);
        System.out.println(miles);
    }
}