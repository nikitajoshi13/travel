package com.example.nikitajoshi.travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    private CardView almora;
    private CardView rishikesh;
    private CardView nainital;
    private CardView haridwar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        almora=(CardView)findViewById(R.id.card_almora);
        almora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forwardAlmora();
            }
        });
        rishikesh=(CardView)findViewById(R.id.card_rishikesh);
        rishikesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forwardRishikesh();
            }
        });

        nainital=(CardView)findViewById(R.id.card_nainital);
        nainital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forwardNainital();
            }
        });
        haridwar=(CardView)findViewById(R.id.card_haridwar);
        haridwar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forwardHaridwar();
            }
        });
    }
    public void forwardAlmora()
    {
        Intent al = new Intent(this,Main32Activity.class);
        startActivity(al);
    }
    public void forwardRishikesh()
    {
        Intent al = new Intent(this,rishikeshnext.class);
        startActivity(al);
    }
    public void forwardNainital()
    {
        Intent al = new Intent(this,nainitalnext.class);
        startActivity(al);
    }
    public void forwardHaridwar()
    {
        Intent al = new Intent(this,haridwarnext.class);
        startActivity(al);
    }


}
