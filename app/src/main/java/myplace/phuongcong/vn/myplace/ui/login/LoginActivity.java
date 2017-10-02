package myplace.phuongcong.vn.myplace.ui.login;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;
import myplace.phuongcong.vn.myplace.R;
import myplace.phuongcong.vn.myplace.common.Constants;
import myplace.phuongcong.vn.myplace.data.User;
import myplace.phuongcong.vn.myplace.ui.MainActivity;
import myplace.phuongcong.vn.myplace.ui.base.BaseActivity;
import myplace.phuongcong.vn.myplace.ui.register.RegisActivity;
import myplace.phuongcong.vn.myplace.ui.sheets.SheetDemoActivity;
import myplace.phuongcong.vn.myplace.utils.CheckInput;


public class LoginActivity extends BaseActivity implements LoginView{
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
    private LoginPresenter mLoginPresenter;
    private String accName;
    private String accPass;


    @Override
    protected int getContentLayoutID() {
        return R.layout.activity_login;

    }

    @Override
    protected void initData() {
        mLoginPresenter=new LoginPresenter(this);
    }



    @Override
    protected void injectDependence() {

    }

    @OnClick({R.id.btn_login, R.id.btn_register, R.id.btn_quit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                login();

                break;
            case R.id.btn_register:
                onStartActivity(RegisActivity.class);
                break;
            case R.id.btn_quit:
                onStartActivity(SheetDemoActivity.class);
                break;
        }
    }

    private void login() {
        if (CheckInput.checkInPutLogin(edtInputAcc, edtInputPass, this)) {
            accName = edtInputAcc.getText().toString().trim();
            accPass  = edtInputPass.getText().toString().trim();
            mLoginPresenter.onLoadListUser();

        }
    }

    @Override
    public void onLoadUsersSuccess(ArrayList<User> users) {
        boolean isLoginSuccess=false;
        for(User user:users){
            if(user.getAcount().equals(accName)&user.getPass().equals(accPass)){
                isLoginSuccess=true;
            }
            if(isLoginSuccess){
                break;
            }
        }
        if(isLoginSuccess){
            onStartActivity(MainActivity.class);
            finish();
        }else {
            Toast.makeText(this, Constants.LOGIN_FAIL,Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onRequestFail(String s) {

    }
}
