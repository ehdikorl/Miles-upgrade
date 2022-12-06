public class BonusMilesService {
    public int calculate(int price) {
        int priceMile = 20;
        int miles = price / priceMile;
        return miles;
    }
}
