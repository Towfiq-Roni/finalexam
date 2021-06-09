dpackage com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_activity);

        tabLayout = findViewById(R.id.tabLayoutview);
        viewPager = findViewById(R.id.viewPager);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPage);
    }

    private void setUpViewPager(ViewPager viewPager){

        com.example.api.ViewPagerAdapter viewPagerAdapter = new com.example.api.ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new FragmentCalculateBMI(), "Calculate BMI");
        viewPagerAdapter.addFragment(new FragmentFahrenheitToCelsius(), "Fahrenheit To Celsius");
        viewPagerAdapter.addFragment(new FragmentCelsiusToFahrenheit(), "Celsius To Fahrenheit");
        viewPager.setAdapter(viewPagerAdapter);

    }
}



public class NextActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPager viewPage;