package com.example.MySecondApp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;
import android.widget.TextView;

/**
 * Created by Phillip on 2/3/14.
 */
public class DisplayMessageActivity extends Activity {

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);

        //Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        //Set the text view as the activity layout
        setContentView(textView);
    }

//    @Override
//    public boolean onOptionsItemsSelected(MenuItem item) {
//        switch (item.getItemId()) {
//        case android.R.id.home:
//            NavUtils.navigateUpFromSameTask(this);
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
