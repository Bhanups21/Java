
public class QuadraticEquation {
	private int a,b,c;
	public QuadraticEquation(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public int checkDescrimnant() {
		return (this.b*this.b)-(4*this.a*this.c);
	}
	public void findRoots() {
		double root1,root2;
		if(this.checkDescrimnant()>0) {
			root1=((double)(-1*b)+(int)Math.sqrt(this.checkDescrimnant()))/(2*a);
			root2=((double)(-1*b)-(int)Math.sqrt(this.checkDescrimnant()))/(2*a);
			System.out.println(root1+" "+root2+" are the roots of the equation.");
		}
		else if(this.checkDescrimnant()==0) {
			root1=((-1*b)+(int)Math.sqrt(this.checkDescrimnant()))/(2*a);
			System.out.println(root1+" is the root of the equation.");
		}
		else {
			System.out.println("There are no roots for the equation.");
		}
	}

	public static void main(String[] args) {
		QuadraticEquation q=new QuadraticEquation(1,4,6);
		q.findRoots();
	}

}
