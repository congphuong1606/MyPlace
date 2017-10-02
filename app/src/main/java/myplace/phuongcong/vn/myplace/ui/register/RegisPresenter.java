package myplace.phuongcong.vn.myplace.ui.register;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import myplace.phuongcong.vn.myplace.network.ApiService;
import myplace.phuongcong.vn.myplace.network.ApiUtils;
import okhttp3.ResponseBody;

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

    public void creatUser(String accName, String accPass, String accNumber) {
        mApiService.creatUser("insert",accName,accPass,"",accNumber).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onSuccess, this::onFail);
    }

    private void onSuccess(ResponseBody responseBody) {
        mRegisView.onSiginSuccess();

    }

    private void onFail(Throwable throwable) {
       mRegisView.onfail( String.valueOf(throwable));
    }


}
