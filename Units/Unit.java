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

    public Unit(float health, float minDamage, float maxDamage, int speed, int range){
        this.totalHealth = health;
        this.currentHealth = health;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.speed = speed;
        this.range = range;
    }

    public abstract void attack(Unit target);

    public abstract void move();

    public void hit(float damage){
        this.currentHealth = this.currentHealth - damage;
    }
}
