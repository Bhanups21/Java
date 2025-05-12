import java.util.Objects;

class EqualsCustomer {
 private int customerId;
 private String name;
 private String phone;
 
 public EqualsCustomer(int id, String name, String phone) {
     //code here
	 this.customerId = id;
	 this.name = name;
	 this.phone = phone;
 }
 @Override
 public String toString() {
	//Output should be in given format
	 return ("Customer-"+name+"with ID-"+customerId);
 }
  // code equals and hashCode here
 
  public static void main(String[] args) {
     EqualsCustomer c1 = new EqualsCustomer(105, "Max", "8574637281");
     EqualsCustomer c2 = new EqualsCustomer(109, "Nick", "9453281756");
     EqualsCustomer c3 = new EqualsCustomer(109, "Nick", "9453281756");
     System.out.println(c1.equals(c2));
     System.out.println(c1.equals(c3));
     System.out.println(c2.equals(c3));
     System.out.println(c1.toString());
     System.out.println(c2.toString());
     System.out.println(c3.toString());
     
 }

@Override
public int hashCode() {
	return Objects.hash(customerId, name, phone);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	EqualsCustomer other = (EqualsCustomer) obj;
	return customerId == other.customerId && Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
}
}