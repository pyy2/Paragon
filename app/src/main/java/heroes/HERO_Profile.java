package heroes;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.makeramen.roundedimageview.RoundedImageView;
import com.paragon.paulyu.myapplication.R;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import RawDataPOJO.RawDataPOJO;
import heroPOJO.HeroData;
import tools.ReadFromFile;

/**
 * Created by Paul Yu on 12/13/2016.
 */
public class HERO_Profile extends Activity {

    RelativeLayout chart;
    RelativeLayout stats;
    HeroData item;
    TextView title;
    RoundedImageView thumbnail;
    TextView attack;
    ImageView setAffinity;
    ImageView setAffinity2;
    TextView trait;
    ProgressBar progressBar;
    ProgressBar progressBar2;
    ProgressBar progressBar3;
    ProgressBar progressBar4;
    RawDataPOJO rawdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Retrieve extras in Bundle sent from HERO_Adapter onClick method
        Bundle bundle = getIntent().getExtras();
        setContentView(R.layout.hero_intro);

//        ReadFromFile readFile = new ReadFromFile(R.raw.herodata, getBaseContext());

        String text = "";
        Context context = getApplicationContext();
        try {
            InputStream is = getResources().openRawResource(R.raw.herodata);

            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);

            JSONArray jArray = new JSONArray(text);
            is.close();


            Log.d("Parsing herodata.txt..", text);
        } catch (JsonParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JsonMappingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            Log.e("StringBuilding", "Error converting result " + e.toString());
        }

        String title = (String) bundle.get("title");
        String thumbnail = (String) bundle.get("thumbnail");
        String attack = (String) bundle.get("attack");
        String setAffinity = (String) bundle.get("setAffinity");
        String setAffinity2 = (String) bundle.get("setAffinity2");
        int progressBar = (int) bundle.get("progressBar");
        int progressBar2 = (int) bundle.get("progressBar2");
        int progressBar3 = (int) bundle.get("progressBar3");
        int progressBar4 = (int) bundle.get("progressBar4");


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = (int) (dm.widthPixels * .9);
        int height = (int) (dm.heightPixels * .9);

        getWindow().setLayout(width, height);

        chart = (RelativeLayout) findViewById(R.id.hero_chart);

        // from hero_item
        this.title = (TextView) findViewById(R.id.hero_name);
        this.thumbnail = (RoundedImageView) findViewById(R.id.hero_portrait);
        this.attack = (TextView) findViewById(R.id.hero_attack);
        this.setAffinity = (ImageView) findViewById(R.id.affinity);
        this.setAffinity2 = (ImageView) findViewById(R.id.affinity2);
        this.trait = (TextView) findViewById(R.id.hero_trait);

        // set hero_item
        this.title.setText(title);
        Picasso.with(getBaseContext()).load("http:" + thumbnail).placeholder(R.drawable.paragonicon).into(this.thumbnail);
        this.attack.setText("- " + attack.toUpperCase() + " -");
        getAffinity(this.setAffinity, setAffinity);
        getAffinity(this.setAffinity2, setAffinity2);

        // from hero_chart
        this.progressBar = (ProgressBar) findViewById(R.id.progressBar1);
        this.progressBar2 = (ProgressBar) findViewById(R.id.progressBar2);
        this.progressBar3 = (ProgressBar) findViewById(R.id.progressBar3);
        this.progressBar4 = (ProgressBar) findViewById(R.id.progressBar4);

        // set hero_chart
        this.progressBar.setProgress(progressBar);
        this.progressBar2.setProgress(progressBar2);
        this.progressBar3.setProgress(progressBar3);
        this.progressBar4.setProgress(progressBar4);

    }

    private void getAffinity(ImageView s, String a) {
        switch (a.toString()) {
            case "Fury":
                s.setBackgroundResource(R.drawable.furyicon);
                break;
            case "Order":
                s.setBackgroundResource(R.drawable.ordericon);
                break;
            case "Intellect":
                s.setBackgroundResource(R.drawable.intellecticon);
                break;
            case "Growth":
                s.setBackgroundResource(R.drawable.growthicon);
                break;
            case "Corruption":
                s.setBackgroundResource(R.drawable.corruptionicon);
                break;
            default:
                break;
        }
    }

//
//    String example ="";
//    public void searchJSON(String input) {
//        ReadFromFile readFile = new ReadFromFile("heroes.txt", getContext());
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//
//        TypeReference<List<HeroData>> typeRef = new TypeReference<List<HeroData>>() {
//            @Override
//            public Type getType() {
//                return super.getType();
//            }
//        };
////            return objectMapper.readValue(readFile.getData(), typeRef);
//        List<HeroData> getHeroData = objectMapper.readValue(readFile.getData(), typeRef);
//        example = "";
//        JSONObject json = null;
//
//        Iterator keys = json.keys();
//        try{
//            JSONArray jArray = new JSONArray(input);
//
//
//            for (int i = 0; i < jArray.length(); i++)
//            {
//
//                json = jArray.getJSONObject(i);
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
//
//            }
//
//        } catch ( JSONException e) {
//            e.printStackTrace();
//            Log.d("Error Parsing JSON", json.toString());
//        }
//    }
}


