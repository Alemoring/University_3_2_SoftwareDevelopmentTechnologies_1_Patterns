public class CommericalDelivery implements Delivery{
    @Override
    public String deliver(String street) {
        return "Была осуществлена коммерческая грузоперевозка «" + street + "»";
    }
}
