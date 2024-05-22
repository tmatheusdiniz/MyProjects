package learning.basic;

public class StaticClass {

	public double wid;
	public double heig;

	public String calculator(double x, double z) {

		int f, y;

		f = (int)x;
		y = (int)z;

		return  "AREA= "+(f * y)+ 
				" PERIMETER = " + (2*f + 2*y) + 
				" DIAGONAL = " + Math.sqrt(f*f + y*y);   

	}
}
