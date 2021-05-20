package com.example.zalodemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private BottomNavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.viewPager);
        navigationView=findViewById(R.id.navigation);
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager(), 4);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
            @Override
            public void onPageSelected(int position) {
                switch(position){
                    case 0:navigationView.getMenu().findItem(R.id.mMessage).setChecked(true);
                        break;
                    case 1:navigationView.getMenu().findItem(R.id.mPhonebook).setChecked(true);
                        break;
                    case 2:navigationView.getMenu().findItem(R.id.mNotebook).setChecked(true);
                        break;
                    case 3:navigationView.getMenu().findItem(R.id.mAdd).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.mMessage:viewPager.setCurrentItem(0);
                        break;
                    case R.id.mPhonebook:viewPager.setCurrentItem(1);
                        break;
                    case R.id.mNotebook:viewPager.setCurrentItem(2);
                        break;
                    case R.id.mAdd:viewPager.setCurrentItem(3);
                        break;
                }
                return true;
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_add,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch(item.getItemId()){
            case R.id.mNhom:
                Toast.makeText(this, "Tạo nhóm", Toast.LENGTH_LONG).show();
                break;
            case R.id.mBan:
                Toast.makeText(this, "Thêm Bạn", Toast.LENGTH_LONG).show();
                break;
            case R.id.mLichSu:
                Toast.makeText(this, "Lịch sử đăng nhập", Toast.LENGTH_LONG).show();
                break;
            case R.id.mLich:
                Toast.makeText(this, "Lịch Zalo", Toast.LENGTH_LONG).show();
                break;
            case R.id.mFile:
                Toast.makeText(this, "Truyền File", Toast.LENGTH_LONG).show();
                break;
            case R.id.mGoiNhom:
                Toast.makeText(this, "Tạo cuộc gọi nhóm", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}