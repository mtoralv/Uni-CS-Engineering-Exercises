
public class functiontest {

    public static void main(String[] args) {
        
        String name = "Alexander";

        // String length
        System.out.println(name.length()); // 9

        // String char at position
        System.out.println(name.charAt(3)); // x

        // get substring
        System.out.println(name.substring(0, 4)); // Alex

        // Upper and lower case
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // Contains
        System.out.println(name.contains("Alex"));

        // Compare
        System.out.println(name.equals("Alexander"));
        System.out.println(name.equalsIgnoreCase("alexander"));

        //Trim
        System.out.println(name.trim());

        // replace
        System.out.println(name.replace( "a","4"));
    
    }
}
