package study.junit.quadratic_equation;
public class QuadraticEquation {
	private float a, b, c, x1, x2, delta;
	
	public QuadraticEquation(float a, float b, float c) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void setFactor(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	private int calculator() {
		delta = b*b - 4*a*c;
		if(a == 0) {
			return -1;
		}
		else if(delta < 0 ) {
			return 0;
		} 
		else if( delta == 0) {
			x1 = x2 = -b/2/a;
			return 1;
		}
		else{
			x1 = (float)(-b+Math.sqrt(delta))/2/a;
			x2 = -b/a - x1;
			return 2;
		}
	}
	
	public float getX1() {
		return x1;
	}
	
	public float getX2() {
		return x2;
	}
	
	public String result() {
		int result = calculator();
		if(result == -1) {
			return "Quadratic Equation Format Error";
		}
		else if (result == 0) {
			return "Quadratic Equation has no root";
		}
		else if (result == 1) {
			return String.format("Quadratic Equation has one double root: x1 = x2 = %.2f", x1);
		}
		else {
			return String.format("Quadratic Equation has two distinct roots: x1 = %.2f, x2 = %.2f", x1, x2);
		}
	}
}
