public class DeliveryFabric {
    public static CargoTransportation deliveryFabric(int type){
        switch (type){
            case 1:
                return new PrivateCargoTransportation();
            case 2:
                return new CommericalCargoTransportation();
            default:
                throw new IllegalArgumentException("Неверный тип грузоперевозки");
        }
    }
}
