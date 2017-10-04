package myplace.phuongcong.vn.myplace.ui.map;

import java.util.ArrayList;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import myplace.phuongcong.vn.myplace.data.MyLocation;
import myplace.phuongcong.vn.myplace.network.ApiService;
import myplace.phuongcong.vn.myplace.network.ApiUtils;

/**
 * Created by Ominext on 10/4/2017.
 */

public class MapPresenter {
    private ApiService mApiService;
    private MapView mapView;

    public MapPresenter(MapView mapView) {
        mApiService= ApiUtils.getIapiService();
        this.mapView = mapView;
    }

    public void getListLocation(String s) {
        mApiService.readLocation("read-location-user",s)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onLoadListLocationSuccess,this::onFail);
    }

    private void onFail(Throwable throwable) {
        mapView.onFail(String.valueOf(throwable));
    }

    private void onLoadListLocationSuccess(ArrayList<MyLocation> myLocations) {
        mapView.onLoadListLocationSuccess(myLocations);
    }
}
