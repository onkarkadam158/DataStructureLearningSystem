package com.example.datastructurelearning;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.datastructurelearning.Array.ArrayActivity;
import com.example.datastructurelearning.Introduction.IntroductionActivity;
import com.example.datastructurelearning.List.ListActivity;
import com.example.datastructurelearning.Queue.QueueActivity;
import com.example.datastructurelearning.Stack.StackActivity;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent intent;
        if (id == R.id.nav_intro) {

            intent = new Intent(MainActivity.this, IntroductionActivity.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_array) {

            intent = new Intent(MainActivity.this, ArrayActivity.class);
            startActivity(intent);

        }
        else if (id == R.id.nav_list) {

            intent = new Intent(MainActivity.this, ListActivity.class);
            startActivity(intent);

        }
        else if (id == R.id.nav_stack) {

            intent = new Intent(MainActivity.this, StackActivity.class);
            startActivity(intent);

        }
        else if (id == R.id.nav_queue) {

            intent = new Intent(MainActivity.this, QueueActivity.class);
            startActivity(intent);

        }
        else if(id == R.id.nav_aboutUs) {
            intent = new Intent(MainActivity.this,AboutUs.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
