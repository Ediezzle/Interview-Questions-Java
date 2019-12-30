interface Flyable
{
	 void fly();

	 void altitude();

	 default void speed()
	 {
		 System.out.println("Above 1km/he");
	 }

}