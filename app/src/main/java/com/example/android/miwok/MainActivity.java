package com.example.android.miwok;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //NUMBERS_ACTIVITY_ONCLICKLISTNER
        TextView numbers = (TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent numbersIntent = new Intent(MainActivity.this, NumberActivity.class);
                startActivity(numbersIntent);
            }
        });

        //COLORS_ACTIVITY_ONCLICKLISTNER
        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        //FAMILY_MEMBERS_ACTIVITY_ONCICKLISTNER
        TextView fammembers = (TextView) findViewById(R.id.family);
        fammembers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent fammembersIntent = new Intent(MainActivity.this, FamilyMemberActivity.class);
                startActivity(fammembersIntent);
            }
        });

        //PHRASES_ACTIVITY_ONCLICKLISTNER
        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });
    }

    public void openNumbersActivity(View view){
        Intent i = new Intent(this, NumberActivity.class);
        startActivity(i);
    }
    public void openFamilyMembersActivity(View view){
        Intent i = new Intent(this, FamilyMemberActivity.class);
        startActivity(i);
    }
    public void openColorsActivity(View view){
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }
    public void openPhrasesActivity(View view){
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }
}
