package fr.wildcodeschool.apprenti.monsterlegendwiki;

/**
 * Created by apprenti on 08/09/16.
 */


import android.content.Intent;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;



public class SecondActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent= getIntent();
        Monster clicked = (Monster)intent.getSerializableExtra("cliked");
        //


        TextView name = (TextView)findViewById(R.id.name);
        name.setText(clicked.getName());

        ImageView egg = (ImageView)findViewById(R.id.egg);
        egg.setImageResource(clicked.getDrawableEgg());

        TextView element = (TextView)findViewById(R.id.element);
        element.setText(clicked.getElement());

        TextView life = (TextView)findViewById(R.id.vie);
        life.setText(clicked.getLife());

        TextView power = (TextView)findViewById(R.id.force);
        power.setText(clicked.getPower());

        TextView  speed = (TextView)findViewById(R.id.viesse);
        speed.setText(clicked.getSpeed());

        TextView endurance = (TextView)findViewById(R.id.endurance);
        endurance.setText(clicked.getStamina());

        ImageView form = (ImageView)findViewById(R.id.forme);
        form.setImageResource(clicked.getDrawableForm());

        ImageView element2 =(ImageView)findViewById(R.id.elem);
        element2.setImageResource(clicked.getDrawableElement());













    }

}