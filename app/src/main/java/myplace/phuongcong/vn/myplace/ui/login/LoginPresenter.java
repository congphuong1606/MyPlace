package myplace.phuongcong.vn.myplace.ui.login;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import myplace.phuongcong.vn.myplace.common.Constants;
import myplace.phuongcong.vn.myplace.data.User;
import myplace.phuongcong.vn.myplace.network.ApiService;
import myplace.phuongcong.vn.myplace.network.ApiUtils;

/**
 * Created by Ominext on 10/2/2017.
 */

public class LoginPresenter {
    private ApiService mApiService;
    private LoginView mLoginView;

    public LoginPresenter(LoginView mLoginView) {
        this.mApiService = ApiUtils.getIapiService();
        this.mLoginView = mLoginView;
    }

    public void onLogin(String accName, String accPass) {
        mApiService.login("login", accName,accPass).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onSuccess, this::onFail);
    }

    private void onSuccess(User user) {
      User user1=user;
      mLoginView.onSiginSuccess();
    }
    private void onFail(Throwable throwable) {
        if(String.valueOf(throwable).equals("com.google.gson.JsonSyntaxException: java.lang.IllegalStateException: Expected BEGIN_OBJECT but was STRING at line 1 column 1 path $")){
            mLoginView.onRequestFail(Constants.LOGIN_FAIL);
        }

    }
}
