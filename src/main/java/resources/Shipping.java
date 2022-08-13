package resources;
import values.Item;
import values.ItemHandling;

import java.util.*;

public class Shipping {

	Item value;

	public Shipping() {
	}

	public void updateHandling(ItemHandling itemHandling) {
		this.value = new Item(itemHandling.getName(), itemHandling.getShippingNum());
	}

	public Item getValue() {
		return value;
	}
}