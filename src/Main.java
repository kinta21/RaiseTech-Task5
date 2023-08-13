import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarShop mazda = new CarShop("mazda", 1920);
        CarShop suzuki = new CarShop("suzuki", 1909);
        CarShop toyota = new CarShop("toyota", 1937);
        CarShop honda = new CarShop("honda", 1948);

        List<CarShop> carShops = List.of(mazda, suzuki, toyota, honda);

        System.out.println("<創業者の苗字つく日本車メーカー>");

        for (CarShop shop : carShops) {
            System.out.println(shop.getName());
            System.out.println(shop.getFounding() + "年創業");
        }

        System.out.println("<創業100年以上でaのつく自動車メーカー>");

        carShops.stream()
                .filter(carShop -> carShop.getFounding() <= 1923)
                .filter(carShop -> carShop.getName().contains("a"))
                .map(carShop -> carShop.getName().toUpperCase())
                .forEach(System.out::println);

    }
}

