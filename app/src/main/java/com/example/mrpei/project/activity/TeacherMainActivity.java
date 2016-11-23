package com.example.mrpei.project.activity;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TableLayout;

import com.example.mrpei.project.R;
import com.example.mrpei.project.adapter.fragmentAdapter;
import com.example.mrpei.project.adapter.viewAdapter;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;

public class TeacherMainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    //声明标题栏
    //private TableLayout tab_title;
    //tab名称列表

    private View ClassFragment;
    private View MainFragment;
    private View MessageFragment;

    //定义以view为切换的adapter
    private viewAdapter vAdapter;
    private List<String> list_title;
    private List<View> listViews;
    //定义以fragment为切换的adapter
    private fragmentAdapter fAdapter;
    private List<Fragment> list_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_teacher_main);

        initView();
        initData();
    }

    public void startCamera(View view) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(intent);
    }

    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.id_viewpager);
        //tab_title = (TabLayout) findViewById(R.id.tab_title);

        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Log.d("xyz", position + "--" + positionOffset + "--" + positionOffsetPixels);
//
//                if (position==0||position<1){
//                    tab_title.setBackgroundColor(Color.parseColor("#6699ff"));
//
//                }
//                else if (position<2){
//                    tab_title.setBackgroundColor(Color.parseColor("#99cc33"));
//
//                }
//                else if (position<3){
//                    tab_title.setBackgroundColor(Color.parseColor("#ffcc00"));
//
//                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initData() {
        listViews = new ArrayList<>();
        LayoutInflater mInflater = getLayoutInflater();

        ClassFragment = mInflater.inflate(R.layout.tab3, null);
        MainFragment = mInflater.inflate(R.layout.tab1, null);
        MessageFragment= mInflater.inflate(R.layout.tab2, null);
        listViews.add(ClassFragment);
        listViews.add(MainFragment);
        listViews.add(MessageFragment);

        list_title = new ArrayList<>();
        list_title.add("小陌");
        list_title.add("路友");
        list_title.add("圈子");

        //设置TabLayout的模式,这里主要是用来显示tab展示的情况的
        //TabLayout.MODE_FIXED          各tab平分整个工具栏,如果不设置，则默认就是这个值
        //TabLayout.MODE_SCROLLABLE     适用于多tab的，也就是有滚动条的，一行显示不下这些tab可以用这个
        //                              当然了，你要是想做点特别的，像知乎里就使用的这种效果
        //tab_title.setTabMode(TabLayout.MODE_FIXED);

        //设置tablayout距离上下左右的距离
        //tab_title.setPadding(20,20,20,20);

        //为TabLayout添加tab名称
        //tab_title.addTab(tab_title.newTab().setText(list_title.get(0)));
        //tab_title.addTab(tab_title.newTab().setText(list_title.get(1)));
        //tab_title.addTab(tab_title.newTab().setText(list_title.get(2)));

        //图标
//        vAdapter = new viewAdapter(this,listViews,list_title,tabImg);
        vAdapter = new viewAdapter(this,listViews,list_title,null);
        mViewPager.setAdapter(vAdapter);

        //将tabLayout与viewpager连起来
        //tab_title.setupWithViewPager(mViewPager);

    }
}
