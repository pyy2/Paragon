package layout;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.makeramen.roundedimageview.RoundedImageView;
import com.paragon.paulyu.myapplication.R;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.main_fragment, container, false);

//        ImageButton mainButton = (ImageButton) rootView.findViewById(R.id.epic_link);
//        ImageHelper imageHelper = new ImageHelper();
//        mainButton.setBackgroundResource(R.drawable.background1);
//        mainButton.setImageBitmap(background());

        RoundedImageView riv = (RoundedImageView)rootView.findViewById(R.id.image1);
        riv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.epicgames.com/paragon/en-US/news/v32-release-notes"));
                startActivity(browserIntent);
            }
        });
        // Inflate the layout for this fragment
        return rootView;
    }
//
//    private BitmapDrawable background()  {
//        BitmapDrawable background = null;
//        try {
//            InputStream inputStream = new URL("//developer-paragon-cdn.epicgames.com/Images/E37D187AEF7DA52B4173690737551A661F493960.png").openStream();
//            Bitmap bmImg = BitmapFactory.decodeStream(inputStream);
//            background = new BitmapDrawable(bmImg);
//            inputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return background;
//    }
}