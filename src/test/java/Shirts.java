public class Shirts {
    public static void main(String[] args) {
        final int SHIRT_PRICE = 900;
        final int SHIRTS_SELECTED = 6;
        final int SHIRTS_FOR_DISCOUNT = 10;
        final int SHIRTS_NEED_TO_DISCOUNT = SHIRTS_FOR_DISCOUNT - SHIRTS_SELECTED;
        final int SHIRTS_SELECTED_COUNT = SHIRT_PRICE * SHIRTS_SELECTED;
        final int COUNT_SHIRTS_FOR_DISCOUNT = SHIRTS_NEED_TO_DISCOUNT * SHIRT_PRICE;
        final double DISCOUNT = 23.5;
        final double ALL_SHIRTS_PRICE = SHIRT_PRICE * SHIRTS_FOR_DISCOUNT - SHIRTS_FOR_DISCOUNT * SHIRT_PRICE * DISCOUNT / 100;
        final double ONE_SHIRT_PRICE = SHIRT_PRICE - SHIRT_PRICE * DISCOUNT / 100;
        final double SAVED_MONEY = SHIRT_PRICE * SHIRTS_FOR_DISCOUNT * DISCOUNT / 100;
        final double FREE_SHIRTS = SAVED_MONEY / SHIRT_PRICE;

        System.out.println("Стоимость одной рубашки без скидки " + SHIRT_PRICE + " рублей");
        System.out.println(SHIRTS_SELECTED + " рубашек уже выбрано");
        System.out.println(SHIRTS_FOR_DISCOUNT + " рубашек надо купить, чтобы получить скидку");
        System.out.println(SHIRTS_NEED_TO_DISCOUNT + " рубашки надо докупить, чтобы получить скидку");
        System.out.println(SHIRTS_SELECTED_COUNT + " рублей-стоимость выбранных рубашек");
        System.out.println(COUNT_SHIRTS_FOR_DISCOUNT + " рублей-стоимость рубашек, которые надо докупить, чтобы получить скидку");
        System.out.println(DISCOUNT + "% процент скидки");
        System.out.println(ALL_SHIRTS_PRICE + "рублей- цена всех рубашек со скидкой");
        System.out.println(ONE_SHIRT_PRICE + "рублей-цена одной рубашки со скидкой");
        System.out.println(SAVED_MONEY + "рублей сэкономлено");
        System.out.println(FREE_SHIRTS + "рубашки получено на халяву");
    }


}
