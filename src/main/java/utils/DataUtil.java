package utils;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataUtil extends WebAssert {

    protected static WebDriver driver;
   // public WebElement chooseImageButton = driver.findElement(By.id("profilePicFile"));

    @DataProvider

//    public Object[] dataProvider1(String path) {
//        JSONParser parser = new JSONParser();
//        JSONObject jsonObject = null;
//
//        // Read JSON file
//        try {
//            Object obj = parser.parse(new FileReader(path));
//            jsonObject = (JSONObject) obj;
//        } catch (IOException | ParseException exception) {
//            exception.printStackTrace();
//        }
//
//        // Array to store JSON data
//        Object[] data = new Object[1];
//
//        // Store JSON data as key/value pairs in a hashMap
//        HashMap<String, String> hashMap = new LinkedHashMap<>();
//        if (jsonObject != null) {
//            Set<String> jsonObjKeys = jsonObject.keySet();
//            for (String jsonObjKey : jsonObjKeys) {
//                hashMap.put(jsonObjKey, (String) jsonObject.get(jsonObjKey));
//            }
//        } else {
//            log.error("Error retrieving JSON data");
//            throw new RuntimeException();
//        }
//
//        // Store HashMap in an array and return array
//        data[0] = hashMap;
//        return data;
//    }

    public static Object dataProvider1() throws IOException, ParseException {
        // Read the JSON file into a string.
        String json = new String(Files.readAllBytes(Paths.get("src/test/resources/userCreation/userHomePage.json")));
        System.out.println("response...."+ json);

        // Parse the JSON string into an object.
        JSONParser parser = new JSONParser();
        Object data = parser.parse(json);

        // Return the object.
        return data;
    }

    public String jsonReader() throws IOException{
        // Get the data from the JSON file.
//        String path  = "src/test/resources/userCreation/userHomePage.json";
//        Object data  = new Object();
//
//        return data;
//
//         Print the data to the console.
//        System.out.println(data);


        return new String(Files.readAllBytes(Paths.get("src/test/resources/userCreation/userHomePage.json")));

    }
}







