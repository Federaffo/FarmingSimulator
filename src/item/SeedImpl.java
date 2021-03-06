package item;

import java.util.*;

public class SeedImpl implements Seed {

    private final SeedType seedType;
    private SeedState state; /* guardo lo stato della mia pianta */
    private final long growTime; /* true= posso raccogliere, false = non raccoglibile */
    private final FoodType ofWhichFood; /* mi segno di quale cibo � il mio seme */

    // Transient lo uso per evitare che venga serializzato in Json quando salvo il
    // game
    private transient Timer timerPlant;

    public SeedImpl(final SeedType st) {
        this.seedType = st;
        this.state = SeedState.PLANTED;
        this.growTime = st.getGrowTime();
        this.ofWhichFood = st.getFoodType();
        Calendar scheduler = Calendar.getInstance();
        scheduler.add(Calendar.MILLISECOND, (int) this.growTime);
        timerPlant = new Timer();
        timerPlant.schedule(this.grower, scheduler.getTime());
    }

    private TimerTask grower = new TimerTask() {
        public void run() {
            grow();
        }
    };

    /**
     * {@inheritDoc}
     */
    public void grow() {
        this.state = SeedState.GROWN;
    }

    /**
     * {@inheritDoc}
     */
    public FoodType harvest() {
        this.state = SeedState.HARVESTED;
        return ofWhichFood;
    }

    /**
     * {@inheritDoc}
     */
    public SeedState getSeedState() {
        return this.state;
    }

    /**
     * {@inheritDoc}
     */
    public double getGrowTime() {
        return this.growTime;
    }

    /**
     * {@inheritDoc}
     */
    public FoodType getFoodType() {
        return this.ofWhichFood;
    }

    /**
     * {@inheritDoc}
     */
    public SeedType getSeedType() {
        return this.seedType;
    }

}
