public class EBook extends NetTitle{
    private int characters;
    private boolean illlustrated;

    public EBook(String literatureType, String title, int availabillity, int reach, int use, int characters, boolean illlustrated) {
        super(literatureType, title, availabillity, reach, use);
        this.characters = characters;
        this.illlustrated = illlustrated;
    }
    private double calculatePages(){
        return 0;
    }

    @Override
    protected double calculatePoints() {
        return super.calculatePoints();
    }
}
