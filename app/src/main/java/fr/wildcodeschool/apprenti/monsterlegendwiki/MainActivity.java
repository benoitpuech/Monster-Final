package fr.wildcodeschool.apprenti.monsterlegendwiki;

import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Monster fireLion = new Monster(getString(R.string.fire), "Fire Lion", "2480", "875", "875", "100", R.drawable.fire_lion_0, R.drawable.fire_lion_all,R.drawable.feu);
        Monster firesaur = new Monster(getString(R.string.fire), "Firesaur", "2480", "1375", "875", "100", R.drawable.firesaur_0, R.drawable.firesaur_all,R.drawable.feu);
        Monster genie = new Monster(getString(R.string.spirit), "Genie", "2480", "950", "1250", "100", R.drawable.genie_0, R.drawable.genie_all,R.drawable.magie);
        Monster lightspirit = new Monster(getString(R.string.light), "Light Spirit", "3521", "875", "875", "100", R.drawable.light_spirit_0, R.drawable.light_spirit_all,R.drawable.lumiere);
        Monster mersnake = new Monster(getString(R.string.water), "Mersnake", "2777", "1125", "1000", "100", R.drawable.mersnake_0, R.drawable.mersnake_all,R.drawable.eau);
        Monster metalsaur = new Monster(getString(R.string.metal), "Metalsaur", "2976", "1120", "1000", "100", R.drawable.metalsaur_0, R.drawable.metalsaur_all,R.drawable.metal);
        Monster panda = new Monster(getString(R.string.nature), "Panda", "2777", "950", "1000", "100", R.drawable.panda_0, R.drawable.panda_all,R.drawable.nature);
        Monster rockilla = new Monster(getString(R.string.earth), "Rockilla", "3521", "875", "875", "100", R.drawable.rockilla_0, R.drawable.rockilla_all,R.drawable.terre);
        Monster thundereagle = new Monster(getString(R.string.thunder), "Thunder eagle", "2480", "875", "1250", "100", R.drawable.thunder_eagle_0, R.drawable.thunder_eagle_all,R.drawable.foudre);
        Monster treezard = new Monster(getString(R.string.nature), "Treezard", "2777", "1125", "1000", "100", R.drawable.treezard_0, R.drawable.treezard_all,R.drawable.nature);
        Monster turtle = new Monster(getString(R.string.water), "Turtle", "2777", "1000", "1000", "100", R.drawable.turtle_0, R.drawable.turtle_all,R.drawable.eau);
        Monster tyrannoking = new Monster(getString(R.string.death), "Tyrannoking", "2480", "1150", "875", "100", R.drawable.tyrannoking_0, R.drawable.tyrannoking_all,R.drawable.mort);

        //list de Stats


        final List<Monster> theList = new ArrayList<Monster>();
        theList.add(fireLion);
        theList.add(firesaur);
        theList.add(genie);
        theList.add(lightspirit);
        theList.add(mersnake);
        theList.add(metalsaur);
        theList.add(panda);
        theList.add(rockilla);
        theList.add(thundereagle);
        theList.add(treezard);
        theList.add(turtle);
        theList.add(tyrannoking);



        // creating NameList

        String[] nameList = new String[theList.size()];
        for (int i = 0; i < theList.size(); i++) {
            nameList[i] = (theList.get(i).getName());
        }

        // creating Image list
        int[] imageList = new int[theList.size()];
        for (int i = 0; i < theList.size(); i++) {
            imageList[i] = (theList.get(i).getDrawableEgg());
        }



//adapter
        ListAdapter adapter1 = new CustomAdapter(this, nameList, imageList);
        ListView menuListView = (ListView) findViewById(R.id.listView1);
        menuListView.setAdapter(adapter1);


        //button hypertexte

        TextView link = (TextView)findViewById(R.id.wikiLink);


        link.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view)
            {
                Uri adress= Uri.parse("http://monster-wiki.com/");
                Intent browser= new Intent(Intent.ACTION_VIEW, adress);
                startActivity(browser);
            }

        });

        menuListView.setOnItemClickListener(

                new AdapterView.OnItemClickListener() {


                    @Override
                    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {



                                    Monster secondAct = new Monster(theList.get(position).getElement(), theList.get(position).getName(), theList.get(position).getLife(),
                                    theList.get(position).getPower(), theList.get(position).getSpeed(), theList.get(position).getStamina(),
                                    theList.get(position).getDrawableEgg(), theList.get(position).getDrawableForm(),theList.get(position).getDrawableElement());


                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                         intent.putExtra("cliked",secondAct);

//based on item add info to intent
                        startActivity(intent);

                    }


                });


    }
}