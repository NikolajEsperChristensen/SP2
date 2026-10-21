public abstract class Title {
    private String title;
    private String literatureType;
    protected double rate(){
        return 0;
    }


    public Title(String literatureType, String title) {
        this.literatureType = literatureType;
        this.title = title;
    }

    public double calculateRoyalty(){
        return 0;

    }
    protected abstract double calculatePoints();

    protected double convertLiteratureType(){
        return 0;

    }



}