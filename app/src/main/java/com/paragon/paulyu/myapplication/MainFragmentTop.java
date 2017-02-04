//package com.paragon.paulyu.myapplication;
//
//
//import android.content.Intent;
//import android.net.Uri;
//import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageButton;
//
//import com.makeramen.roundedimageview.RoundedImageView;
//
///**
// * A simple {@link Fragment} subclass.
// */
//public class MainFragmentTop extends Fragment {
//
//
//    public MainFragmentTop() {
//        // Required empty public constructor
//    }
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View rootView = inflater.inflate(R.layout.main_fragment, container, false);
//
//        ImageButton mainButton = (ImageButton) rootView.findViewById(R.id.epic_link);
////        mainButton.setBackgroundResource(R.drawable.background1);
////        mainButton.setImageBitmap(background());
//
//        mainButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.epicgames.com/paragon/en-US/news/v32-release-notes"));
//                startActivity(browserIntent);
//            }
//        });
//        // Inflate the layout for this fragment
//        return rootView;
//    }
////
////    private BitmapDrawable background()  {
////        BitmapDrawable background = null;
////        try {
////            InputStream inputStream = new URL("//developer-paragon-cdn.epicgames.com/Images/E37D187AEF7DA52B4173690737551A661F493960.png").openStream();
////            Bitmap bmImg = BitmapFactory.decodeStream(inputStream);
////            background = new BitmapDrawable(bmImg);
////            inputStream.close();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        return background;
////    }
//}