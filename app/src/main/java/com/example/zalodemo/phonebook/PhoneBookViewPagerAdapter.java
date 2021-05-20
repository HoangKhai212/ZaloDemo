package com.example.zalodemo.phonebook;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PhoneBookViewPagerAdapter extends FragmentStatePagerAdapter {
    public PhoneBookViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:return new FragmentContact();
            case 1:return new FragmentOfficial();
            default:return new FragmentContact();
        }
    }
    @Override
    public int getCount() {return 2;}
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:return "Danh bạ";
            case 1:return "Official Account";
            default:return "Danh bạ";
    }
    }}
