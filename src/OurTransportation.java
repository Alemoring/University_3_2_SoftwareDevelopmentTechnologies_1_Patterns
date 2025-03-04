public class OurTransportation extends Transportation{
    public OurTransportation(String street) {
        super(street);
    }

    @Override
    Cargo makeDelivery() {
        if (super.street.charAt(0) == 'л'){
            return new PrivateCargo();
        }else {
            return new CommericalCargo();
        }
    }

    @Override
    String deliver() {
        return "Была осуществлена своя грузоперевозка «" + super.street + "».";
    }
}
