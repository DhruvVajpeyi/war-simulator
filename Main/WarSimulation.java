import javafx.util.Pair;

/**
 * Created by Dhruv on 5/18/2016.
 */
public class WarSimulation {
    public static void main(String[] args){
        Pair<Army, Army> armies = Board.initialize(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    }
}
