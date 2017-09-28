package myplace.phuongcong.vn.myplace.ui.login;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import myplace.phuongcong.vn.myplace.R;
import myplace.phuongcong.vn.myplace.network.ApiService;
import myplace.phuongcong.vn.myplace.network.ApiUtils;
import myplace.phuongcong.vn.myplace.ui.base.BaseActivity;
import myplace.phuongcong.vn.myplace.ui.register.RegisActivity;
import myplace.phuongcong.vn.myplace.ui.sheets.SheetActivity;


public class LoginActivity extends BaseActivity {
    private ApiService mApiService;
    @BindView(R.id.edt_input_acc)
    EditText edtInputAcc;
    @BindView(R.id.edt_input_pass)
    EditText edtInputPass;
    @BindView(R.id.rempasswordcheckbox)
    CheckBox rempasswordcheckbox;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.btn_register)
    Button btnRegister;
    @BindView(R.id.btn_quit)
    Button btnQuit;

    @Override
    protected int getContentLayoutID() {
        return R.layout.activity_login;

    }



    private void login() {
        mApiService= ApiUtils.getIapiService();
        String spreadsheetId = "1668tcfK7dGLm0QjVzLxhvrkgd4v7KD2lEKLF5ACF9Eg";
        String range = "acount!A2:E";//abcd là tên sheet+ phạm vi
        mApiService.getListUser(spreadsheetId,range).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onSuccess, this::onFail);
    }

    private void onFail(Throwable throwable) {
        Log.i("onFail: ",String.valueOf(throwable));
    }

    private void onSuccess(List<List<Object>> lists) {

    }

    @Override
    protected void initData() {
        login();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void injectDependence() {

    }

    @OnClick({R.id.btn_login, R.id.btn_register, R.id.btn_quit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                onStartActivity(SheetActivity.class);
                break;
            case R.id.btn_register:
                onStartActivity(RegisActivity.class);
                break;
            case R.id.btn_quit:
                break;
        }
    }
}
