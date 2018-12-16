package com.techyrh.sourabhupreti.burgerrating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar=findViewById(R.id.ratingBar);
        textView=findViewById(R.id.textView);
    }
    public void Submit(View view) {
        float rating = ratingBar.getRating();
        if (rating < 2) {
            textView.setText("Rating:" + rating + " \n Sorry,We'll try better next time.");
        }
        else if(rating>=2 && rating<=4){
            textView.setText("Rating:"+rating+" \n Thank you for your feedback.");
            }
        else{
            textView.setText(" Rating:"+rating+" \n Glad to know that you are satify with our services.");
        }
    }




}
