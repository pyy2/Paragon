package cards;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.paragon.paulyu.myapplication.R;
import com.squareup.picasso.Picasso;

import java.util.Collections;
import java.util.List;

import cardPOJO.CardDataSort;

/**
 * Created by Paul Yu on 11/16/2016.
 */
public class CARD_adapter extends RecyclerView.Adapter<CARD_holder> {

    private List<CardDataSort> cards;
    private Context context;

    public LayoutInflater inflater;


    public CARD_adapter(Context context, List<CardDataSort> cards) {
        this.context = context;
        this.cards = cards;
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public CARD_adapter(List<CardDataSort> cards)   {
        this.cards = cards;
    }

    @Override
    public CARD_holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item, parent, false);

        return new CARD_holder(itemView);
    }

    @Override
    public void onBindViewHolder(CARD_holder holder, int position) {

        CardDataSort item = cards.get(position);

        holder.cardName.setText(item.getName());

        String imageUrl = item.getImages().getLarge_stats();
        Picasso.with(context).load("http:" + imageUrl).into(holder.image);
//
//        ImageLoader.downloadImage(context, imageUrl, holder.image);
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater inflater = (LayoutInflater) context
//                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View rowView = inflater.inflate(R.layout.card_item, parent, false);
//
//        CardDataSort item = (CardDataSort) getItem(position);
//
////        //set image URL
//        String imageUrl = item.getImages().getLarge_stats();
////        String abilityUrl = item.getAbilities().get(0).getImages().getIcon();
//
//
//
//        Picasso.with(context).load("http:" + imageUrl).into(image);
//        Log.d("image url", imageUrl);
//        cardName.setText(item.getName());
//
//        final String description = item.getEffects().get(0).getDescription();
//
//        image.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                final Toast tag = Toast.makeText(context, description
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

//        title.setText(item.getName() +"\n" + item.getAffinities() +"\n"+ item.getAttack() + "\n" + item.getImages().toString() + "\n");
//        rating.setText(item.getReleaseDate());
//
//

//        return rowView;
//    }
}