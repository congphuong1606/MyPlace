package myplace.phuongcong.vn.myplace.network;

import java.util.ArrayList;

import io.reactivex.Observable;
import myplace.phuongcong.vn.myplace.data.MyLocation;
import myplace.phuongcong.vn.myplace.data.User;
import myplace.phuongcong.vn.myplace.data.dto.Result;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Ominext on 9/28/2017.
 */

public interface ApiService {

    @GET("exec")
    Observable<User> login(@Query("action") String read, @Query("name") String name,@Query("pass") String pass);
    @GET("exec")
    Observable<ArrayList<MyLocation>> readLocation(@Query("action") String readLocation, @Query("userId") String userId);
    @POST("exec")
    Observable<Result> insertLocation(@Query("action") String read, @Query("userId") String userId, @Query("lat") String lat, @Query("lng") String lng,@Query("name") String name);
    @GET("exec")
    Observable<ResponseBody> creatUser(@Query("action") String insert, @Query("name") String accName,
                                       @Query("pass") String accPass, @Query("email") String s,
                                       @Query("number") String accNumber);
}
