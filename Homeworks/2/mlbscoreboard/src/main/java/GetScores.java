// GetScores.java

//Lines after modification {
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//Lines after modification }


public class GetScores {

    private static final Random random = new Random();
    private static int updateCount = 0;

    public static void main(String args[])
    {
        ScoreGetter scoreGetter = new ScoreGetter();

        ScoreObserver observer1 = new ScoreObserver(scoreGetter);

        //Lines after modification {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleAtFixedRate(() -> updateScores(scoreGetter), 0, 2, TimeUnit.SECONDS); }

        private static void updateScores(ScoreGetter scoreGetter)
        {
            updateCount++;
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println("\n" + timestamp + " Update No." + updateCount + "\n");
            scoreGetter.setCubsScore(random.nextInt(10));
            scoreGetter.setSoxScore(random.nextInt(10));
            scoreGetter.setYankeesScore(random.nextInt(10));
            scoreGetter.setMetsScore(random.nextInt(10));
        }
        //Lines after modification }

        /*scoreGetter.setCubsScore(5);
        scoreGetter.setSoxScore(1);
        scoreGetter.setYankeesScore(4);
        scoreGetter.setMetsScore(4);

        ScoreObserver observer2 = new ScoreObserver(scoreGetter);
        scoreGetter.setCubsScore(7);

        scoreGetter.unRegister(observer1);

        scoreGetter.setMetsScore(8);*/
    }
    