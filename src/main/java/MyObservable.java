public interface MyObservable {

    public void register(Observer describer);

    public void unregister(Observer describer);
    public void inform();

}
