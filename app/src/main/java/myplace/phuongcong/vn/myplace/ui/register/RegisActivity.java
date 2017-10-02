package myplace.phuongcong.vn.myplace.ui.register;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.OnClick;
import myplace.phuongcong.vn.myplace.R;
import myplace.phuongcong.vn.myplace.data.User;
import myplace.phuongcong.vn.myplace.ui.base.BaseActivity;
import myplace.phuongcong.vn.myplace.ui.login.LoginActivity;
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
    private String accName;
    private String accPass;


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
             accName = edtNameRegis.getText().toString().trim();
            accPass = edtPassRegis.getText().toString().trim();
            String accNumber = edtNumberRegis.getText().toString().trim();

            mRegisPresenter.creatUser(accName,accPass,accNumber);

        }
    }

    @Override
    public void onSiginSuccess() {
        Intent intent=new Intent(this, LoginActivity.class);
        intent.putExtra("name",accName);
        intent.putExtra("pass",accPass);
        startActivity(intent);
        finish();
    }

    @Override
    public void onfail(String s) {
        Toast.makeText(this,"fail",Toast.LENGTH_SHORT).show();
    }
}
