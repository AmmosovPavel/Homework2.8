public class Shirts {
    public static void main(String[] args) {
        final int shirtPrice = 900;
        final int shirtsSelected = 6;
        final int shirtsForDiscount = 10;
        final int shirtsNeedToDiscount = shirtsForDiscount - shirtsSelected;
        final int shirtsSelectedCount = shirtPrice * shirtsSelected;
        final int countShirtsForDiscount = shirtsNeedToDiscount * shirtPrice;
        final double discount = 23.5;
        final double allShirtsPrice = shirtPrice * shirtsForDiscount - shirtsForDiscount * shirtPrice * discount / 100;
        final double oneShirtPrice = shirtPrice - shirtPrice * discount / 100;
        final double savedMoney = shirtPrice * shirtsForDiscount * discount / 100;
        final double freeShirts = savedMoney / shirtPrice;

        System.out.println("Стоимость одной рубашки без скидки " + shirtPrice + " рублей");
        System.out.println(shirtsSelected + " рубашек уже выбрано");
        System.out.println(shirtsForDiscount + " рубашек надо купить, чтобы получить скидку");
        System.out.println(shirtsNeedToDiscount + " рубашки надо докупить, чтобы получить скидку");
        System.out.println(shirtsSelectedCount + " рублей-стоимость выбранных рубашек");
        System.out.println(countShirtsForDiscount + " рублей-стоимость рубашек, которые надо докупить, чтобы получить скидку");
        System.out.println(discount + "% процент скидки");
        System.out.println(allShirtsPrice + "рублей- цена всех рубашек со скидкой");
        System.out.println(oneShirtPrice + "рублей-цена одной рубашки со скидкой");
        System.out.println(savedMoney + "рублей сэкономлено");
        System.out.println(freeShirts + "рубашки получено на халяву");
    }
}
