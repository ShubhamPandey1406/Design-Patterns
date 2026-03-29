import java.util.HashMap;
import java.util.Map;

//Here we are using memosization technique
public class TreeFactory {

    static Map<String, TreeType> treeTypeMap = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
       //create key to store the object
        String key = name + " - " + color + " - " + texture;
       //if object is not formed create for the first time
        if (!treeTypeMap.containsKey(key)) {
            treeTypeMap.put(key, new TreeType(name, color, texture));
        }

        //return the object
        return treeTypeMap.get(key);
    }

}
