package com.example.priyanka.gridapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import java.util.ArrayList;
import android.widget.AdapterView;
import android.widget.Toast;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public GridView gv;
    public String a;
    public ArrayList<String> items = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0;i<81;i++) {
            items.add("x");
        }
        gv=(GridView) this.findViewById(R.id.MyGrid);
        final Button b1 = (Button)findViewById(R.id.b1);
        final Button b2 = (Button)findViewById(R.id.b2);
        final Button b3 = (Button)findViewById(R.id.b3);
        final Button b4 = (Button)findViewById(R.id.b4);
        final Button b5 = (Button)findViewById(R.id.b5);
        final Button b6 = (Button)findViewById(R.id.b6);
        final Button b7 = (Button)findViewById(R.id.b7);
        final Button b8 = (Button)findViewById(R.id.b8);
        final Button b9 = (Button)findViewById(R.id.b9);
        final Button sort = (Button)findViewById(R.id.sort);
        final CustomGridAdaptor gridadapter=new CustomGridAdaptor(MainActivity.this,items);
        //a = (String) b1.getText();
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                //based on the position you have to get value
                //String value=value1[position];
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        items.set(position, (String) b1.getText());

                        gv.setAdapter(gridadapter);
                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        items.set(position, (String) b2.getText());

                        gv.setAdapter(gridadapter);
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        items.set(position, (String) b3.getText());

                        gv.setAdapter(gridadapter);
                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        items.set(position, (String) b4.getText());

                        gv.setAdapter(gridadapter);
                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        items.set(position, (String) b5.getText());

                        gv.setAdapter(gridadapter);
                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        items.set(position, (String) b6.getText());

                        gv.setAdapter(gridadapter);
                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        items.set(position, (String) b7.getText());

                        gv.setAdapter(gridadapter);
                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        items.set(position, (String) b8.getText());

                        gv.setAdapter(gridadapter);

                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        items.set(position, (String) b9.getText());

                        gv.setAdapter(gridadapter);
                    }
                });
            }
        });


        //CustomGridAdaptor gridadapter=new CustomGridAdaptor(MainActivity.this,items);
        gv.setAdapter(gridadapter);

        sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                String[] real = {"a","b","c","d","e","f","g","h","i"};


                    for (int j = 0; j < 81; j++) {

                        if (items.get(j) == "x")
                            items.set(j,real[r.nextInt(9)]);


                    }


                //gv.setAdapter(gridadapter);

                for(int i=0;i<=72;i=i+9) {
                    Collections.sort(items.subList(i, i + 9));
                }
                Toast.makeText(getApplicationContext(),"Grid is filled with Random variables between a to i and is sorted Row wise",Toast.LENGTH_LONG).show();
                gv.setAdapter(gridadapter);
                //}

            }
        });









    }
}