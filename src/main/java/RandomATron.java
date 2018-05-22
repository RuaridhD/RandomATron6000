import java.util.ArrayList;
import java.util.Collections;

public class RandomATron {

    private ArrayList<String> names;
    private ArrayList<String> twoNames;

    public RandomATron() {
        this.names = new ArrayList<>();
        names.add("Ruaridh");
        names.add("Chris");
        names.add("Nikhil");
        names.add("Callum");
        names.add("Fraser");
        names.add("Roberto");
        names.add("Connor");
        names.add("Lyle");
        names.add("Kelsie");
        names.add("Scott");
        names.add("Ed");
        names.add("Liam");
        names.add("Brian");
        names.add("Paul");
        names.add("Patrick");
        names.add("Andrew");
        names.add("Stuart");
        names.add("Sarah");
        names.add("Daniel");



    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public String randomiseNamesPickOne(){
        Collections.shuffle(names);
        return names.get(0);
    }

    public ArrayList<String> randomiseNamesPickTwo(){
        Collections.shuffle(names);
        twoNames = new ArrayList<>();
        twoNames.add(names.get(0));
        twoNames.add(names.get(1));
        return twoNames;
    }


}
