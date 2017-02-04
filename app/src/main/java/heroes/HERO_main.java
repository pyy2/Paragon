package heroes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.paragon.paulyu.myapplication.R;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import heroPOJO.HeroData;
import tools.ReadFromFile;


/**
 * Created by Paul Yu on 11/16/2016.
 */

public class HERO_main extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.hero_layout, container, false);
        RecyclerView herolist = (RecyclerView) rootView.findViewById(R.id.herolist);
        herolist.setLayoutManager(new LinearLayoutManager(this.getContext().getApplicationContext()));
//
//        final ListView listview = (ListView) rootView.findViewById(R.id.herolist);
        //        String input = "";
//
//        String json = null;
        try {
//            InputStream is = getResources().openRawResource(R.raw.herodata);
//
//            int size = is.available();
//            byte[] buffer = new byte[size];
//
//            is.read(buffer);
//            json = new String(buffer, "UTF-8");
//
//            JSONArray jArray = new JSONArray(json);
//            is.close();
//
//            Log.d("Parsing herodata.txt..", String.valueOf(R.raw.herodata));

//            ParseData parseData = new ParseData("heroes.txt");
//            ReadFromFile readFile = new ReadFromFile("heroes.txt", getContext());

            ReadFromFile readFile = new ReadFromFile("heroes.txt", getContext());
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            TypeReference<List<HeroData>> typeRef = new TypeReference<List<HeroData>>() {
                @Override
                public Type getType() {
                    return super.getType();
                }
            };
//            return objectMapper.readValue(readFile.getData(), typeRef);
            List<HeroData> getHeroData = objectMapper.readValue(readFile.getData(), typeRef);

            HERO_Adapter adapter = new HERO_Adapter(getContext(), getHeroData);
            herolist.setAdapter(adapter);

        } catch (JsonParseException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        } catch (JsonMappingException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        } catch (Exception e){
            Log.e("StringBuilding", "Error converting result " + e.toString());
        }

        return rootView;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
