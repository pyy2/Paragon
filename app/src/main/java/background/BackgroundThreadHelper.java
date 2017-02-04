package background;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Paul Yu on 10/14/2016.
 */

public class BackgroundThreadHelper {




//    public void saveImages(String result, Context context) {
//
//        try {
//            FileOutputStream fileoutputstream = context.getApplicationContext().openFileOutput("HeroData", MODE_PRIVATE);
//            fileoutputstream.write(result.getBytes());
//            fileoutputstream.close();
//        }
//        catch(Exception e){
//            e.printStackTrace();
//            Log.d("Image Saving Error", ""+e);
//        }
//    }
//
    public ArrayList<String> loadURL() {

        ArrayList<String> url = new ArrayList<String>();
        url.add("https://developer-paragon.epicgames.com/v1/cards/complete");
        url.add ("https://developer-paragon.epicgames.com/v1/heroes/complete");
        return url;
    }


    String example ="";
    public void searchJSON(String input) {

        example = "";
        JSONObject json = null;

        try{
            JSONArray jArray = new JSONArray(input);


            for (int i = 0; i < jArray.length(); i++)
            {

                json = jArray.getJSONObject(i);
//                Iterator keys = json.keys();
//                while(keys.hasNext())   {
//                    String currentDynamicKey = (String)keys.next();
//                    String currentDynamicValue = json.getString(currentDynamicKey);
//
//
//
//                    if (i < 2) {
////                        example += "URL Image: " + json.getJSONObject("images").getString("medium_stats") +"\n";
//                        example +="current key" + currentDynamicKey + "\n";
//                        example +="currentDynamicValue" + json.getString(currentDynamicKey) + "\n";
////                        Log.d("image URL", json.getJSONObject("images").getString("medium_stats"));
//                        Log.d("current key", currentDynamicKey);
//                        Log.d("currentDynamicValue", json.getString(currentDynamicKey));
//                    }
//            }

            }

        } catch ( JSONException e) {
            e.printStackTrace();
            Log.d("Error Parsing JSON", json.toString());
        }
    }

    public String getExample()  {
        Log.d("example text", example);
        return example;
    }
}
