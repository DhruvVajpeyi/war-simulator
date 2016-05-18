/**
 * Created by Dhruv on 5/17/2016.
 */
public class Board {
    private static BaseUnit[][] grid;

    public static void initialize(int length, int width){
        grid = new BaseUnit[length][width];
    }
}
