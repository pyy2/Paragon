package cards;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.paragon.paulyu.myapplication.R;

/**
 * Created by Paul Yu on 12/14/2016.
 */
public class CARD_holder extends RecyclerView.ViewHolder   {
    ImageView image;
    TextView cardName;

    public CARD_holder(View itemView) {
        super(itemView);
        image = (ImageView) itemView.findViewById(R.id.card);
        cardName = (TextView) itemView.findViewById(R.id.cardname);
    }
}