package myplace.phuongcong.vn.myplace.network;

import io.reactivex.Observable;
import myplace.phuongcong.vn.myplace.common.Constants;
import myplace.phuongcong.vn.myplace.data.User;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Ominext on 9/28/2017.
 */

public interface ApiService {

    @GET(Constants.API_USER+"/exec")
    Observable<User> login(@Query("action") String read, @Query("name") String name,@Query("pass") String pass);

    @GET(Constants.API_USER+"/exec")
    Observable<ResponseBody> creatUser(@Query("action") String insert, @Query("name") String accName,
                                       @Query("pass") String accPass, @Query("email") String s,
                                       @Query("number") String accNumber);
}
