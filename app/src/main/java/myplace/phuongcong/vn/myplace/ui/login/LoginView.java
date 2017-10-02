package myplace.phuongcong.vn.myplace.ui.login;

import java.util.ArrayList;

import myplace.phuongcong.vn.myplace.data.User;

/**
 * Created by Ominext on 10/2/2017.
 */

public interface LoginView {
    void onLoadUsersSuccess(ArrayList<User> users);
    void onRequestFail(String s);
}
