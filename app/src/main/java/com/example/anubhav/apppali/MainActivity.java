package com.example.anubhav.apppali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.victor.loading.newton.NewtonCradleLoading;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import is.arontibo.library.ElasticDownloadView;

public class MainActivity extends AppCompatActivity {
//    ElasticDownloadView elasticDownloadView;
//    Button button23,button58,button96;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final NewtonCradleLoading newtonCradleLoading= (NewtonCradleLoading)findViewById(R.id.newton);
//        newtonCradleLoading.setLoadingColor(R.color.colorPrimary);
//        newtonCradleLoading.start();
//        button23= (Button) findViewById(R.id.mybutton23);
//        button23.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                newtonCradleLoading.setVisibility(View.VISIBLE);
//            }
//        });
//
//        button58= (Button) findViewById(R.id.mybutton58);
//        button58.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                newtonCradleLoading.setVisibility(View.GONE);
//            }
//        });
//        DateFormat df= new SimpleDateFormat("yyyy/MM/dd");
//        String date=df.format(Calendar.getInstance().getTime());
//        df = new SimpleDateFormat("hh:mm a");
//        String time = df.format(Calendar.getInstance().getTime());
//        button23.setText(time);
//        button58.setText(date);
//        String hour=time.substring(0,time.indexOf(":")-1);
//        int hourInt=Integer.parseInt(hour);
//        String AM_PM="am";
//        if(hourInt>12 && hourInt<24){
//            hourInt=Integer.parseInt(hour)-12;
//            AM_PM="pm";
//            hour=
//        }
//        else if( hourInt ==0 || hourInt==24){
//            hour="12";
//        }





/**        elasticDownloadView=(ElasticDownloadView) findViewById(R.id.elastic);
        elasticDownloadView.startIntro();
//        @InjectView
//                (R.id.elastic_download_view) ElasticDownloadView mElasticDownloadView;
        button23= (Button) findViewById(R.id.mybutton23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elasticDownloadView.setProgress(23);
            }
        });
        button58= (Button) findViewById(R.id.mybutton58);
        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elasticDownloadView.setProgress(58);
            }
        });
        button96= (Button) findViewById(R.id.mybutton96);
        button96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elasticDownloadView.setProgress(96);
            }
        }); */





    }


//        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());


//        textView.setText(currentDateTimeString.toString().substring(0,11)); DATE
//        textView.setText(currentDateTimeString.toString().substring(12,16)+" "+currentDateTimeString.toString().substring(20,22)); TIME
//        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
//        Intent getIntent = new Intent(Intent.ACTION_GET_CONTENT);
//        getIntent.setType("image/*");
//
//        Intent pickIntent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//        pickIntent.setType("image/*");
//
//        Intent chooserIntent = Intent.createChooser(getIntent, "Select Image");
//        chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, new Intent[] {pickIntent});
//
//        startActivityForResult(chooserIntent,1);

    /** Trying BNB from here on */



    }

