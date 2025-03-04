public class DeliveryFabric {
    public static Transportation deliveryFabric(int type, String street){
        switch (type){
            case 1:
                return new PrivateTransportation(street);
            case 2:
                return new CommericalTransportation(street);
            case 3:
                return new OurTransportation(street);
            default:
                throw new IllegalArgumentException("Неверный тип грузоперевозки");
        }
    }
}
