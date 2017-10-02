package myplace.phuongcong.vn.myplace.ui.login;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import myplace.phuongcong.vn.myplace.common.Constants;
import myplace.phuongcong.vn.myplace.data.Users;
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

    public void onLoadListUser() {
        String spreadsheetId = Constants.SPREAD_SHEET_ID;
        String range =Constants.SHEET_USER ;
        mApiService.getListUser(spreadsheetId, range).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onSuccess, this::onFail);
    }

    private void onFail(Throwable throwable) {
        mLoginView.onRequestFail(String.valueOf(throwable));
    }

    private void onSuccess(Users users) {
        mLoginView.onLoadUsersSuccess(users.getUsers());
    }
}
