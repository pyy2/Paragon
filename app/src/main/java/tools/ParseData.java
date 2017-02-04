//package tools;
//
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.lang.reflect.Type;
//import java.util.List;
//
//import heroPOJO.HeroData;
//
///**
// * Created by Paul Yu on 12/21/2016.
// */
//public class ParseData {
//    public ParseData(String s) {
//
//    }
//
//    public void jsonToJava()    {
//        ReadFromFile readFile = new ReadFromFile("heroes.txt", getContext());
//
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
//        return objectMapper.readValue(readFile.getData(), typeRef);
//    }
//}
