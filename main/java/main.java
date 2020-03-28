import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        Map<Integer, String> wuTangMembers = new HashMap<>();
        wuTangMembers.put(1,"Rza");
        wuTangMembers.put(2, "Gza");
        wuTangMembers.put(3, "Ghostface Killa");
//        wuTangMembers.clear();
//        System.out.println(wuTangMembers.size());

/*TreeMaps*/
       // Map<Integer, String > migosMembers = new TreeMap<>();
//        migosMembers.put(1, "Offset");
//        migosMembers.put(2, "Takeoff");
//        migosMembers.put(3, "Quavo");
        //System.out.println(migosMembers.remove(1,"Offset"));
for(Map.Entry<Integer, String> entry: wuTangMembers.entrySet()){
    System.out.println(entry);
}
//loop through values
for(Integer x: wuTangMembers.keySet()){
            System.out.println(x);
        }
//loop through values
//        for(String x: wuTangMembers.values()){
//            System.out.println(x);
//        }
//iteratorObject loops prints out keys and values
//        Iterator<Map.Entry<Integer,String>> iterate1 = wuTangMembers.entrySet().iterator();
//        while( iterate1.hasNext()){
//            System.out.println(iterate1.next());
//        }
        Iterator<Integer> iterateKeys = wuTangMembers.keySet().iterator();
        while(iterateKeys.hasNext()){
            System.out.println(iterateKeys.next());
        }
        Iterator<String> iterateValues = wuTangMembers.values().iterator();
        while(iterateValues.hasNext()){
            System.out.println(iterateValues.next());
        }

    }
}
