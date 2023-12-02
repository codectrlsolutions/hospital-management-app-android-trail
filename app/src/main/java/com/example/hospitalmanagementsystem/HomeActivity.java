package com.example.hospitalmanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if(id == R.id.home){
                    loadFragment(new HomeFragment(),true);
                } else if (id == R.id.contact_us) {
                    loadFragment(new ContactUsFragment(),true);
                } else if (id == R.id.settings) {
                    loadFragment(new SettingsFragment(),true);
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });

//        relativeLayout = navigationView.findViewById(R.id.relativeLayout);
//        relativeLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
//                startActivity(intent);
//            }
//        });

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if(id == R.id.home){
                    loadFragment(new HomeFragment(),true);
                } else if (id == R.id.contact_us) {
                    loadFragment(new ContactUsFragment(),true);
                } else if (id == R.id.settings) {
                    loadFragment(new SettingsFragment(),true);
                }
                return true;
            }
        });

        bottomNavigationView.setSelectedItemId(R.id.home);

    }

    public void loadFragment(Fragment fragment, boolean flag){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if(!flag)
            fragmentTransaction.add(R.id.frameLayout,fragment);
        else
            fragmentTransaction.replace(R.id.frameLayout,fragment);

        fragmentTransaction.commit();
    }
}