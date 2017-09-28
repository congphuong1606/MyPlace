package myplace.phuongcong.vn.myplace.network;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Ominext on 9/28/2017.
 */

public interface ApiService {
    @GET("{spreadsheetId}/values/{range}")
    Observable<List<List<Object>>> getListUser(@Path("spreadsheetId") String spreadsheetId, @Path("range") String range) ;
}
