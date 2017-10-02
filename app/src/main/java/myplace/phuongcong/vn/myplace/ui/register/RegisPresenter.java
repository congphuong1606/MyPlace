package myplace.phuongcong.vn.myplace.ui.register;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import myplace.phuongcong.vn.myplace.common.Constants;
import myplace.phuongcong.vn.myplace.data.User;
import myplace.phuongcong.vn.myplace.data.Users;
import myplace.phuongcong.vn.myplace.network.ApiService;
import myplace.phuongcong.vn.myplace.network.ApiUtils;

/**
 * Created by Ominext on 10/2/2017.
 */

public class RegisPresenter {
    private RegisView mRegisView;
    private ApiService mApiService;

    public RegisPresenter(RegisView mRegisView) {
        this.mRegisView = mRegisView;
        this.mApiService = ApiUtils.getIapiService();
    }

    public void creatUser(User newAcc) {
        mApiService.getListUser(Constants.SPREAD_SHEET_ID,newAcc).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onSuccess, this::onFail);
    }

    private void onFail(Throwable throwable) {
        String.valueOf(throwable);
    }

    private void onSuccess(Users users) {

    }
}
