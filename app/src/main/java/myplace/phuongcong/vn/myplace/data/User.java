package myplace.phuongcong.vn.myplace.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class User implements Serializable {
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("pass")
    @Expose
    private String pass;
    @SerializedName("number")
    @Expose
    private Long number;
    @SerializedName("timeCreat")
    @Expose
    private String timeCreat;
    @SerializedName("timeUpdate")
    @Expose
    private String timeUpdate;

    /**
     * No args constructor for use in serialization
     *
     */
    public User() {
    }

    public User(Long id, String name, String email, String pass, Long number) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.number = number;
    }

    /**
     *
     * @param id
     * @param timeUpdate
     * @param email
     * @param name
     * @param number
     * @param timeCreat
     * @param pass
     */
    public User(Long id, String name, String email, String pass, Long number, String timeCreat, String timeUpdate) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.number = number;
        this.timeCreat = timeCreat;
        this.timeUpdate = timeUpdate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getTimeCreat() {
        return timeCreat;
    }

    public void setTimeCreat(String timeCreat) {
        this.timeCreat = timeCreat;
    }

    public String getTimeUpdate() {
        return timeUpdate;
    }

    public void setTimeUpdate(String timeUpdate) {
        this.timeUpdate = timeUpdate;
    }

}