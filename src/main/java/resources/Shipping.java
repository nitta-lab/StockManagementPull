package resources;
import values.Item;
import values.ItemHandling;

import java.util.*;

public class Shipping {
	Item value;
	
	void updateHandling (ItemHandling handling) {
		value = new Item(handling.getName(), handling.getShippingNum());
	}

	public Shipping() {
	}

	public Item getValue() {
		return value;
	}

}