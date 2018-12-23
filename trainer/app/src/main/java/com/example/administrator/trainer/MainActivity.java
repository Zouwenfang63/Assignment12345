package com.example.administrator.trainer;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    String[] players = {"Wang Mo", "Li Jian", "刘教练", "David Zhang", "赵武 教练", "Van Persie", "Oscar"};
    String[] experience = {
            "Perfection is not attainable, but if we chase perfection we can catch excellence",
            "Health & Fitness Lifestyle Transformation.Gym doesn't change live, People do.",
            "If we chase perfection we can catch excellence",
            "Gym doesn't change live, People do.",
            "An accomplished fitness trainer with seven years of experience n hand",
            "Gym doesn't change live, People do.",
            "Gym doesn't change live, People do."
    };
    int[] images = {R.drawable.trainer1, R.drawable.trainer2, R.drawable.trainer3, R.drawable.trainer4, R.drawable.trainer5, R.drawable.trainer6, R.drawable.athelet_1};
    String[]  phones={"13935746985","13051195052","13051195056","13051195055",
            "13935746985","13051195052","13051195056"};
    ArrayList<HashMap<String, String>> data = new ArrayList<>();
    SimpleAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trainerlist);
        ListView  listView=findViewById(R.id.trainer_list);
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < players.length; i++) {
            map = new HashMap<String, String>();
            map.put("Player", players[i]);
            map.put("Info",experience[i]);
            map.put("Image", Integer.toString(images[i]));
            map.put("Phone",phones[i]);

            data.add(map);
        }
        String[] from = {"Player","Info", "Image","Phone"};
        int[] to = {R.id.nameTxt, R.id.infoTxt, R.id.imageView1,R.id.phone};
        adapter = new SimpleAdapter(this, data, R.layout.trainerlist_item, from, to);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);



    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
       // Toast.makeText(this,"haha",Toast.LENGTH_SHORT).show();
        String name=players[i];
        String name_expr=experience[i];
        String phone=phones[i];
        Intent intent=TrainItemActivity.newIntent(MainActivity.this,name,name_expr,phone);
        startActivity(intent);
    }

}
