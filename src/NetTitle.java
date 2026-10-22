abstract public class NetTitle extends Title  {
    private int availabillity;
    private int reach;
    private int use;

    public NetTitle(String title, String literatureType, int availabillity, int reach, int use) {
        super(title, literatureType);
        this.availabillity = availabillity;
        this.reach = reach;
        this.use = use;
    }

    public double getPseudoCopies(){
        return (reach *5) + (availabillity *0.5) + this.getUseFactor();

    }

    private int getUseFactor(){
        return use;

    }
}
