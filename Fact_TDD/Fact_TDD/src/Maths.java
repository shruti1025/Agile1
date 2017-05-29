
public class Maths {

	public int getFact(int num)
	{
		if(num<0)
		{
			throw new IllegalArgumentException();
		}
		if(num==0)
		{
			return 1;
		}
		
		return 1;
	
		int result = 1;
		
		if(num>0)
		{
			for (int i = 1; i <= num; i++)
                result = result * i;
        }

        
	
	return result;
}
		
}



