public class EAudioBook extends NetTitle implements IAudioBook {
    private int durationInMinutes;

    public EAudioBook(String literatureType, String title, int availabillity, int reach, int use, int durationInMinutes) {
        super(literatureType, title, availabillity, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        return super.calculatePoints();
    }

    @Override
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
