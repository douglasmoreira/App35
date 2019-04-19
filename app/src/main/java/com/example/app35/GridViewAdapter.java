package com.example.app35;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class GridViewAdapter extends BaseAdapter {

    Context context;

    int[] animalImages = {R.drawable.bear, R.drawable.bird,R.drawable.cat,
    R.drawable.cow,R.drawable.dolphin,R.drawable.fish, R.drawable.fox,
            R.drawable.horse, R.drawable.lion,R.drawable.tiger};

    String[] animalName = {"bear", "bird", "car", "cow", "dolphin", "fish",
            "fox", "house", "lion", "tiger"};

    public GridViewAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return animalImages.length;
    }

    @Override
    public Object getItem(int i) {
        return animalImages[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {

        ImageView imageView = new ImageView(context);
        imageView.setImageResource(animalImages[i]);
        imageView.setLayoutParams(new GridView.LayoutParams(200,200));
        imageView.setPadding(10,10,10,10);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "The name of the " +
                        "Animal is:"+ animalName[i],Toast.LENGTH_SHORT).show();
            }
        });


        return imageView;
    }
}
