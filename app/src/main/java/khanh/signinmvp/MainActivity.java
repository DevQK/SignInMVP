package khanh.signinmvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import khanh.signinmvp.Interface.SignInContract;
import khanh.signinmvp.Presenter.SignInPresenter;

public class MainActivity extends AppCompatActivity implements SignInContract.View, View.OnClickListener{

    private EditText edtUserName, edtPassWord;
    private Button btnSignIn;
    private TextView tvShowTextSignIn;
    private SignInPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        registerListener();
        initPressenter();
    }
    private void initView() {
        edtPassWord = (EditText) findViewById(R.id.text_password);
        edtUserName = (EditText) findViewById(R.id.text_username);
        btnSignIn = (Button) findViewById(R.id.button_sign_in);
        tvShowTextSignIn = (TextView) findViewById(R.id.button_sign_up);
    }
    private void registerListener() {
        btnSignIn.setOnClickListener(this);
        tvShowTextSignIn.setOnClickListener(this);
    }
    private void initPressenter() {
        presenter = new SignInPresenter(this);
    }
    @Override
    public void signInSuccess() {

    }

    @Override
    public void signInFailure(String error) {

    }

    @Override
    public void onClick(View v) {

    }
}
