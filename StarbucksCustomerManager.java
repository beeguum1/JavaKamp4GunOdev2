package cafeDemo;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	public void save(Customer customer) {
		if (CustomerCheckService.checkIfRealPerson(customer)==true) {
			super.save(customer);
		}
		else
				System.out.println("Ge�erli bir ki�i de�il.");	
	}
	
	

}
