package com.aditya.imagegallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button prev,next;
    ImageView pic;
    TextView text;
    int currentImage=0;
    String [] names={"John Wick","Jon Wick","Batman","Me","Billy"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //always give a view with a button
    //Views are responsible for handling user input events, such as clicks, touches, or key presses
    public void previous(View v){
        //dealing with current image
         text=findViewById(R.id.text1);
        String idX="pic"+currentImage;
        int x=this.getResources().getIdentifier(idX,"id",getPackageName());
        pic=findViewById(x);
        pic.setAlpha(0f);

        currentImage=(5+currentImage-1)%5;
        String idY="pic"+currentImage;
        int y=this.getResources().getIdentifier(idY,"id",getPackageName());
        pic=findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);
    }
    public void next(View v){
         text=findViewById(R.id.text1);
        String idX="pic"+currentImage;
        int x=this.getResources().getIdentifier(idX,"id",getPackageName());
        pic=findViewById(x);
        pic.setAlpha(0f);

        currentImage=(currentImage+1)%5;
        String idY="pic"+currentImage;
        int y=this.getResources().getIdentifier(idY,"id",getPackageName());
        pic=findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);
    }

}