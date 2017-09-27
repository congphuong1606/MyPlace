/*
package myplace.phuongcong.vn.myplace.utils;

import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;

import com.google.android.gms.location.LocationListener;
import com.google.android.gms.maps.LocationSource;

*/
/**
 * Created by Ominext on 9/27/2017.
 *//*


public class FollowMeLocationSource implements LocationSource, LocationListener {
    private OnLocationChangedListener mListener;
    private LocationManager locationManager;
    private final Criteria criteria = new Criteria();
    private String bestAvailableProvider;
    */
/* Updates are restricted to one every 10 seconds, and only when
     * movement of more than 10 meters has been detected.*//*

    private final int minTime = 10000;     // minimum time interval between location updates, in milliseconds
    private final int minDistance = 10;    // minimum distance between location updates, in meters

    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void activate(OnLocationChangedListener onLocationChangedListener) {

    }

    @Override
    public void deactivate() {

    }
    private FollowMeLocationSource(){
        locationManager = (LocationManager) mContext.getSystemService(Context.LOCATION_SERVICE);

        // Specify Location Provider criteria
        criteria.setAccuracy(Criteria.ACCURACY_FINE);
        criteria.setPowerRequirement(Criteria.POWER_LOW);
        criteria.setAltitudeRequired(true);
        criteria.setBearingRequired(true);
        criteria.setSpeedRequired(true);
        criteria.setCostAllowed(true);
    }
}
*/
