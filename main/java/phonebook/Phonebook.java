package phonebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Phonebook {
    private Map<String, String> phoneRecords = new HashMap<>();

    public void addPhoneRecord(String key, String value){
        phoneRecords.put(key, value);
    }
    public void removePhoneRecord(String key){
        phoneRecords.remove(key);
    }
    public Set<Map.Entry<String, String>> getAllPhoneRecords(){
        return phoneRecords.entrySet();
    }
    public String returnNumber(String key){

       return phoneRecords.get(key);
    }
    public String returnName(String value){
        //loop ent set, check if value in ? exists
        for(Map.Entry<String, String> entry: phoneRecords.entrySet()){
            //System.out.println(entry);
            if(entry.getValue().equals(value)){
                return entry.getKey();
            }

        }

        return null;
    }
}
