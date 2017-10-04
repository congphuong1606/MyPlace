package myplace.phuongcong.vn.myplace.ui.map;

import java.util.ArrayList;

import myplace.phuongcong.vn.myplace.data.MyLocation;

/**
 * Created by Ominext on 10/4/2017.
 */

public interface MapView {
    void onLoadListLocationSuccess(ArrayList<MyLocation> myLocations);
    void onFail(String s);
}
