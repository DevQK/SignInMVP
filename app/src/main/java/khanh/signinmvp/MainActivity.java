package khanh.signinmvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import khanh.signinmvp.Interface.SignInContract;

public class MainActivity extends AppCompatActivity implements SignInContract.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void signInSuccess() {

    }

    @Override
    public void signInFailure(String error) {

    }
}
