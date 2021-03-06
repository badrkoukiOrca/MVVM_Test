package test.android.orca.com.mvvm_test.viewmodel;


import android.content.Context;
import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import test.android.orca.com.mvvm_test.BR;
import test.android.orca.com.mvvm_test.model.User;
import test.android.orca.com.mvvm_test.view.InscriptionActivity;


public class LoginViewModel extends BaseObservable {

    private User user  ;

    private String succuess_msg  = "Login avec success" ;
    private  String fail_msg = "Login failed" ;

    @Bindable
    public String toastMessage = null ;



    public LoginViewModel() {
        this.user = new User("","") ;
    }

    public void afterEmailTextChanged(CharSequence message) {
        user.setEmail(message.toString());
    }

    public void afterPasswordTextChanged(CharSequence message){
        user.setPassword(message.toString());
    }

    public void onLoginClicked(){
        if (user.isInputDataValid()){
            toastMessage = succuess_msg ;
            notifyPropertyChanged(BR.toastMessage);
        }
        else{
            toastMessage = fail_msg ;
            notifyPropertyChanged(BR.toastMessage);
        }
    }

    public void startNewActivity(Context context) {
        Intent intent = new Intent(context, InscriptionActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }





}
