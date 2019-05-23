package test.android.orca.com.mvvm_test.model;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Patterns;

public class User {

    @NonNull
    private String email ;

    @NonNull
    private  String name ;

    @NonNull
    private String lastName ;

    @NonNull
    private String password ;

    public User(@NonNull String email, @NonNull String password) {
        this.email = email;
        this.password = password;
    }

    public User(@NonNull String email, @NonNull String name, @NonNull String lastName, @NonNull String password) {
        this.email = email;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public String getLastName() {
        return lastName;
    }

    public void setLastName(@NonNull String lastName) {
        this.lastName = lastName;
    }

    public boolean isInputDataValid(){
        return  !TextUtils.isEmpty(getEmail()) && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() && getPassword().length() > 5 ;
    }

    public boolean Testuser(){
        if (this.password.equals("123") && this.name.equals("badr")  && this.lastName.equals("kouki")){
            return  true ;
        }
        else{
            return false ;
        }
    }

}
