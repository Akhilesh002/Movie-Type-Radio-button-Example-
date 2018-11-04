package com.akhilesh002.movietype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup movieType;
    private RadioButton comedy;
    private RadioButton horror;
    private RadioButton action;
    private RadioButton thriller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieType = findViewById(R.id.movieType);
        comedy = findViewById(R.id.comedy);
        horror = findViewById(R.id.horror);
        action = findViewById(R.id.action);
        thriller = findViewById(R.id.thriller);
    }

    public void checkMovieType(View view) {

        int selectedId = movieType.getCheckedRadioButtonId();
        RadioButton radioButton = findViewById(selectedId);
        if(selectedId==-1){
            Toast.makeText(MainActivity.this,"Nothing selected", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this,radioButton.getText(), Toast.LENGTH_SHORT).show();
        }

    }
}
