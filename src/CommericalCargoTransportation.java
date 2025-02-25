public class CommericalCargoTransportation extends CargoTransportation{
    @Override
    Delivery makeDelivery() {
        return new CommericalDelivery();
    }
}
