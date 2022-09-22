package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Code to create a new ViewPager in the MainActivity class
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager);
        SimpleFragmentPagerAdapter fragmentAdapter = new SimpleFragmentPagerAdapter(this,getSupportFragmentManager());
        viewPager.setAdapter(fragmentAdapter);

        // code to set up the TabLayout with ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);



//         // Set a click listener on Numbers View
//        TextView numbers =  (TextView) findViewById(R.id.numbers);
//
//
//        numbers.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Intent numbersIntent = new Intent(MainActivity.this, Numbers.class);
//                if (numbersIntent.resolveActivity(getPackageManager()) != null) {
//                    startActivity(numbersIntent);
//                }
////                startActivity(numbersIntent);
//            }
//        });
//
//        // Set a click listener on family members View
//        TextView familyMembers = (TextView) findViewById(R.id.family);
//
//        familyMembers.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Intent familyIntent = new Intent(MainActivity.this, FamilyMembers.class);
//                if (familyIntent.resolveActivity(getPackageManager()) != null) {
//                    startActivity(familyIntent);
//                }
////                startActivity(numbersIntent);
//            }
//        });
//
//        // Set a click listener on colors View
//        TextView colors = (TextView) findViewById(R.id.colors);
//
//        colors.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Intent colorIntent = new Intent(MainActivity.this, Colors.class);
//                if (colorIntent.resolveActivity(getPackageManager()) != null) {
//                    startActivity(colorIntent);
//                }
////                startActivity(numbersIntent);
//            }
//        });
//
//        // Set a click listener on Phrases View
//        TextView phrase = (TextView) findViewById(R.id.phrases);
//
//        phrase.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Intent phraseIntent = new Intent(MainActivity.this, Phrases.class);
//                if (phraseIntent.resolveActivity(getPackageManager()) != null) {
//                    startActivity(phraseIntent);
//                }
////                startActivity(numbersIntent);
//            }
//        });

  }
}