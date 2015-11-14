package c.mars.mvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import c.mars.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    User user = new User("Constantine", "Mars");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(user);
    }
}
