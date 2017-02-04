package cards;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

import cardPOJO.CardDataSort;
import tools.ReadFromFile;

/**
 * Created by Paul Yu on 12/6/2016.
 */
public class CARD_main extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.card_layout, container, false);
        RecyclerView cardrv = (RecyclerView) rootView.findViewById(R.id.cardrv);
        cardrv.setLayoutManager(new GridLayoutManager(this.getContext(), 3));

        ReadFromFile readFile = new ReadFromFile("cards.txt", getContext());

//        Bundle args = getArguments();
//        List<String> arrayList= new ArrayList<>();
//        arrayList = args.getStringArrayList("data");
//
//        String ah = readFromFile();
//
//        Log.d("data", arrayList.toString());
//        Log.d("file", readFromFile().toString());
//        String input = "";

//        String json = null;
        try {


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        TypeReference<List<CardDataSort>> typeRef = new TypeReference<List<CardDataSort>>() {
            @Override
            public Type getType() {
                return super.getType();
            }
        };
        List<CardDataSort> getCardData = objectMapper.readValue(readFile.getData(), typeRef);

        CARD_adapter adapter = new CARD_adapter(getContext(), getCardData);
        cardrv.setAdapter(adapter);

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
//
//    private String readFromFile() {
//
//        String ret = "";
//
//        try {
//            InputStream inputStream = getContext().openFileInput("config.txt");
//
//            if ( inputStream != null ) {
//                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//                String receiveString = "";
//                StringBuilder stringBuilder = new StringBuilder();
//
//                while ( (receiveString = bufferedReader.readLine()) != null ) {
//                    stringBuilder.append(receiveString);
//                }
//
//                inputStream.close();
//                ret = stringBuilder.toString();
//            }
//        }
//        catch (FileNotFoundException e) {
//            Log.e("login activity", "File not found: " + e.toString());
//        } catch (IOException e) {
//            Log.e("login activity", "Can not read file: " + e.toString());
//        }
//
//        return ret;
//    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
