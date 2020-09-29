package com.kerux.admin_side_kerux;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class Enrollment extends AppCompatActivity  {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enrollment);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_enrollment, R.id.nav_unenrollment, R.id.nav_manage_acc, R.id.nav_manage_rep)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        Button bttnQM = findViewById(R.id.bttnEnrollQM);
        Button bttnDept = findViewById(R.id.bttnEnrollDept);
        Button bttnDoctor = findViewById(R.id.bttnEnrollDoc);

        bttnQM.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(this, EnrollQM.class);
                startActivity(intent);*/
            }
        });

        bttnDept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               onClick(v);
            }
        });

            bttnDoctor.setOnClickListener(new View.OnClickListener() {
                @Override
                 public void onClick(View v){
                   /* Intent intent2 = new Intent(this, EnrollDoctor.class);
                    startActivity(intent2);*/
                }
            });
    }



    //    @Override
   public void onClick(View v) {
        switch (v.getId()){
        /*    case R.id.bttnEnrollQM:
                Intent intent = new Intent(this, EnrollQM.class);
                startActivity(intent);
                break;
           case R.id.bttnEnrollDoc:
                Intent intent2 = new Intent(this, EnrollDoctor.class);
               startActivity(intent2);
                break;*/
            case R.id.bttnEnrollDept:
                Intent intent3 = new Intent(this, EnrollDept.class);
                startActivity(intent3);
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}