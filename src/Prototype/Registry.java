package Prototype;
import java.util.Map;
import java.util.HashMap;
public class Registry {
    HashMap<String,Student> map
            = new HashMap<>();
    Student get(String key){
        return map.get(key);
    }
    void register(String key,Student st){
        map.put(key,st);
    }
}
