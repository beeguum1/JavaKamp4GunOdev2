package cafeDemo;

public class BaseCustomerManager implements CustomerService  {

	@Override
	public void save(Customer customer) {
		System.out.println(customer.getFirstName()+" "+ customer.getLastName()+" adl� m��teri veri taban�na kaydedildi.");
		
	}

}
