package com.sun;

public class NestedCatch {

	public NestedCatch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int number[] = {1,2,3,4};
		for(int i =0;i<5;i++)
		{	
			try{

				try{
					System.out.println("Number is"+number[i]/0);
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("ArrayIndexOutOfBounds Exception caught");
				}

			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmatic Exception caught");
			}
		}


}
}
