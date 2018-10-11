public class En4_1 {

	public static void main(String[] args) {
		Item ihone1 = new Item("0900010", "ihone", "apple", 100000);
		Item ihone2 = new Item("0900011", "ihone6s", "Microsoft", 100000);
		Item ihone3 = new Item("0900010", "ihonex", "apple", 100000);
		Item ihone4 = new Item("0900010", "hone", "apple", 100000);
		Item ihone5 = new Item("0900010", "ihone", "apple", 100000);
		Item ihone6 = new Item("0900010", "galaxy", "samsung", 100000);

		checkEquals(ihone1, ihone2);
		checkEquals(ihone1, ihone5);
		checkEquals(ihone6, ihone3);
		checkEquals(ihone6, ihone5);
		checkEquals(ihone2, ihone4);
		checkEquals(ihone1, ihone6);
	}

	public static void checkEquals(Item item1, Item item2) {
		if (item1.equals(item2)) {
			System.out.println(item1.getName() + "と" + item2.getName() + "は等しいです");
		} else {
			System.out.println(item1.getName() + "と" + item2.getName() + "は等しくありません");
		}
	}
}
