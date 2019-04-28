package com.yuong.wheelview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        WheelView group = findViewById(R.id.group);
        WheelView member = findViewById(R.id.member);


        group.setCyclic(true);
        group.setVisibleItems(3);
        member.setCyclic(true);
        member.setVisibleItems(3);


        final List<String> mGroupItems = new ArrayList<>();
        final List<String> mMemberItems = new ArrayList<>();
        mGroupItems.add("item0");
        mGroupItems.add("item1");
        mGroupItems.add("item2");

        mMemberItems.add("1个月--1000");
        mMemberItems.add("2个月--1950");
        mMemberItems.add("3个月--2900");

        StringWheelAdapter mGroupAdapter = new StringWheelAdapter(mGroupItems);
        group.setAdapter(mGroupAdapter);
        group.setCurrentItem(0);
        StringWheelAdapter mMemberAdapter = new StringWheelAdapter(mMemberItems);
        member.setAdapter(mMemberAdapter);
    }
}
