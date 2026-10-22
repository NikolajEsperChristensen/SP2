public class EBook extends NetTitle{
    private int characters;
    private boolean illlustrated;

    public EBook(String title, String literatureType, int availabillity, int reach, int use, int characters, boolean illlustrated) {
        super(title, literatureType, availabillity, reach, use);
        this.characters = characters;
        this.illlustrated = illlustrated;
    }

    private double calculatePages(){
        if (this.illlustrated){
            double calculatedPages = 0;
            calculatedPages = characters / 1800 +20;
            return calculatedPages*1.10;
        }
        double calculatedPages = 0;
        calculatedPages = characters / 1800 +20;
        return calculatedPages;
    }

    @Override
    protected double calculatePoints() {
        return this.calculatePages() * this.convertLiteratureType() * this.getPseudoCopies();

    }
}
