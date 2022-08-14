package resources;
import values.Item;
import values.ItemHandling;

public class Shipping {
	//5.Shipping クラスのフィールド handling を削除する．
//	Handling handling;

	//7.Shipping クラスに出庫指示の内容を保存するためのフィールド Item value を追加する．
	Item value;
	//4.hipping クラスのコンストラクタを，Handling クラスのインスタンスを引数に取らないように書き換える．
//	public Shipping(Handling handling) {
//		this.handling = handling;
//	}
	public Shipping() {
	}


	public Item getValue() {
		//11.Shipping クラスの getValue() メソッドを value フィールドの値を返すように書き換える．
//		return new Item(handling.getValue().getName(), handling.getValue().getShippingNum());
		return value;
	}
	
	//8.Shipping クラスに void updateHandling(ItemHandling handling) メソッドを追加する．
	void updateHandling(ItemHandling handling) {
		//10.Shipping クラスの getValue() メソッド内で行っていた，ユーザの入力に対する処理内容(ItemHandling)をもとに出庫指示の内容(Item)を作成する処理を，updateHandling() メソッドに移動し，出庫指示の内容を value フィールドに保存するようにする．
		value = new Item(handling.getName(), handling.getShippingNum());
	}
}