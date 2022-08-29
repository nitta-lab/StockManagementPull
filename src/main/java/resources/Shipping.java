package resources;
import values.Item;
import values.ItemHandling;

public class Shipping {
	private Item value;

	public Shipping() {
	}

	public Item getValue() {
		return this.value;
	}
	
	void updateHandling(ItemHandling handling) {
		value = new Item(handling.getName(), handling.getShippingNum());
	}
}