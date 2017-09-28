package myplace.phuongcong.vn.myplace.ui.register;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.OnClick;
import myplace.phuongcong.vn.myplace.R;
import myplace.phuongcong.vn.myplace.ui.base.BaseActivity;

public class RegisActivity extends BaseActivity {
    @BindView(R.id.edt_name_regis)
    EditText edtNameRegis;
    @BindView(R.id.edt_pass_regis)
    EditText edtPassRegis;
    @BindView(R.id.edt_number_regis)
    EditText edtNumberRegis;
    @BindView(R.id.btn_sigup)
    Button btnSigup;
    @BindView(R.id.btn_back_login)
    Button btnBackLogin;


    @Override
    protected int getContentLayoutID() {
        return R.layout.activity_regis;
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


    @OnClick({R.id.btn_sigup, R.id.btn_back_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_sigup:
                break;
            case R.id.btn_back_login:
                finish();
                break;
        }
    }
}
