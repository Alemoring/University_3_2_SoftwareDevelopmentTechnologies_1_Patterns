public class PrivateDelivery implements Delivery {
    @Override
    public String deliver(String street) {
        return "Была осуществлена частная грузоперевозка «" + street + "»";
    }
}
