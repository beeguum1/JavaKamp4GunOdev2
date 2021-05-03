package cafeDemo;

public class BaseCustomerManager implements CustomerService  {

	@Override
	public void save(Customer customer) {
		System.out.println(customer.getFirstName()+" "+ customer.getLastName()+" adlý müþteri veri tabanýna kaydedildi.");
		
	}

}
