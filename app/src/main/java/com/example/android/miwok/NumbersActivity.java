package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.miwok.MainActivity;
import com.example.android.miwok.R;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One","lutti", R.drawable.number_one));
        words.add(new Word("Two","otiiko", R.drawable.number_two));
        words.add(new Word("Three", "tolookosu", R.drawable.number_three));
        words.add(new Word("Four", "oyyisa", R.drawable.number_four));
        words.add(new Word("Five", "massokka", R.drawable.number_five));
        words.add(new Word("Six", "temmokka", R.drawable.number_six));
        words.add(new Word("Seven", "kenekaku", R.drawable.number_seven));
        words.add(new Word("Eight", "kawinta", R.drawable.number_eight));
        words.add(new Word("Nine", "wo’e", R.drawable.number_nine));
        words.add(new Word("Ten", "na’aacha", R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

       /* LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        for(int index = 0; index < words.size(); index++)
        {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);
        } */

        //Log.v("NumbersActivity", "Word at index 0: "+words.get(0));
        //Log.v("NumbersActivity", "Word at index 1: "+words.get(1));
    }
}
