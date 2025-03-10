//interface for Observer
// update() : this is going to provide updated scores of the teams that is listed for this app.


public interface Observer {

    public void update(int cubsScore, int soxScore, int yankeesScore, int metsScore);
    
}
