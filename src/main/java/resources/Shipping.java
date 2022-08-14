package resources;
import values.Item;
import values.ItemHandling;

import java.util.*;

public class Shipping {
//	Handling handling;
	Item value;

//	public Shipping(Handling handling) {
//		this.handling = handling;
//	}

	public Shipping() {}

	void updateHandling(ItemHandling handling){
		this.value =  new Item(handling.getName(), handling.getShippingNum());
	}

	public Item getValue() {
//		return new Item(handling.getValue().getName(), handling.getValue().getShippingNum());
		return this.value;
	}
}