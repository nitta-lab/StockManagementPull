package resources;
import values.Item;
import values.ItemHandling;

import java.util.*;

public class Shipping {
	private Item value;

	public Shipping() {
	}

	public Item getValue() {
		return value;
	}
	
	public void updateHandling(ItemHandling handling) {
		this.value = new Item(handling.getName(), handling.getShippingNum());
	}
}