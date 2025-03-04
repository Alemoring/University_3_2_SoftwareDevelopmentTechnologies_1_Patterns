public class PrivateTransportation extends Transportation {
    public PrivateTransportation(String street) {
        super(street);
    }

    @Override
    Cargo makeDelivery() {
        return new PrivateCargo();
    }

    @Override
    String deliver() {
        return "Была осуществлена частная грузоперевозка «" + super.street + "».";
    }
}
