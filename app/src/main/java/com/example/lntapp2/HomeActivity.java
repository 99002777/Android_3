package com.example.lntapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import static com.example.lntapp2.R.id.textViews;

public class HomeActivity extends AppCompatActivity {

    String[] languages;
    private static final String TAG = HomeActivity.class.getSimpleName() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.w(TAG,"onCreate");
        languages=new String[]{"english","hindi","urdu","kannada"};
        Intent intent=getIntent();
        Bundle extras = intent.getExtras();
        if(extras!=null) {
            String data = extras.getString("myKey");
            TextView resultTextView = findViewById(R.id.textView);
            resultTextView.setText(data);
        }
        ListView countriesListView=findViewById(R.id.countriesListView);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,
                //android.R.layout.simple_list_item_1,
                R.layout.row_listview,
                languages);
        countriesListView.setAdapter(adapter);
    }

}