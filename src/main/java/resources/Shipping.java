package resources;
import values.Item;
import values.ItemHandling;

public class Shipping {
	//çÌèú
	//Handling handling;
	
	//í«â¡
	//private ItemHandling ItemHandling;
	public Item value;

//	public Shipping(Handling handling) {
	//		this.handling = handling;
	//	}
	
	public Shipping() {
		}

	
	//í«â¡
	void updateHandling(ItemHandling ItemHandling) {
		//value = new Item(this.getValue().getName(), this.getValue().getNum());
		value =  new Item(ItemHandling.getName(),ItemHandling.getShippingNum());
//		return new Item(handling.getValue().getName(), handling.getValue().getShippingNum());
	}
	
	public Item getValue() {
		//return new Item(handling.getValue().getName(), handling.getValue().getShippingNum());
		return value;
	}

}