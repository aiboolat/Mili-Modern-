public class BonusMilesService {

    public int calculate (int price) {
        if (price > 19) {
            return price / 20;
        } else {
            return 0;
        }
    }
}
