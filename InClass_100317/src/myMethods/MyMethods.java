package myMethods;

public class MyMethods {
	
	public static void main(String[] args){
	System.out.println("This is a method.");
	
	// call method
	int answer;
	answer = Cube(42); // The 'Call' or invocation
	System.out.println("42 cubed is "+ answer);
	}
	//Methods go outside the main and inside the class 
	public static int Cube(int number){
		
		int result;
		result = number*number*number;
		return result;
		
	}

	public static Boolean isHead(int num){
		
		Boolean head = false;
	
		if(num == 1)
		{
			head = true;
			
		}
		else
		{
			head = false;
		}
		return head;
	}
	
	/*
	 public boolean posNeg(int a, int b, boolean negative) {

  if (negative == true)
  {
    if (a < 0 && b < 0)
    {
      negative = true;
      return negative;
    }
    else
    {
      negative = false;
      return negative;
    }
  }
  else
  {
    if (a > 0 && b < 0)
    {
      negative = true;
      return negative;
    }
    else if (a < 0 && b > 0)
    {
      negative = true;
      return negative;
    }
    else
    {
      negative = false;
      return negative;
    }
  }
  
}  
	 */
	
	
	
	
	
	
	
}
