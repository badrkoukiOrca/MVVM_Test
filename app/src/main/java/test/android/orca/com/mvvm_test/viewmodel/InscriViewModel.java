package test.android.orca.com.mvvm_test.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import test.android.orca.com.mvvm_test.BR;
import test.android.orca.com.mvvm_test.model.User;

public class InscriViewModel extends BaseObservable {
    public User user  ;

    public String fail_msg = "inscri failed" ;
    public String success_msg = "inscri success" ;

    @Bindable
    public String message = null ;


    public InscriViewModel() {
        this.user = new User("","","","");
    }

    public void OnNameChanged(CharSequence name){
        this.user.setName(name.toString());
    }

    public void OnLastNameChanged(CharSequence lastName){
        this.user.setLastName(lastName.toString());
    }

    public void OnPasswordChanged (CharSequence password){
        this.user.setPassword(password.toString());
    }

    public void OnEmailChanged (CharSequence email){
        this.user.setEmail(email.toString());
    }

    public void OnClick(){
        if(user.Testuser()){
            message = success_msg ;
            notifyPropertyChanged(BR.message);
        }
        else{
            message = fail_msg;
            notifyPropertyChanged(BR.message);
        }
    }
}
