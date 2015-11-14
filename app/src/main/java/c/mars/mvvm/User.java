package c.mars.mvvm;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

import lombok.Data;

/**
 * Created by Constantine Mars on 11/14/15.
 */
//@Data
public class User {
    public ObservableField<String> firstName = new ObservableField<>();
    public ObservableField<String> lastName = new ObservableField<>();
    public ObservableBoolean active = new ObservableBoolean();

    public User(String firstName, String lastName) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
    }
}
