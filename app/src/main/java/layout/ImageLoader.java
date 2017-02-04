//package layout;
//
//import android.content.Context;
//import android.widget.ImageView;
//
//import com.paragon.paulyu.myapplication.R;
//import com.squareup.picasso.Picasso;
//
///**
// * Created by Oclemy on 6/16/2016 for ProgrammingWizards Channel and http://www.camposha.com.
// */
//public class ImageLoader {
//
//    public static void downloadImage(Context c, String imageUrl, ImageView img)
//    {
//        if(imageUrl != null && imageUrl.length()>0)
//        {
//            Picasso.with(c).load(imageUrl).placeholder(R.drawable.alphaheal).into(img);
//
//        }else {
//            Picasso.with(c).load(R.drawable.alphaheal).into(img);
//        }
//    }
//}
