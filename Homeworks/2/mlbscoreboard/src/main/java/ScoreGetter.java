// ScoreGetter
// implementation of Subject interface
// register, unregister, notifyobservers to all available observerlists

import java.util.ArrayList;

public class ScoreGetter implements Subject{

    private ArrayList<Observer> observers;
    private int cubsScore;
    private int soxScore;
    private int yankeesScore;
    private int metsScore;

    public ScoreGetter()
    {
        // create an arraylist of observers --> initialize the ArrayList

        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObserver)
    {
        // add a new observer to the ArrayList
        observers.add(newObserver);
    }

    public void unRegister(Observer deletObserver)
    {
        // get the index of the observer for deletion, and remove it from the arraylist
        int observerIndex = observers.indexOf(deletObserver);
        observers.remove(observerIndex);
        int realID = observerIndex + 1;
        System.out.println("Observer ID: " + realID + " has been deleted from the list\n");
    }

    public void notifyObserver()
    {
        for(Observer observer: observers)
            observer.update(cubsScore, soxScore, yankeesScore, metsScore);
    }

    // setters for each team score

    public void setCubsScore(int cubsScore)
    {
        this.cubsScore = cubsScore;
        notifyObserver();
    }

    public void setSoxScore(int SoxScore)
    {
        this.soxScore = SoxScore;
        notifyObserver();
    }

    public void setYankeesScore(int yankeesScore)
    {
        this.yankeesScore = yankeesScore;
        notifyObserver();
    }

    public void setMetsScore(int metsScore)
    {
        this.metsScore = metsScore;
        notifyObserver();
    }
    



}