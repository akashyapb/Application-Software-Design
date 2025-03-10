// ScoreObserver which implements the interface Observer.


public class ScoreObserver implements Observer {

    // private variables for each team score
    private int cubsScore;
    private int soxScore;
    private int yankeesScore;
    private int metsScore;

    private Subject scoreGetter;

    private static int observerIDCnt = 0;

    private int observerID;


    // constructor
    public ScoreObserver(Subject scoreGetter)
    {
        this.scoreGetter = scoreGetter;
        this.observerID = ++observerIDCnt;
        System.out.println("New Observer created ID: " + this.observerID);
        scoreGetter.register(this);
    }

    // implementation of the interface Observer
    public void update(int cubsScore, int soxScore, int yankeesScore, int metsScore)
    {
        this.cubsScore = cubsScore;
        this.soxScore = soxScore;
        this.yankeesScore = yankeesScore;
        this.metsScore = metsScore;

        System.out.println("Observer ID " + observerID + "\nCubs: " + cubsScore +  " vs Sox: " + soxScore
        + "\nYankees: " + yankeesScore + " vs Mets: " + metsScore + "\n");
    }


}