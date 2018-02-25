package com.example.pbeppe.contatti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    String[] nomi={"Cosimo","Agostino","Antonio","Federico","Gianni","Maria","Mara","Francesca","Martina","Eva"};
    int[] foto={R.drawable.cosimo,R.drawable.agostino,R.drawable.antonio,R.drawable.federico,R.drawable.gianni,
            R.drawable.maria,R.drawable.mara,R.drawable.francesca,R.drawable.martina,R.drawable.eva};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=(ListView)findViewById(R.id.lstcontatti);
    }
}
