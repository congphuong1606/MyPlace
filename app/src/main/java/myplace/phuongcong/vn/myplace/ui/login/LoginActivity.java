package myplace.phuongcong.vn.myplace.ui.login;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.OnClick;
import myplace.phuongcong.vn.myplace.R;
import myplace.phuongcong.vn.myplace.ui.base.BaseActivity;
import myplace.phuongcong.vn.myplace.ui.register.RegisActivity;

public class LoginActivity extends BaseActivity {

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

    @Override
    protected void initData() {

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
                break;
            case R.id.btn_register:
                onStartActivity(RegisActivity.class);
                break;
            case R.id.btn_quit:
                break;
        }
    }
}
