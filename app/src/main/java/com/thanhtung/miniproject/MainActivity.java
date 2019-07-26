
package com.thanhtung.miniproject;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import com.thanhtung.miniproject.fragment.FavoriteFragment;
import com.thanhtung.miniproject.fragment.NewsFragment;
import com.thanhtung.miniproject.fragment.SaveFragment;


public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private PagerAdapter adapter;
    private FavoriteFragment fmFavorite = new FavoriteFragment();
    private NewsFragment fmNews = new NewsFragment();
    private SaveFragment fmSaved = new SaveFragment();
    private Dialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        adapter = new com.thanhtung.miniproject.PagerAdapter(getSupportFragmentManager(),fmNews,fmSaved,fmFavorite);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(this);
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    public FavoriteFragment getFmFavorite() {
        return fmFavorite;
    }

    public NewsFragment getFmNews() {
        return fmNews;
    }

    public SaveFragment getFmSaved() {
        return fmSaved;
    }


}
