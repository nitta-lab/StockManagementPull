package resources;
import values.Item;
import values.ItemHandling;

public class Shipping {
	//削除
	//Handling handling;
	
	//追加
	//private ItemHandling ItemHandling;
	public Item value;

//	public Shipping(Handling handling) {
	//		this.handling = handling;
	//	}
	
	public Shipping() {
		}

	
	//追加
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