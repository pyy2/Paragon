package heroes;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.makeramen.roundedimageview.RoundedImageView;
import com.paragon.paulyu.myapplication.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import heroPOJO.HeroData;

/**
 * Created by Paul Yu on 2/1/2017.
 */

public class HERO_ProfileAdatper extends RecyclerView.Adapter<HERO_ProfileAdatper.HERO_holder> {
    private Context context;
    HeroData item;
    public class HERO_holder extends RecyclerView.ViewHolder
            implements  View.OnClickListener    {

        RoundedImageView thumbnail;
        TextView title;
        TextView attack;
        ImageView setAffinity;
        ImageView setAffinity2;
        TextView trait;
        boolean click = true;
        View popupView;

        public HERO_holder(View itemView) {

            super(itemView);

            itemView.setOnClickListener(this);

            thumbnail = (RoundedImageView) itemView.findViewById(R.id.hero_portrait);
            title = (TextView) itemView.findViewById(R.id.hero_name);
            attack = (TextView) itemView.findViewById(R.id.hero_attack);

            setAffinity = (ImageView) itemView.findViewById(R.id.affinity);
            setAffinity2 = (ImageView) itemView.findViewById(R.id.affinity2);
            trait = (TextView) itemView.findViewById(R.id.hero_trait);
            popupView = LayoutInflater.from(itemView.getContext()).inflate(R.layout.hero_intro, null);

            itemView.setOnClickListener(this);

        }

        public void bindModel(HeroData item, List<HeroData> heroes, int position, Context ctx) {

            item = heroes.get(position);

            title.setText(item.getName());

            String imageUrl = item.getImages().getIcon();
            Picasso.with(ctx).load("http:" + imageUrl).placeholder(R.drawable.paragonicon).into(thumbnail);

            String affinity = item.getAffinities().get(0);
            String affinity2 = item.getAffinities().get(1);

            Log.d("affinity", affinity);
            Log.d("affinity2", affinity2);

            getAffinity(setAffinity, affinity);
            getAffinity(setAffinity2, affinity2);

            attack.setText("- " + item.getAttack().toUpperCase() + " -");

            final String[] hero_traits = {""};

            for (int i = 0; i < item.getTraits().size(); i++) {
                hero_traits[0] += "\t" + item.getTraits().get(i) + "\t";
            }

            trait.setText(hero_traits[0]);

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

        @Override
        public void onClick(View v) {

        }
    }

    public HERO_ProfileAdatper(Context context, HeroData heroData) {
        this.item = heroData;
        this.context = context;
    }

    @Override
    public HERO_holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.hero_item, parent, false);

        return new HERO_ProfileAdatper.HERO_holder(itemView);
    }

    @Override
    public void onBindViewHolder(HERO_ProfileAdatper.HERO_holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
