import java.util.ArrayList;

public class Auther {
    private String name;
    private ArrayList<Title> titles;

    public Auther(String name, ArrayList<Title> titles) {
        this.name = name;
        this.titles = titles;
    }

    public void addTitle(Title title){
        titles.add(title);

    }
    public void calculateRoyalties(){

    }
}

