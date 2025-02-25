import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeliveryFabric fabric = new DeliveryFabric();
        CargoTransportation transportation;
        Delivery delivery;

        System.out.println("Выберите тип грузоперевозки:");
        System.out.println("1. Частная");
        System.out.println("2. Коммерческая");
        System.out.print(">> ");

        int type = 0;

        Scanner scanner = new Scanner(System.in);
        boolean correct = false;
        while (!correct){
            try {
                scanner = new Scanner(System.in);
                type = scanner.nextInt();
                scanner.nextLine();
                if (type == 1 || type == 2)
                    correct = true;
                else{
                    throw new IllegalArgumentException("Неверный тип грузоперевозки");
                }
            }catch (Exception e){
                System.out.println("Введён неверный тип грузоперевозки, пожалуйста, повторите попытку: ");
            }
        }

        transportation = DeliveryFabric.deliveryFabric(type);
        delivery = transportation.makeDelivery();

        System.out.println("Введите адреса отправления/назначения:");
        System.out.print(">> ");

        String street = scanner.nextLine();

        System.out.println(delivery.deliver(street));
    }
}