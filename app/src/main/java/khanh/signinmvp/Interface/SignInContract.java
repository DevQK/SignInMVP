package khanh.signinmvp.Interface;

public interface SignInContract {
    interface View{
        void signInSuccess();
        void signInFailure(String error);
    }
    interface Presenter{
        void handleSignIn(String userName, String passWord);
    }
}
