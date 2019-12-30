import java.util.*;

public class InterviewQuestions1
{
	public static void main(String[] args)
	{
		Integer i = new Integer(21);
		int integer = 3;
		String s = "s";
		System.out.println(i+integer+(s));
		System.out.println(Integer.valueOf(integer));

		System.out.println("abcdefghij".substring(3));
		System.out.println("abcdefghij".substring(3, 7));
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(0,1);
		al.add("eddie");
		System.out.println(al instanceof ArrayList);
		System.out.println(al.get(0) instanceof Integer);
		System.out.println(al.get(1) instanceof String);

		String[] sa = {"one", "two"};
		System.out.println(sa[0]);
	}
}