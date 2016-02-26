package base;

public class MyInteger {
	private int iValue;
	
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}
	public  int getiValue() {
		return iValue;
	}
	
	public boolean isEven() {
		if (iValue % 2 == 0)
				return true;
		else
			return false;
	}
	public boolean isOdd() {
		if (iValue % 2 != 0)
			return true;
		else
			return false;
	}
	public boolean isPrime() {
		for (int i=2; i*i<=iValue; i++)
			if (iValue % i == 0)
				return false;
		return true;
			
		}
	public boolean isEven(int n) {
		return isEven(n);
	}
	public boolean isOdd(int n) {
		return isOdd(n);
	}
	public boolean isPrime(int n) {
		return isPrime(n);
	}
	public boolean isEven(MyInteger i){
		return isEven(i);
	}
	public boolean isOdd(MyInteger i){
		return isOdd(i);
	}
	public boolean isPrime(MyInteger i){
		return isPrime(i);
	}
	
	public boolean equals(int x){
		if (iValue == x)
			return true;
		else
			return false;
	}
	public boolean equals(MyInteger n){
		return equals(n);
	}	
}