package layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.paragon.paulyu.myapplication.R;

import background.BackgroundThread;
import tools.ReadFromFile;

public class card_gallery extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

//    private OnFragmentInteractionListener mListener;

    public card_gallery() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment card_gallery.
     */
    // TODO: Rename and change types and number of parameters
    public static card_gallery newInstance(String param1, String param2) {
        card_gallery fragment = new card_gallery();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.card_layout1, container, false);
//
//        ImageView imageView2 = (ImageView)rootView.findViewById(R.id.imageView2);
//        ImageView r1c1 = (ImageView) rootView.findViewById(R.id.r1c1);
//        ImageView r1c3 = (ImageView)rootView.findViewById(R.id.r1c3);
//
//        imageView2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                final Toast tag = Toast.makeText(getContext(), "Megavolt Pylon \n\n" +
//                        "Unique Active: \n" +
//                        "Restore +10 mana for each nearby Unit. \n\n" +
//
//                        "Cooldown: 180s",Toast.LENGTH_SHORT);
//
//                tag.show();

//                new CountDownTimer(3000, 1000)
//                {
//
//                    public void onTick(long millisUntilFinished) {tag.show();}
//                    public void onFinish() {tag.show();}
//
//                }.start();
//            }
//        });
//        r1c3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                final Toast tag = Toast.makeText(getContext(), "Offensive Manuevers \n\n" +
//                        "Passive: \n" +
//                        "+44 Physical Armor and +44 Energy Armor against basic attacks."
//                        ,Toast.LENGTH_SHORT);
//
//                tag.show();
//
//                new CountDownTimer(3000, 1000)
//                {
//
//                    public void onTick(long millisUntilFinished) {tag.show();}
//                    public void onFinish() {tag.show();}
//
//                }.start();
//            }
//        });
//
//        r1c1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                final Toast tag = Toast.makeText(getContext(), "SwiftCreek Heart \n\n" +
//                                "Completion Bonus: \n" +
//                                "- MaxHealth: 300"
//                        ,Toast.LENGTH_SHORT);
//
//                tag.show();
//
//                new CountDownTimer(3000, 1000)
//                {
//
//                    public void onTick(long millisUntilFinished) {tag.show();}
//                    public void onFinish() {tag.show();}
//
//                }.start();
//            }
//        });
//
//        r1c3.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v)  {
//                Toast.makeText(getContext(), "long press", Toast.LENGTH_LONG).show();
//                return true;
//            }
//
//        });
        ReadFromFile readFile = new ReadFromFile("news.txt", getContext());

TextView textview = (TextView) rootView.findViewById(R.id.example);
textview.setText(readFile.getData());
        return rootView;
    }

//    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }
////
//    /**
//     * This interface must be implemented by activities that contain this
//     * fragment to allow an interaction in this fragment to be communicated
//     * to the activity and potentially other fragments contained in that
//     * activity.
//     * <p>
//     * See the Android Training lesson <a href=
//     * "http://developer.android.com/training/basics/fragments/communicating.html"
//     * >Communicating with Other Fragments</a> for more information.
//     */
//    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        void onFragmentInteraction(Uri uri);
//    }
//}
