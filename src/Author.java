import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(Title title){
        titles.add(title);

    }
    public void calculateRoyalties(){
        double totalRoyalties = 0;
        for (Title t: titles) {
            totalRoyalties += t.calculateRoyalty();

        }
        System.out.println("total royalties are " + totalRoyalties);

    }
}

