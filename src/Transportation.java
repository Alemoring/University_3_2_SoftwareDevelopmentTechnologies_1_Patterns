public abstract class Transportation {
    protected String street;
    public Transportation(String street){
        this.street = street;
    }
    abstract Cargo makeDelivery();
    abstract String deliver();
}
