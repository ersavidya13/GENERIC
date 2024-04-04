import java.util.HashSet;
import java.util.Set;

public class Hashet {
    Set<String> names = new HashSet<>();

    public Hashet(){
        names.add("Ersa");
        names.add("Cia");
        names.add("Vidya");
    }

    public void getInfo(){
        for(String name : names){
            System.out.println(name);
        }
    }
}