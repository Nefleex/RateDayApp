package com.mika.ratedayapplication;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/*TO-DO:
        1.Remove toast from RATE YOUR DAY button.
        2.Save current day's rating into Hashmap.
        3.Use Hashmap to make a week's average of ratings, make a method to round that number
          and take that rounded number and use it as a rating to resemble weeks average
          as a smiley.
        4.Clean up drawable images, remove black background
        5.Line up elements in a more orderly fashion.

        */



public class MainActivity extends AppCompatActivity  {

    String rating = "";

    Calendar c  = Calendar.getInstance();
    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH);
    int day = c.get(Calendar.DAY_OF_MONTH);


    NavigableMap<String,String> datesAndvalues = new TreeMap<String, String>() {
    };

    public String getToday() {
        return Today;
    }

    public void setToday(String today) {
       Today = today;
    }

    String Today = DateFormat.getDateInstance(DateFormat.DATE_FIELD).format(c.getTime());
    //String Yesterday = c.add(Calendar.DATE, -1);



    public String getRating() {

        return rating;
    }

    public void setRating(String rating) {

        this.rating = rating;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Initialize elements.
        ImageButton changeToOne = findViewById(R.id.buttonOne);
        ImageButton changeToTwo = findViewById(R.id.buttonTwo);
        ImageButton changeToThree = findViewById(R.id.buttonThree);
        ImageButton changeToFour = findViewById(R.id.buttonFour);
        ImageButton changeToFive = findViewById(R.id.buttonFive);
        ImageButton changeToSix = findViewById(R.id.buttonSix);
        Button rateYourDay = (Button) findViewById(R.id.buttonRateYourDay);

        final TextView dayRating  = (TextView) findViewById(R.id.DayRating);
        final ImageView imageView  = (ImageView) findViewById(R.id.imageView);

        //Updates textview id"dayRating" as it gets new rating from method "getRating();"

        //Displays current date at textView 2
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("Today is " + Today);


        //Methods for buttons.
        changeToOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRating("1");
                dayRating.setText(getRating());
                //imageView.setImageResource(R.drawable.smiley1);

            }
        });

        changeToTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRating("2");
                dayRating.setText(getRating());
                //imageView.setImageResource(R.drawable.smiley2);
            }
        });

        changeToThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRating("3");
                dayRating.setText(getRating());
               // imageView.setImageResource(R.drawable.smiley3);
            }
        });

        changeToFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRating("4");
                dayRating.setText(getRating());
               // imageView.setImageResource(R.drawable.smiley4);
            }
        });

        changeToFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRating("5");
                dayRating.setText(getRating());
               // imageView.setImageResource(R.drawable.smiley5);
            }
        });

        changeToSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRating("6");
                dayRating.setText(getRating());
              //  imageView.setImageResource(R.drawable.smiley6);
            }
        });



        rateYourDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datesAndvalues.put(getToday(), getRating());
                Toast.makeText(MainActivity.this, datesAndvalues.entrySet().toString(), Toast.LENGTH_LONG).show();
                if (rating.equals("1")) {
                    imageView.setImageResource(R.drawable.smiley1);
                    } else if (rating.equals("2")) {
                        imageView.setImageResource(R.drawable.smiley2);
                    } else if (rating.equals("3")) {
                        imageView.setImageResource(R.drawable.smiley3);
                    } else if (rating.equals("4")) {
                        imageView.setImageResource(R.drawable.smiley4);
                    } else if (rating.equals("5")) {
                        imageView.setImageResource(R.drawable.smiley5);
                    } else if (rating.equals("6")) {
                        imageView.setImageResource(R.drawable.smiley6);
                    }

            }});
                                       }}











//Old methods, not used currently.
       /* button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.buttonOne:
                        //Start activity 1 here, for example

                        break;
                    case R.id.buttonTwo:
                        //Start activity 2 here
                        break;
                    case R.id.textView3:
                        //Start activity 3 here
                        break;
                    case R.id.textView4:
                        //Start activity 4 here
                }*/




                /*dayRating.getText();
                if(dayRating.getText().equals("1")) {
                    imageView.setImageResource(R.drawable.smiley1);
                }
                else if(dayRating.equals("2")) {
                    imageView.setImageResource(R.drawable.smiley2);
                }
                else if(dayRating.equals("3")) {
                    imageView.setImageResource(R.drawable.smiley3);
                }
                else if(dayRating.equals("4")) {
                    imageView.setImageResource(R.drawable.smiley4);
                }
                else if(dayRating.equals("5")) {
                    imageView.setImageResource(R.drawable.smiley5);
                }
                else if(dayRating.equals("6")) {
                    imageView.setImageResource(R.drawable.smiley6);
                }*/




           /* }


        });*/



    /*@Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String currentDateString = DateFormat.getDateInstance(DateFormat.DATE_FIELD).format(c.getTime());
        //testing
        String currentDateStringDifferentFormat = DateFormat.getDateInstance(DateFormat.SHORT).format(c.getTime());


        TextView textView  = (TextView) findViewById(R.id.textView);
        textView.setText(currentDateString);

        //TextView textView2 = (TextView) findViewById(R.id.textView2);
        //textView2.setText(currentDateStringDifferentFormat);

    }*/



   /* */








