package fr.wildcodeschool.apprenti.monsterlegendwiki;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by apprenti on 07/09/16.
 */


public class CustomAdapter extends ArrayAdapter<String> {
private Activity context;
private int[] imageList;



    public CustomAdapter(Activity context, String[] theList, int[] imageList) {
        super(context,R.layout.custom,theList);
        this.imageList = imageList;
        this.context = context;

    }


    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater menuInflater= LayoutInflater.from(getContext());
        View customView = menuInflater.inflate(R.layout.custom,parent,false);

        String singleMenuItem = getItem(position);
        TextView menuTexts = (TextView) customView.findViewById(R.id.menuText);
        ImageView egg = (ImageView) customView.findViewById(R.id.eggs);

          menuTexts.setText(singleMenuItem);


        egg.setImageResource(imageList[position]);

        return customView;
    }


}
