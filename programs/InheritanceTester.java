
public class InheritanceTester {

	public static void main(String[] args) {
		PermanentEmployee e1=new PermanentEmployee(101,"Anil",10000,1500,3);
		e1.calculateSalary();
		ContractEmployee e2=new ContractEmployee(102,"Ankit",500,10);
		e2.calculateSalary();
	}

}
