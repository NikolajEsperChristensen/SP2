public class EAudioBook extends NetTitle implements IAudioBook {
    private int durationInMinutes;

    public EAudioBook(String title, String literatureType, int availabillity, int reach, int use, int durationInMinutes) {
        super(title, literatureType, availabillity, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        double calculatedPoints = 0;
        calculatedPoints = (durationInMinutes*0.5) *convertLiteratureType() *getPseudoCopies();
        return calculatedPoints;
    }

    @Override
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
