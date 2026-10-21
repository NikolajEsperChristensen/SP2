abstract public class NetTitle extends Title  {
    private int availabillity;
    private int reach;
    private int use;

    public NetTitle(String literatureType, String title, int availabillity, int reach, int use) {
        super(literatureType, title);
        this.availabillity = availabillity;
        this.reach = reach;
        this.use = use;
    }

    @Override
    protected double calculatePoints() {
        return 0;
    }
}
