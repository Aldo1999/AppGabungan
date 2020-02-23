package com.example.appgabungan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScrollViewActivity extends AppCompatActivity {
    Button cupcake, donut, eclair, froyo, gingerbread, honeycomb, icecreamsandwich, jellybean, kitkat, lollipop, marshmallow, nougat, oreo, pie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
        cupcake = findViewById(R.id.cupcake);
        donut = findViewById(R.id.donut);
        eclair = findViewById(R.id.eclair);
        froyo = findViewById(R.id.froyo);
        gingerbread = findViewById(R.id.gingerbread);
        honeycomb = findViewById(R.id.honeycomb);
        icecreamsandwich = findViewById(R.id.icecreamsandwich);
        jellybean = findViewById(R.id.jellybean);
        kitkat = findViewById(R.id.kitkat);
        lollipop = findViewById(R.id.lollipop);
        marshmallow = findViewById(R.id.marshmallow);
        nougat = findViewById(R.id.nougat);
        oreo = findViewById(R.id.oreo);
        pie = findViewById(R.id.pie);
        cupcake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this,cupcakeActivity.class));
            }
        });
        donut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this,donutActivity.class));
            }
        });
        eclair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this,eclairActivity.class));
            }
        });
        froyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this,froyoActivity.class));
            }
        });
        gingerbread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this,gingerbreadActivity.class));
            }
        });
        honeycomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this,honeycombActivity.class));
            }
        });
        icecreamsandwich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this,icecreamsandwichActivity.class));
            }
        });
        jellybean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this,jellybeanActivity.class));
            }
        });
        kitkat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this,kitkatActivity.class));
            }
        });
        lollipop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this,lollipopActivity.class));
            }
        });
        marshmallow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this,marshmallowActivity.class));
            }
        });
        nougat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this,nougatActivity.class));
            }
        });
        oreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this,oreoActivity.class));
            }
        });
        pie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this,pieActivity.class));
            }
        });
    }
}
