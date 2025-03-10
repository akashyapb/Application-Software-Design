// Subject.java
// interface for register : registering the observer to the ObserverList
// unregister: unregistering the boserver from the ObserverList
// notifyObserver: to notify all observers in the ObserverList

public interface Subject {

    public void register(Observer o);
    public void unRegister(Observer o);
    public void notifyObserver();

}