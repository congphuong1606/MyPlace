package myplace.phuongcong.vn.myplace.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ominext on 10/4/2017.
 */

public class MyLocation {

    @SerializedName("lat")
    @Expose
    private Float lat;
    @SerializedName("lng")
    @Expose
    private Float lng;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("createTime")
    @Expose
    private String createTime;
    @SerializedName("updateTime")
    @Expose
    private String updateTime;

    /**
     * No args constructor for use in serialization
     *
     */
    public MyLocation() {
    }

    /**
     *
     * @param createTime
     * @param updateTime
     * @param name
     * @param lng
     * @param lat
     */
    public MyLocation(Float lat, Float lng, String name, String createTime, String updateTime) {
        super();
        this.lat = lat;
        this.lng = lng;
        this.name = name;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLng() {
        return lng;
    }

    public void setLng(Float lng) {
        this.lng = lng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
