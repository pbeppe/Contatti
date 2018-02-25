package com.example.pbeppe.contatti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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

        AmiciAdapter amiciAdapter=new AmiciAdapter(getApplicationContext(),nomi,foto);
        listview.setAdapter(amiciAdapter);



        // Ascolto Eventi cliclk su item?

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(MainActivity.this,nomi[position],Toast.LENGTH_SHORT).show();



            }
        });
    }
}
