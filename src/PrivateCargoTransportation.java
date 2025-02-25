public class PrivateCargoTransportation extends CargoTransportation{
    @Override
    Delivery makeDelivery() {
        return new PrivateDelivery();
    }
}
