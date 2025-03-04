public class DeliveryFabric {
    public static Transportation deliveryFabric(int type, String street){
        return switch (type) {
            case 1 -> new PrivateTransportation(street);
            case 2 -> new CommericalTransportation(street);
            case 3 -> new OurTransportation(street);
            default -> throw new IllegalArgumentException("Неверный тип грузоперевозки");
        };
    }
}
