package myplace.phuongcong.vn.myplace.common;

import com.google.api.services.sheets.v4.SheetsScopes;

/**
 * Created by Ominext on 9/27/2017.
 */

public class Constants {
    public static final int MY_PERMISSIONS_REQUEST_LOCATION = 1;
    public static final int MY_PERMISSIONS_REQUEST_FHONE_CALL = 2;
    public static final int REQUEST_CHOOSE_PHOTO = 1;
    public static final int REQUEST_TAKE_PHOTO = 2;
    public static final String BASE_URL = "https://script.google.com/macros/s/AKfycbxOLElujQcy1-ZUer1KgEvK16gkTLUqYftApjNCM_IRTL3HSuDk/";
    public static final int REQUEST_ACCOUNT_PICKER = 1000;
    public static final int REQUEST_AUTHORIZATION = 1001;
    public static final int REQUEST_GOOGLE_PLAY_SERVICES = 1002;
    public static final int REQUEST_PERMISSION_GET_ACCOUNTS = 1003;

    public static final String BUTTON_TEXT = "Call Google Sheets API";
    public static final String PREF_ACCOUNT_NAME = "accountName";
    public static final String[] SCOPES = {SheetsScopes.SPREADSHEETS};

    public static final String SPREAD_SHEET_ID = "1668tcfK7dGLm0QjVzLxhvrkgd4v7KD2lEKLF5ACF9Eg";
    public static final  String SHEET_USER= "Users";
    public static final String LOGIN_FAIL="acc or pass incorect!";
}
