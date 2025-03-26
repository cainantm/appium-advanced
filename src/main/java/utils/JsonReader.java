package utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonReader {

    public static Object[][] getJsonData(String jsonPath, String jsonData, int jsonAttribute) throws IOException, ParseException {
        Object object = new JSONParser().parse(new FileReader(jsonPath));
        JSONObject jsonObject = (JSONObject) object;
        JSONArray jsonArray = (JSONArray) jsonObject.get(jsonData);

        Object[][] array = new String[jsonArray.size()][jsonAttribute];
        for(int i =0; i< jsonArray.size(); i++){
            JSONObject object1 = (JSONObject) jsonArray.get(i);
            array[i][0] = String.valueOf(object1.get("TaskName"));
            array[i][1] = String.valueOf(object1.get("TaskDesc"));
        }
        return array;
    }

}
