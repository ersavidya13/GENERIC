import java.util.ArrayList;
import java.util.List;


public class ListName {
    List<String> names = new ArrayList<>();

    public ListName(){
        names.add("Ersa");
        names.add("Cia");
        names.add("Vidya");

        names.set(1, "Suka");
    }

    public void getInfo(){
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
    }
}