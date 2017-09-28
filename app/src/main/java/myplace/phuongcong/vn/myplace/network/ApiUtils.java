package myplace.phuongcong.vn.myplace.network;

import myplace.phuongcong.vn.myplace.common.Constants;

/**
 * Created by MyPC on 02/08/2017.
 */

public class ApiUtils {

    private ApiUtils() {

    }

    public static ApiService getIapiService() {
        return RetrofitClient.getClient(Constants.BASE_URL).create(ApiService.class);
    }
}