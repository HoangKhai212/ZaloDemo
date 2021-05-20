package com.example.zalodemo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private int pageNum;
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.pageNum=behavior;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0: return new FragmentMessage();
            case 1: return new FragmentPhoneBook();
            case 2: return new FragmentNoteBook();
            case 3: return new FragmentAdd();
            default:return new FragmentMessage();
        }
    }
    @Override
    public int getCount() {
        return pageNum;
    }
}
