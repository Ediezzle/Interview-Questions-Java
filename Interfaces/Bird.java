class Bird implements Flyable
{
	public void fly()
	{
		System.out.println("With natural wings");
	}

	public void altitude()
	{
		System.out.println("Above ground but mostly below planes");
	}

	public static void main(String[] args)
	{
		Bird b = new Bird();
		b.speed();

		Flyable f = new Bird();
	}
}