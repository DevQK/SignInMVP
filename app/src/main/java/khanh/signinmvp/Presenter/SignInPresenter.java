package khanh.signinmvp.Presenter;

import khanh.signinmvp.Interface.SignInContract;

public class SignInPresenter implements SignInContract.Presenter {

    private SignInContract.View mView;

    public SignInPresenter(SignInContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void handleSignIn(String userName, String passWord) {
        if (userName.equals("devk") && passWord.equals("123456")){
            mView.signInSuccess();
            return;
        }
    }
}
