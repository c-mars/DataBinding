package c.mars.mvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import c.mars.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    User user = new User("Constantine", "Mars");
    Handler handler = new Handler() {
        @Override
        public void like(View view) {
            user.lastName.set("liked");
        }

        @Override
        public void dislike(View view) {
            user.lastName.set("-");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(user);
        binding.setHandler(handler);

    }
}
