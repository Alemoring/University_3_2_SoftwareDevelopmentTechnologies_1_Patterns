public class CommericalTransportation extends Transportation {
    public CommericalTransportation(String street) {
        super(street);
    }

    @Override
    Cargo makeDelivery() {
        return new CommericalCargo();
    }

    @Override
    String deliver() {
        return "Была осуществлена коммерческая грузоперевозка «" + super.street + "».";
    }
}
