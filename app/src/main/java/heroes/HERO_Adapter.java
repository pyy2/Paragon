package heroes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.makeramen.roundedimageview.RoundedImageView;
import com.paragon.paulyu.myapplication.R;
import com.squareup.picasso.Picasso;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import heroPOJO.HeroData;

/**
 * Created by Paul Yu on 11/16/2016.
 */
public class HERO_Adapter extends RecyclerView.Adapter<HERO_Adapter.HERO_holder>{
    private static List<HeroData> heroes;
    private Context context;
    HeroData item;

    /**
     * Hero data model. Android id's from R.layout.hero_item is matched with parsed JSON data from
     * Jackson.
     */
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
        HeroData item;
        FrameLayout frameLayout;
        LayoutInflater layoutInflater;
        ViewGroup container;

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
            frameLayout = (FrameLayout) itemView.findViewById(R.id.hero_container);
            layoutInflater= (LayoutInflater)itemView.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView.setOnClickListener(this);
            container = (ViewGroup)itemView.findViewById(R.id.hero_container);

        }

        /**
         * Sets onClick when hero_item is pressed - onClick opens a new intent
         * @param v is the hero_item whole. It is separate for each item based on hero position.
         */
        @Override
        public void onClick(View v) {

            Toast.makeText(v.getContext(),
                    String.format("Clicked on position %d", getAdapterPosition()),
                    Toast.LENGTH_SHORT).show();

            // if space outside the window is clicked, window is closed
            if(click)   {
                bindModel2(item, heroes, getAdapterPosition(), v.getContext());
                Intent intent = new Intent(v.getContext(), HERO_Profile.class);

                intent.putExtra("title", item.getName());
                intent.putExtra("thumbnail", item.getImages().getIcon());
                intent.putExtra("attack", item.getAttack());
                intent.putExtra("setAffinity", item.getAffinities().get(0));
                intent.putExtra("setAffinity2", item.getAffinities().get(1));
                intent.putExtra("name", item.getName());
                intent.putExtra("position", getAdapterPosition());
                intent.putExtra("progressBar", item.getStats().getMobility());
                intent.putExtra("progressBar2", item.getStats().getBasicAttack());
                intent.putExtra("progressBar3", item.getStats().getDurability());
                intent.putExtra("progressBar4", item.getStats().getBasicAttack());
                intent.putExtra("ability1", item.getAbilities().get(0).getName());
                intent.putExtra("ability1", item.getAbilities().get(1).getName());
                intent.putExtra("ability1", item.getAbilities().get(2).getName());
                intent.putExtra("ability1", item.getAbilities().get(3).getName());

                Bundle bundle = new Bundle();
//                bundle.putParcelableArrayList("data", (ArrayList<? extends Parcelable>) heroes);

                v.getContext().startActivity(intent);
                click = false;
            }   else    {
                click = true;
            }
        }

        private void bindModel2(HeroData item, List<HeroData> heroes, int adapterPosition, Context context) {
            bindModel(item, heroes, adapterPosition, context);
        }

        public void bindModel(HeroData item, List<HeroData> heroes, int position, Context ctx) {

            item = heroes.get(position);

            this.item = item;
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
    }


    public HERO_Adapter(Context context, List<HeroData> heroes) {
        super();

        this.context = context;
        this.heroes = heroes;

    }

    @Override
    public HERO_holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.hero_item, parent, false);

        return new HERO_holder(itemView);
    }

    @Override
    public void onBindViewHolder(final HERO_holder holder, int position) {
        Context ctx = holder.itemView.getContext();
        holder.bindModel(item, heroes, position, ctx);
    }

    @Override
    public int getItemCount() {
        return heroes.size();
    }

}