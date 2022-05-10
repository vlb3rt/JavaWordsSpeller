import java.util.Map;
import java.util.TreeMap;

public class MyApp {

    public static void main(String[] args) {

        for(String str: args) {
            String arg = str.toLowerCase();

            Map<String, Integer> map = new TreeMap<String, Integer>();

            for(int x=0;x<arg.length();x++) {
                map.merge(String.valueOf(arg.charAt(x)), 1, Integer::sum);
            }

            System.out.println("Counted letters for word: "+arg);
            map.forEach((sign, number) -> {
                System.out.println(sign+" = "+number);
            });
            System.out.println();
        }
    }
}
