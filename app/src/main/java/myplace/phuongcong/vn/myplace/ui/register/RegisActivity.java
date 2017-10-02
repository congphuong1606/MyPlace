package myplace.phuongcong.vn.myplace.ui.register;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.OnClick;
import myplace.phuongcong.vn.myplace.R;
import myplace.phuongcong.vn.myplace.data.User;
import myplace.phuongcong.vn.myplace.ui.base.BaseActivity;
import myplace.phuongcong.vn.myplace.utils.CheckInput;

public class RegisActivity extends BaseActivity implements RegisView {
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
    private User newAcc;
    private RegisPresenter mRegisPresenter;


    @Override
    protected int getContentLayoutID() {
        return R.layout.activity_regis;
    }

    @Override
    protected void initData() {
           mRegisPresenter=new RegisPresenter(this);
    }



    @Override
    protected void injectDependence() {

    }


    @OnClick({R.id.btn_sigup, R.id.btn_back_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_sigup:
                regis();
                break;
            case R.id.btn_back_login:
                finish();
                break;
        }
    }

    private void regis() {
        if (CheckInput.checkInPutRegis(edtNameRegis,edtNumberRegis, edtPassRegis, this)) {
            String accName = edtNameRegis.getText().toString().trim();
            String accPass = edtPassRegis.getText().toString().trim();
            String accNumber = edtNumberRegis.getText().toString().trim();
            newAcc = new User(accName,accName,accName,accPass,accNumber);
            mRegisPresenter.creatUser(newAcc);

        }
    }
}
