package study.junit.triangle;

public class Triangle {
	private float a, b, c;

	public Triangle(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	boolean checkTriangle() {
		if (a > 0 && b > 0 && c > 0)
			if (a + b > c && a + c > b && b + c > a )
				return true;
		return false;
	}

	boolean checkCan() {
		if (checkTriangle()) {
			if (a == b  || b == c || c == a)
				return true;
		}
		return false;
	}

	boolean checkDeu() {
		if (checkTriangle()) {
			if (a == b && b == c)
				return true;
		}
		return false;
	}

	boolean checkVuong() {
		if (a * a == b * b + c * c || b * b == a * a + c * c
				|| c * c == a * a + b * b)
			return true;
		return false;
	}

	public String result() {
		if (!checkTriangle()) {
			return "Khong phai tam giac";
		} else {
			if (checkCan()) {
				if (checkVuong()) {
					return "Tam giac vuong can";
				} else if (checkDeu()) {
					return "Tam giac deu";
				}
				else{
					return "Tam giac can";
				}
			
			} 
			else if(checkVuong()) {
				return "Tam giac vuong";
			}
			else {
				return "Tam giac thuong";
			}
		}
	}

}
