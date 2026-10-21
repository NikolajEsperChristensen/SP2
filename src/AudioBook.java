public class AudioBook extends PhysicalTitle implements IAudioBook {
    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes=durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        double points = 0;
        points = (getDurationInMinutes()*0.5) * convertLiteratureType() * copies;
        return points;
    }

    @Override
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
