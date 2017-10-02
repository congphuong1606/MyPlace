package myplace.phuongcong.vn.myplace.network;

import io.reactivex.Observable;
import myplace.phuongcong.vn.myplace.data.User;
import myplace.phuongcong.vn.myplace.data.Users;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Ominext on 9/28/2017.
 */

public interface ApiService {

    @GET("exec")
    Observable<Users> getListUser(@Query("id") String spreadsheetId, @Query("sheet") User sheet) ;

    @POST("exec")
    void creatUser(@Query("id") String spreadsheetId,@Body User newAcc);
}
