// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    //System.out.println(plus(-5,-5));   // 2 + 3
	    //System.out.println(minus(-7,-2));  // 7 - 2
   		//System.out.println(minus(2,7));  // 2 - 7
 			//System.out.println(times(-3,-4));  // 3 * 4
   		//System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		//System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(-3,4));      // 3^5
   		//System.out.println(div(12,3));   // 12 / 3    
   		//System.out.println(div(-10,2));    // 5 / 5  
   		//System.out.println(div(25,7));   // 25 / 7
   		//System.out.println(mod(25,7));   // 25 % 7
   		//System.out.println(mod(120,6));  // 120 % 6    
   		//System.out.println(sqrt(36));
			//System.out.println(sqrt(263169));
   		//System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		// Replace the following statement with your code
		if (x2<0) 
		{
			for(int i=x2;i<0;i++)
			{
				x1--;
			}
		}
		else
		{
			for(int i=1;i<=x2;i++)
			{
				x1++;
			}
		}
		return x1;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		if (x2<0) {
			for(int i=x2;i<0;i++)
			{
				x1--;
			}
		}
		for(int i=1;i<=x2;i++)
		{
			x1--;
		}
		return x1;
	}

	//finsih
	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int xreturn=x1;
		if (x1==0 || x2==0) {
			return 0;
		}
		if (x2>0&&x1>0) 
		{
			for(int i=1;i<x2;i++)
			{
				xreturn=plus(xreturn,x1);
			}	
			return xreturn;
		}
		if (x1>0&&x2<0) 
		{
			xreturn=0;
			for(int i=1;i<=x1;i++)
			{
				xreturn=minus(xreturn,x2);
			}	
			return xreturn;
		}
		if (x2>0&&x1<0) 
		{
			xreturn=0;
			for(int i=1;i<=x2;i++)
			{
				xreturn=minus(xreturn,x1);
			}	
			return xreturn;
		}
		if (x2<0&&x1<0) 
		{
			xreturn=0;
			for(int i=x2;i<0;i++)
			{
				
				xreturn=plus(xreturn,x1);
				
			}	
		}
		if (xreturn<0);
		{
			int newr=0;
			for(int i=xreturn;i<0;i++)
			{
				newr++;
			}	
			return newr;
		}
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int start=x;
		if (x==0) {
			return 0;
		}
		for(int i=1;i<n;i++)
		{
			start=times(start, x);
			
			
		}
		return start;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		int count=0;
		if (x1<0&&x2>0)
		 {
			while (x1 <0) 
			{
    	x1 = plus(x1, x2);//x1 returns
		
    	count++;
			}
		
		}
		else
		{
			if (x2<0&&x1>0)
		 	{
				while (x1 >0) 
				{
				
					x1 = plus(x1, x2);//x1 returns
					
					count++;
				}		
				
			}
			else
			{
				if (x1<0&&x2<0) {
					int newx1=0;
					while (x1<0) {
						x1++;
						newx1++;
					}
				while (newx1 >0) 
				{
					
					newx1 = plus(newx1, x2);//x1 returns
					
					count++;
				}	
					
				}
				else
				{
						while (x1 >= x2) {
				x1 = minus(x1, x2);
				count++;
				}
				}
			}	
		}
		return count;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		if (x1==0||x2==0) {
			return 0;
		}
		while (x1 >= x2) {
    x1 = minus(x1, x2);
		}
		return x1;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		int i=0;
		if (x==0)
		{
			return 0;	
		}
		for( i=1;x!=pow(i, 2);i++)
		{

		}
		return i;
	}	  	  
}