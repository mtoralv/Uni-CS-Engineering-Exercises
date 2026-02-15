import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        
        // List
        var namesList = new ArrayList<String>();

        namesList.add("Hamilton");
        namesList.add("Starman");

        System.out.println(namesList);
        System.out.println(namesList.get(1));

        // set an index position
        namesList.set(1, "Bowie");
        System.out.println(namesList.get(1));
        namesList.remove(0);
        System.out.println(namesList);

        //contains
        System.out.println(namesList.contains("Bowie"));
    }
    
}
