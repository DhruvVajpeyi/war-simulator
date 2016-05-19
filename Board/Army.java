import java.util.ArrayList;

/**
 * Created by Dhruv on 5/17/2016.
 */
public class Army {
    private ArrayList<Unit> units;

    public Army(int size){
        units = new ArrayList<>(size);
    }

    public int size(){
        return units.size();
    }

    public void insert(Unit newUnit){
        units.add(newUnit);
    }
}
