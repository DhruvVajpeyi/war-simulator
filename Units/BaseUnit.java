/**
 * Created by Dhruv on 5/17/2016.
 */
public abstract class BaseUnit {
    private float totalHealth;
    private float currentHealth;
    private float damage;
    private int speed;
    private int range;

    public BaseUnit(float health, float damage, int speed, int range){
        this.totalHealth = health;
        this.currentHealth = health;
        this.damage = damage;
        this.speed = speed;
        this.range = range;
    }

    public abstract void attack(BaseUnit target);

    public abstract void move();

    public void hit(float damage){
        this.currentHealth = this.currentHealth - damage;
    }
}
