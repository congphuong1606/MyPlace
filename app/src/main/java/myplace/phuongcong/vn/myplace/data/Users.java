package myplace.phuongcong.vn.myplace.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;


public class Users implements Serializable {

    @SerializedName("Users")
    @Expose
    private ArrayList<User> users = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Users() {
    }

    /**
     *
     * @param users
     */
    public Users(ArrayList<User> users) {
        super();
        this.users = users;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

}