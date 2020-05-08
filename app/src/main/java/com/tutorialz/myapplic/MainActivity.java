package com.tutorialz.myapplic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.infideap.drawerbehavior.Advance3DDrawerLayout;
import com.infideap.drawerbehavior.AdvanceDrawerLayout;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Advance3DDrawerLayout drawer = (Advance3DDrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        drawer.setViewRotation(GravityCompat.START, 15); // set degree of Y-rotation ( value : 0 -> 45)
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        //Set Name for user
        drawer.setViewScale(GravityCompat.START, 0.9f); //set height scale for main view (0f to 1f)
        drawer.setViewElevation(GravityCompat.START, 20); //set main view elevation when drawer open (dimension)
        drawer.setViewScrimColor(GravityCompat.START, Color.TRANSPARENT); //set drawer overlay coloe (color)
        drawer.setDrawerElevation(GravityCompat.START, 20); //set drawer elevation (dimension)
        drawer.setContrastThreshold(3); //set maximum of contrast ratio between white text and background color.
        drawer.setRadius(GravityCompat.START, 25); //set end container's corner radius (dimension)
        View headerView = navigationView.getHeaderView(0);

    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int i = item.getItemId();
        switch (i) {
            case R.id.t1:
                Toast.makeText(getBaseContext(),"Task 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.t2:
                Toast.makeText(getBaseContext(),"Task 2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.t3:
                Toast.makeText(getBaseContext(),"Task 3",Toast.LENGTH_SHORT).show();
                break;
        }

        AdvanceDrawerLayout drawer = (AdvanceDrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);


        return true;
    }

}
