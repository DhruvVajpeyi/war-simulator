import java.util.Random;

/**
 * Created by Dhruv on 5/17/2016.
 */
public abstract class Unit {
    private float totalHealth;
    private float currentHealth;
    private float minDamage;
    private float maxDamage;
    private int speed;
    private int range;
    private int x;
    private int y;

    public Unit(float health, float minDamage, float maxDamage, int speed, int range){
        this.totalHealth = health;
        this.currentHealth = health;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.speed = speed;
        this.range = range;
        this.x = -1;
        this.y = -1;
    }

    public abstract void attack(Unit target);

    public abstract void move();

    public void hit(float damage){
        this.currentHealth = this.currentHealth - damage;
    }

    public void setStartPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static Unit getRandomUnit(){
        Random rand = new Random();
        switch(rand.nextInt(3)){
            case 0: return new Archer();

            case 1: return new FootSoldier();

            case 2: return new Cavalry();

            default: return null;
        }
    }
}
