package test.android.orca.com.mvvm_test.view;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import test.android.orca.com.mvvm_test.R;
import test.android.orca.com.mvvm_test.databinding.ActivityMainBinding;
import test.android.orca.com.mvvm_test.viewmodel.LoginViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        LoginViewModel login = new LoginViewModel() ;
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main) ;
        activityMainBinding.setViewModel(login);
        activityMainBinding.executePendingBindings();
    }

    @BindingAdapter({"toastMessage"})
    public static  void runMe(View view , String message){
        if (message != null){
            Toast.makeText(view.getContext(),message,Toast.LENGTH_SHORT).show();
        }
    }
}
