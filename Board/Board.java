import javafx.util.Pair;

import java.util.Random;

/**
 * Created by Dhruv on 5/17/2016.
 */
public class Board {
    private static Unit[][] grid;

    public static Pair<Army, Army> initialize(int length, int width){
        grid = new Unit[length][width];
        int armySize = length*width/5;

        Army army1 = new Army(armySize);
        Army army2 = new Army(armySize);

        populate(army1, armySize);
        populate(army2, armySize);

        return new Pair<>(army1, army2);
    }

    private static void populate(Army army, int size){
        Random rand = new Random();
        int x;
        int y;
        for(int i=0; i<size; i++){
            Unit newUnit = Unit.getRandomUnit();
            army.insert(newUnit);
            do{
                x = rand.nextInt(grid.length);
                y = rand.nextInt(grid[0].length);
            }while(grid[x][y] != null);

            grid[x][y] = newUnit;
            newUnit.setStartPosition(x, y);
        }
    }
}
