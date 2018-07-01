package com.example.android.myjournal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by manuel_piranha on 6/30/18.
 */

public class JournalActivity extends AppCompatActivity implements View.OnClickListener {

     CardView addNewJournal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.journal_list);

        addNewJournal = (CardView) findViewById(R.id.cardView_add_new_journal);

        addNewJournal.setOnClickListener(this);
    }




    @Override
    public void onClick(View view) {
        TextView currentSign = (TextView) findViewById(R.id.plus_cross);
        switch (currentSign.getText().toString()) {
            case "+":
                currentSign.setText(getString(R.string.cross_sign));
                addNewJournal.setVisibility(View.VISIBLE);
                break;
            case "x":
                currentSign.setText(getString(R.string.plus_sign));
                addNewJournal.setVisibility(View.INVISIBLE);
        }
    }
}
