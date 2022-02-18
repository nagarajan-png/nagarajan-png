package sompleOne;

public class SimpleOne {

	
	    
	public static void main (String ran[])
	{
		
		
		String one="abcasdfabcasdabcasdabc";
		String two="abc";
		int i=0;
		int count=0;
		
		int temp=0;
		System.out.println(one.indexOf(two, i) );
		//one.in
		System.out.println(one.indexOf(two, 100) );
		
		while ( one.indexOf(two, i) != -1 )
		{
			count++;
			temp=i;
			temp=one.indexOf(two, temp)+3;
			i=temp;
			
			//one.inde
			System.out.println("next serach position is  is "+i);
		}
		System.out.println("value is "+count);
	}
}
