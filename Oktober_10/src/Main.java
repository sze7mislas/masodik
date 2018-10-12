public class Main {

	public static void main(String[] args)
	{
		// első feladat elkészültdsf
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		// 2.feladat
		for (int i = 1; i < 20; i++)
			if (i % 2 == 0)
			{
				System.out.println(i);
			}
		//3.feladat
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);	
		
		for (int i = a; i < b; i++)
			if (i % 3 == 0)
			{
				System.out.println(i);
			}
		// 4.feladat
		int c=Integer.parseInt(args[2]);
		for(int i = 0;i<c;i++)
		{
		if (c % i == 0)
			{
			System.out.println(i);
			} 
		
		else 
			{
				System.out.println("Prímszám");
			}
		}
		
		
	}
}
