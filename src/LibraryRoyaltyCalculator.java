public class LibraryRoyaltyCalculator {
    static void main(String[] args) {

        Author Jim = new Author("Jim");
        Title timCook = new PrintedBook("timcook", "TE", 100, 200);
        Title jimcook = new PrintedBook("jimcook", "TE", 110, 220);
        Title bimcook = new PrintedBook("bimcook", "TE", 130, 250);


        Jim.addTitle(timCook);
        Jim.addTitle(jimcook);
        Jim.addTitle(bimcook);


        //Jim.calculateRoyalties();



        Title lydbog = new EBook("mincook", "FAG", 97, 50, 205, 360000, false);


        System.out.println(lydbog.calculatePoints());
        System.out.println(lydbog.calculateRoyalty());




    }

}
