import java.util.concurrent.BlockingDeque;

public class Person {

	int hp;
	String name;
	
	public Person(int hp, String name)
	{
		super();
		this.hp = hp;
		this.name = name;
	}

	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void	takeDamage(int damage)
	{
		this.hp=this.hp-damage;
	}
	
	public void kick(Person p1)
	{
	  p1.takeDamage(2);
	}
	
	public void punch(Person p2)
	{
		p2.takeDamage(3);
	}
	
	public void dickPunch(Person p3)
	{
		p3.takeDamage(10);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [hp=" + hp + ", name=" + name + "]";
	}
	
}
