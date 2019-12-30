class Animal
{
	public	Animal(String name,	String type)
	{
		this.name	=	name;
		this.type	=	type;
	}

	String	name;
	String	type;

	public static void main(String[] args)
	{
		Animal animal =	new	Animal("Tommy",	"Dog");
		System.out.println(animal.getClass());
		System.out.println(animal);
		final int in = 7;


	}

}