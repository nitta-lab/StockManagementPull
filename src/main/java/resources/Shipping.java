package resources;
import values.Item;
import values.ItemHandling;

public class Shipping {
	private Item value;
	
	public void updateHandling(ItemHandling handling) {
		this.value = new Item(handling.getName(), handling.getShippingNum());
	}

	public Item getValue() {
		return this.value;
	}
}